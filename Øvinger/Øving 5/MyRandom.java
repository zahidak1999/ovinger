import java.util.Random;

public class MyRandom {

    private Random random = new Random();

    /* Lager metodene for random tall */
    public int nextWholeNumber(int lower, int upper) {
        int max = (upper) - lower;
        return (random.nextInt(max) + lower);
    }

    public double nextDecimalNumber(double lower, double upper) {
        double max = upper - lower;
        return random.nextDouble(max) + lower;

    }
}
