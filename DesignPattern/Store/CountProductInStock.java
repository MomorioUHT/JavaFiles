//6610450951 ต้นตะวัน จันทร์ไทย
import java.util.List;

public class CountProductInStock implements Counter {
    @Override
    public int count(List<Product> products) {
        int count = 0;
        for (Product prod : products) {
            if (prod.getQuantity() > 0)
                count += 1;
        }
        return count;
    }
}
