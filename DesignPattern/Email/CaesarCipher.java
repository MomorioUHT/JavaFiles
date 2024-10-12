//6610450951 ต้นตะวัน จันทร์ไทย
public class CaesarCipher implements Encrypter {
    private int key;

    public CaesarCipher(int key) {
        this.key = key;
    }

    @Override
    public String encrypt(String text) {
        char[] data = text.toCharArray();

        for (int i = 0; i < data.length; i++) {
            data[i] = (char)(data[i] + key);
        }

        return new String(data);
    }
}