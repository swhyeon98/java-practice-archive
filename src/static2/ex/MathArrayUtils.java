package static2.ex;

public class MathArrayUtils {

    private MathArrayUtils() {}

    public static int sum(int[] values) {
        int sum = 0;
        for (int value : values) {
            sum += value;
        }
        return sum;
    }

    public static double average(int[] values) {
        int sum = 0;
        for (int value : values) {
            sum += value;
        }
        return (double) sum / values.length;
    }

    public static int min(int[] values) {
        int min = Integer.MAX_VALUE;
        for (int value : values) {
            if (min > value) {
                min = value;
            }
        }
        return min;
    }

    public static int max(int[] values) {
        int max = 0;
        for (int value : values) {
            if (max < value) {
                max = value;
            }
        }
        return max;
    }
}
