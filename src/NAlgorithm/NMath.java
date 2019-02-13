package NAlgorithm;

public class NMath {
    public static final String __name__ = "NMath";
    public static long power(long base, long time) {
        if (time == 0)
            return 1;
        long ans = 1;
        while (time > 0) {
            if (time % 2 == 1)
                ans *= base;
            base *= base;
            time /= 2;
        }
        return ans;
    }
}