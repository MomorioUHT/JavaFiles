//6610450951 ต้นตะวัน จันทร์ไทย
import java.io.*;
import java.nio.charset.StandardCharsets;

public class EmailListFileDataSource implements Datasource<EmailList> {
    private String filePath;

    public EmailListFileDataSource(String filePath) {
        this.filePath = filePath;
        checkFileIsExisted();
    }

    private void checkFileIsExisted(){
        File file = new File(filePath);
        if (!file.exists()){
            try {
                File parentDir = file.getParentFile();
                if (parentDir != null && !parentDir.exists()){
                    parentDir.mkdirs();
                }
                file.createNewFile();
            } catch (IOException e){
                System.err.println("Error creating file: " + filePath);
            }
        }
    }

    @Override
    public EmailList readData() {
        EmailList emails = new EmailList();
        File file = new File(filePath);

        try (BufferedReader buffer = new BufferedReader(new InputStreamReader(new FileInputStream(file), StandardCharsets.UTF_8))){

            String line;
            while ((line = buffer.readLine()) != null){
                if (line.trim().isEmpty()) continue;

                String [] data = line.split(",");

                String senderName = data[0].trim();
                String receiverName = data[1].trim();
                String content = data[2].trim();

                User sender = new User(senderName);
                User receiver = new User(receiverName);
                Email x = new Email(sender, receiver, content);

                emails.addEmail(x);
            }
        } catch (IOException e){
            System.err.println("Error reading file: " + filePath);
        }

        return emails;        
    }

    @Override
    public void writeData(EmailList data) {
        File file = new File(filePath);

        try (BufferedWriter buffer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), StandardCharsets.UTF_8))){
            for (Email x: data.getEmails()) {
                String line = String.join(",", x.getSender().getUsername(), x.getReceiver().getUsername(), x.getContent());
                buffer.write(line);
                buffer.newLine();
            }
        } catch (IOException e){
            System.err.println("Error writing to file: " + filePath);
        }
    }   
}
