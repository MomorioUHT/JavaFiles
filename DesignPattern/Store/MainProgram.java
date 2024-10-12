//6610450951 ต้นตะวัน จันทร์ไทย
public class MainProgram {
    public static void main(String[] args) {
        Store store = new Store();
        store.addProduct("Big Java", 300, 5);
        store.addProduct("Da Vinci Code", 120, 0);
        store.addProduct("Python 101", 200, 10);        

        int TotalNumberOfProducts = store.countProducts(new CountAllProducts());
        int ProductInStock = store.countProducts(new CountProductInStock());
        int TotalQuantityProducts = store.countProducts(new CountProductQuantity());

        System.out.println("Total number of products: " + TotalNumberOfProducts);
        System.out.println("Number of products in stock: " + ProductInStock);
        System.out.println("Total quantity of products: " + TotalQuantityProducts);
    }
}
