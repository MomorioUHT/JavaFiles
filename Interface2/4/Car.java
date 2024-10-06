//6610450951 ต้นตะวัน จันทร์ไทย
public class Car {
    private String license;
    private double kiloDriven; 

    public Car(String license, double kiloDriven) {
        this.license = license;
        this.kiloDriven = kiloDriven;
    }

    public double getKiloDriven() {
        return kiloDriven;
    }

    public String getLicence() {
        return license;
    }
}
