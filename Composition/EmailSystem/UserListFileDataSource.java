//6610450951 ต้นตะวัน จันทร์ไทย
import java.io.*;
import java.nio.charset.StandardCharsets;

public class UserListFileDataSource implements Datasource<UserList> {
    private String filePath;

    public UserListFileDataSource(String filePath) {
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
    public UserList readData() {
        UserList users = new UserList();
        File file = new File(filePath);

        try (BufferedReader buffer = new BufferedReader(new InputStreamReader(new FileInputStream(file), StandardCharsets.UTF_8))){

            String line;
            while ((line = buffer.readLine()) != null){
                if (line.trim().isEmpty()) continue;

                String username = line.trim();

                users.addUser(new User(username));
            }
        } catch (IOException e){
            System.err.println("Error reading file: " + filePath);
        }
        return users;        
    }

    @Override
    public void writeData(UserList data) {
        File file = new File(filePath);

        try (BufferedWriter buffer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), StandardCharsets.UTF_8))){
            for (User x: data.getUsers()) {
                String line = x.getUsername();
                buffer.write(line);
                buffer.newLine();
            }
        } catch (IOException e){
            System.err.println("Error writing to file: " + filePath);
        }
    }        
}
