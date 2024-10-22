public class ConditionalPromotion implements Promotion {
    private double discountAmount;
    private double minimumValue;

    public ConditionalPromotion(double x, double y) {
        this.discountAmount = x;
        this.minimumValue = y;
    }

    public double discount(double price) {
        if (price >= minimumValue) {
            return discountAmount;
        }
        return 0;
    }
}
