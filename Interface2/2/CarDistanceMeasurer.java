//6610450951 ต้นตะวัน จันทร์ไทย
public class CarDistanceMeasurer implements Measurer {
    public double measure(Object x) {
        Car car = (Car)x;
        return car.getKiloDriven();
    }
}
