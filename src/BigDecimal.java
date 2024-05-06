import java.math.BigDecimal;

class Main {
    public static void main(String[] args) {
        BigDecimal input1 = new BigDecimal("1.2345");
        BigDecimal input2 = new BigDecimal("-45.67");

        System.out.println(reverseSignAndRoundToNearestTenth(input1)); // Output: -1.2
        System.out.println(reverseSignAndRoundToNearestTenth(input2)); // Output: 45.7
    }

    public static BigDecimal reverseSignAndRoundToNearestTenth(BigDecimal value) {
        // Reverse the sign
        BigDecimal reversed = value.negate();

        // Round to the nearest tenth
        BigDecimal rounded = reversed.setScale(1, BigDecimal.ROUND_HALF_UP);

        return rounded;
    }
}