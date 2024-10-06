//6610450951 ต้นตะวัน จันทร์ไทย
import java.util.Scanner;

public class MainProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Invoice invoice = new Invoice("Sam's Small Appliances", "100 Main Street\nAnytown, CA 98765");

        System.out.print("How many items do you want to add? ");
        int numberOfItems = scanner.nextInt();
        scanner.nextLine(); 

        for (int i = 0; i < numberOfItems; i++) {
            System.out.print("Enter the item description: ");
            String description = scanner.nextLine();

            System.out.print("Enter the price of the item: ");
            double price = scanner.nextDouble();

            System.out.print("Enter the quantity of the item: ");
            int quantity = scanner.nextInt();
            scanner.nextLine(); 

            Item item = new Item(description, price, quantity);
            invoice.addItem(item);
        }

        invoice.printInvoice();

        scanner.close();
    }
}
