//6610450951 ต้นตะวัน จันทร์ไทย
import java.util.Scanner;

public class MainProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SWConEmailSystem system = new SWConEmailSystem("users.csv", "emails.csv");
        String command;

        System.out.println("=========== SWCon Email System ===========");
        while (true) {
            System.out.print("------> Command [Log I)n S)end R)ead Log O)ut Q)uit]: ");
            command = scanner.nextLine().toUpperCase();
            
            switch (command) {
                case "I":
                    System.out.print("Username: ");
                    String username = scanner.nextLine();
                    system.login(username);
                    break;
                case "S":
                    if (system.getCurrentUser() == null) {
                        System.out.println("You must login first!");
                        break;
                    }
                    System.out.print("Enter recipient: ");
                    String recipient = scanner.nextLine();
                    System.out.print("Enter text: ");
                    String text = scanner.nextLine();
                    system.sendEmail(recipient, text);
                    break;
                case "R":
                    if (system.getCurrentUser() == null) {
                        System.out.println("You must login first!");
                        break;
                    }
                    system.readEmails();
                    break;
                case "O":
                    system.logout();
                    break;
                case "Q":
                    scanner.close();
                    System.out.println("=========== Good Bye ! ===========");
                    return;
                default:
                    System.out.println("Invalid command.");
                    break;
            }
        }
    }
}
