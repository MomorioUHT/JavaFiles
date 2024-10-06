//6610450951 ต้นตะวัน จันทร์ไทย
public class Main {
    public static void main(String[] args) {
        CarList cars = new CarList();
        ProductList products = new ProductList();

        cars.addCars("ABC123", 50000);
        cars.addCars("XYZ789", 70000);
        cars.addCars("TRC621", 20000);
        cars.addCars("GHE203", 10000);

        products.addProduct("Laptop", 1500);
        products.addProduct("Phone", 800);
        products.addProduct("Watch", 20);
        products.addProduct("TV", 500);

        CarDistanceComparator cdc = new CarDistanceComparator();
        cars.sort(cdc);

        System.out.println("===== Cars sorted by distance ======");
        for (Car x: cars.getCars()) {
            System.out.println(x.getLicence() + " " + x.getKiloDriven());
        }

        CarLicenseComparator clc = new CarLicenseComparator();
        cars.sort(clc);

        System.out.println("===== Cars sorted by license ======");
        for (Car x: cars.getCars()) {
            System.out.println(x.getLicence() + " " + x.getKiloDriven());
        }

        //============================================================

        ProductNameComparator pnc = new ProductNameComparator();
        products.sort(pnc);

        System.out.println("===== Products sorted by name ======");
        for (Product x: products.getProducts()) {
            System.out.println(x.getName() + " " + x.getPrice());
        }

        ProductPriceComparator ppc = new ProductPriceComparator();
        products.sort(ppc);

        System.out.println("===== Products sorted by price ======");
        for (Product x: products.getProducts()) {
            System.out.println(x.getName() + " " + x.getPrice());
        }
    
        //END
    }
}