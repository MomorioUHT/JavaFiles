import java.util.ArrayList;

public class PromotionManager {
    public double ApplyPromotions(ArrayList<Promotion> promotions, double price) {
        double discountedPrice = price;
        for (Promotion x: promotions) {
            discountedPrice -= x.discount(discountedPrice);
        }
        return discountedPrice;
    }
}