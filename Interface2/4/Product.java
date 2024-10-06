//6610450951 ต้นตะวัน จันทร์ไทย
public class Product {
    private String name;
    private double price; 

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
    public String getName() {
        return name;
    }
}
