//6610450951 ต้นตะวัน จันทร์ไทย
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CarList {
    private ArrayList<Car> cars;

    public CarList() {
        cars = new ArrayList<>();
    }

    public void addCars(String license, int kiloDriven) {
        cars.add(new Car(license, kiloDriven));
    }

    public void sort(Comparator<Car> cmp) {
        Collections.sort(cars, cmp);
    }

    public ArrayList<Car> getCars() {
        return cars;
    }
}
