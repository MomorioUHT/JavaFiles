import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Read2 {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("inputNumbers.txt");
            BufferedReader br = new BufferedReader(fr);

            String line = br.readLine();
            
            double sum = 0;
            int count = 0;

            while (line != null) {
                sum += Double.parseDouble(line);
                count++;
                line = br.readLine();
            }

            double average;
            if (count != 0) {
                average = sum/count;
            } else {
                average = 0;
            }

            System.out.println("Average from file calculation is -> " + average);

            br.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        } catch (IOException e) {
            System.out.println("Error reading from file!");
        }
    }
}
