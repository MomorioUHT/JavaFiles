//6610450951 ต้นตะวัน จันทร์ไทย
public class StatUtil {
    public static double max(Object[] arr, Measurer meas) {
        double max = 0;
        for (Object x : arr) {
            if (meas.measure(x) > max) {
                max = meas.measure(x);
            }
        }
        return max;
    }
}
