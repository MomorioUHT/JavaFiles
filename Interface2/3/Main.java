//6610450951 ต้นตะวัน จันทร์ไทย
public class Main {
    public static void sort(Comparable[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            int minPos = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j].compareTo(a[minPos]) < 0) {
                    minPos = j;
                }
            }   
            Comparable temp = a[minPos];
            a[minPos] = a[i];
            a[i] = temp;
        }
    }

    public static void main(String[] args) {
        Car[] cars = new Car[4];
        Product[] products = new Product[4];
    
        cars[0] = new Car("ABC123", 50000);
        cars[1] = new Car("XYZ789", 70000);
        cars[2] = new Car("TRC621", 20000);
        cars[3] = new Car("GHE203", 10000);

        products[0] = new Product("Laptop", 1500);
        products[1] = new Product("Phone", 800);
        products[2] = new Product("Watch", 20);
        products[3] = new Product("TV", 500);

        sort(cars);
        sort(products);

        System.out.println("===== Cars ======");
        for (int i = 0; i < 4; i++) {
            System.out.println(cars[i].getLicence() + " " + cars[i].getKiloDriven());
        }

        System.out.println("===== Products ======");
        for (int i = 0; i < 4; i++) {
            System.out.println(products[i].getName() + " " + products[i].getPrice());
        }
    }
}