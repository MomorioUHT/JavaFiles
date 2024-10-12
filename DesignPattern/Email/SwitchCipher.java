//6610450951 ต้นตะวัน จันทร์ไทย
public class SwitchCipher implements Encrypter {
    @Override
    public String encrypt(String text) {
        char[] data = text.toCharArray();
        for (int i = 0; i < data.length - 1; i += 2) {
            char tmp = data[i];
            data[i] = data[i + 1];
            data[i + 1] = tmp;
        }
        return new String(data);
    }
}