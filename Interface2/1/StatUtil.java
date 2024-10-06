//6610450951 ต้นตะวัน จันทร์ไทย
import java.util.List;

public class StatUtil {
    public static double max(List<Measurable> arr) {
        double max = 0;
        for (Measurable x : arr) {
            if (x.getMeasure() > max) {
                max = x.getMeasure();
            }
        }
        return max;
    }
}
