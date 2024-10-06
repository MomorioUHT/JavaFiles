//6610450951 ต้นตะวัน จันทร์ไทย
public class ProductPriceMeasurer implements Measurer{
    public double measure(Object x) {
        Product product = (Product)x;
        return product.getPrice();
    }
}
