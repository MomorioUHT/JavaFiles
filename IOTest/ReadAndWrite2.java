import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class ReadAndWrite2 {
    public static void main(String[] args) {
        try {
            //Reads input from user keyboard System in
            InputStreamReader inp = new InputStreamReader(System.in);
            BufferedReader bf = new BufferedReader(inp);

            //Define output file to print to
            FileWriter fw = new FileWriter("output2.txt");
            PrintWriter pw = new PrintWriter(fw);

            System.out.println("Please input numbers (double or int is ok)");
            String line = bf.readLine();

            double sum = 0;
            int count = 0;

            while (!line.equals("-1")) {
                double temp = Double.parseDouble(line);
                sum += temp;
                count++;

                int currIndex = count+1;
                pw.println("Number #" + currIndex + " = " + temp);

                line = bf.readLine();
            }

            double average;
            if (count == 0) {
                average = 0;
            } else {
                average = sum/count;
            }

            pw.println("Total sum = " + sum);
            pw.println("Average is " + average);

            pw.flush();
            pw.close();
        } catch (IOException e) {
            System.out.println("Error reading input from user");
        } finally {
            System.out.println("Program Exit");
        }
    }
}
 