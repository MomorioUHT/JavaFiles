//6610450951 ต้นตะวัน จันทร์ไทย
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        List<Product> products = new ArrayList<>();
    
        cars.add(new Car("ABC123", 50000));
        cars.add(new Car("XYZ789", 70000));

        products.add(new Product("Laptop", 1500));
        products.add(new Product("Phone", 800));


        double maxKilo = StatUtil.max(cars.toArray(), new CarDistanceMeasurer());
        System.out.println("Max Kilometers: " + maxKilo);

        double maxPrice = StatUtil.max(products.toArray(), new ProductPriceMeasurer());
        System.out.println("Max price: " + maxPrice);
    }
}