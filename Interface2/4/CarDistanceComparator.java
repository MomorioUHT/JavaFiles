//6610450951 ต้นตะวัน จันทร์ไทย
import java.util.Comparator;

public class CarDistanceComparator implements Comparator<Car> {
    @Override
    public int compare(Car c1, Car c2) {
        return (int)(c1.getKiloDriven() - c2.getKiloDriven());
    }
}
