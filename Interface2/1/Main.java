//6610450951 ต้นตะวัน จันทร์ไทย
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Measurable> cars = new ArrayList<>();
        List<Measurable> products = new ArrayList<>();
    
        cars.add(new Car("ABC123", 50000));
        cars.add(new Car("XYZ789", 70000));

        products.add(new Product("Laptop", 1500));
        products.add(new Product("Phone", 800));


        double maxKilo = StatUtil.max(cars);
        System.out.println("Max Kilometers: " + maxKilo);

        double maxPrice = StatUtil.max(products);
        System.out.println("Max price: " + maxPrice);
    }
}