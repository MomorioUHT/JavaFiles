//6610450951 ต้นตะวัน จันทร์ไทย
import java.util.Comparator;

public class CarLicenseComparator implements Comparator<Car>{
    @Override
    public int compare(Car c1, Car c2) {
        return c1.getLicence().compareTo(c2.getLicence());
    }
}
