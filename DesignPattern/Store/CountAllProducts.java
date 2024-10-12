//6610450951 ต้นตะวัน จันทร์ไทย
import java.util.List;

public class CountAllProducts implements Counter {
    @Override
    public int count(List<Product> products) {
        return products.size();
    }
}
