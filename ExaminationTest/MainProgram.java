import java.util.ArrayList;

public class MainProgram {
    public static void main(String[] args) {
        ArrayList<Promotion> promotions = new ArrayList<>();
        promotions.add(new CuponPromotion(150));
        promotions.add(new CuponPromotion(50));
        promotions.add(new PercentagePromotion(10));
        promotions.add(new ConditionalPromotion(300, 3000));

        PromotionManager pm = new PromotionManager();
        double finalPrice = pm.ApplyPromotions(promotions, 5000);

        System.out.println(finalPrice);
    }
}