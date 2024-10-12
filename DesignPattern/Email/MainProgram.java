//6610450951 ต้นตะวัน จันทร์ไทย
public class MainProgram {
    public static void main(String[] args) {
        Email email1 = new Email("Kwan", "Kate", "Hello");
        Email email2 = new Email("George", "Ken", "Hi");

        EmailSystem emailSystem = new EmailSystem();

        Encrypter caesarCipher = new CaesarCipher(3);
        Encrypter switchCipher = new SwitchCipher();

        emailSystem.sendEmail(email1, caesarCipher); 
        emailSystem.sendEmail(email2, switchCipher);
    }
}
