//6610450951 ต้นตะวัน จันทร์ไทย
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ProductList {
    private ArrayList<Product> products;

    public ProductList() {
        products = new ArrayList<>();
    }

    public void addProduct(String name, double price) {
        products.add(new Product(name, price));
    }

    public void sort(Comparator<Product> cmp) {
        Collections.sort(products, cmp);
    }

    public ArrayList<Product> getProducts() {
        return products;
    }    
}
