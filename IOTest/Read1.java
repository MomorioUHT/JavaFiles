import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Read1 {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("inputWords.txt");
            BufferedReader br = new BufferedReader(fr);

            String line = br.readLine();
            while (line != null) {
                System.out.println("Read line -> " + line);
                line = br.readLine();
            }

            fr.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        } catch (IOException e) {
            System.out.println("Error reading from file");
        } finally {
            System.out.println("Program Exit");
        }
    
    }
}