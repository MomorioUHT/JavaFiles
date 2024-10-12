//6610450951 ต้นตะวัน จันทร์ไทย
import java.util.List;

public class CountProductQuantity implements Counter {
    @Override
    public int count(List<Product> products) {
        int count = 0;
        for (Product prod : products) {
           count += prod.getQuantity();
        }
        return count;
    }
}
