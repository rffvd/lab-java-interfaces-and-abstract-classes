import java.math.BigDecimal;

class Main2 {
    public static void main(String[] args) {
        BigDecimal input = new BigDecimal("4.2545");
        double roundedValue = roundToNearestHundredth(input);
        System.out.println(roundedValue);
    }

    public static double roundToNearestHundredth(BigDecimal value) {
        return value.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
    }
}