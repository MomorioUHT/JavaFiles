public class CuponPromotion implements Promotion {
    double discountAmount;

    public CuponPromotion(double x) {
        this.discountAmount = x;
    }

    public double discount(double price) {
        return discountAmount;
    }
}
