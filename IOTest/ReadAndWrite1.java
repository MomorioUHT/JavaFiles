import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class ReadAndWrite1 {
    public static void main(String[] args) {
        try {
            //Reads from user input system in per line
            InputStreamReader inp = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(inp);

            //Write to file
            FileWriter fw = new FileWriter("output1.txt");
            PrintWriter pw = new PrintWriter(fw);

            System.out.println("Please input text to print to file");
            String line = br.readLine();

            while (!line.equals("EXIT")) {
                pw.println("----> " + line);
                line = br.readLine();
            }

            pw.flush();
            pw.close();
        } catch (IOException e) {
            System.out.println("Error reading from user");
        } finally {
            System.out.println("Program Exit");
        }
    }
}
