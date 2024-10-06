//6610450951 ต้นตะวัน จันทร์ไทย
public class Car implements Comparable {
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

    @Override
    public int compareTo(Object other){
        Car othercar = (Car)other;
        return (int)(this.kiloDriven - othercar.kiloDriven);
    }
}
