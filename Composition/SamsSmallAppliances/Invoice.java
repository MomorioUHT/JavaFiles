//6610450951 ต้นตะวัน จันทร์ไทย
import java.util.ArrayList;

public class Invoice {
    private String storeName;
    private String address;
    private ArrayList<Item> items;

    public Invoice(String storeName, String address) {
        this.storeName = storeName;
        this.address = address;
        this.items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void printInvoice() {
        System.out.println(" ");
        System.out.println("I N V O I C E");
        System.out.println(storeName);
        System.out.println(address);
        System.out.println(" ");

        System.out.println("Description\tPrice\tQty\tSubtotal");
        
        double total = 0.0;
        for (Item item : items) {
            System.out.printf("%-12s\t$%.2f\t%d\t$%.2f\n", 
                item.getDescription(), item.getPrice(), item.getQuantity(), item.getSubtotal());
            total += item.getSubtotal();
        }
        
        System.out.println(" ");
        System.out.printf("TOTAL TO PAY: $%.2f\n", total);
        System.out.println(" ");
    }
}
