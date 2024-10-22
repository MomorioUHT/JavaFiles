public class PercentagePromotion implements Promotion{
    private double percentage;

    public PercentagePromotion(double x) {
        this.percentage = x;
    }

    public double discount(double price) {
        return (percentage / 100) * price;
    }
}
