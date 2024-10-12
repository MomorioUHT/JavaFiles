//6610450951 ต้นตะวัน จันทร์ไทย
import java.util.HashMap;
import java.util.List;

public class EmailSystem {
    private HashMap<String, List<Email>> mailboxes;

    public void sendEmail(Email m, Encrypter encrypter) {
        String encryptedText = encrypter.encrypt(m.getText());
        m.setText(encryptedText);

        List<Email> box = mailboxes.get(m.getRecipient());
        box.add(m);
    }
} 
