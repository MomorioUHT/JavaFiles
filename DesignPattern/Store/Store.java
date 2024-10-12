//6610450951 ต้นตะวัน จันทร์ไทย
import java.util.ArrayList;
import java.util.List;

public class Store {
    private List<Product> products;
    public Store() { 
        products = new ArrayList<>(); 
    }

    public void addProduct(String name, double price, int quantity) {
        products.add(new Product(name, price, quantity));
    }

    public int countProducts(Counter counter) {
        return counter.count(products);
    }
} 
