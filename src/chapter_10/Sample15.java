package chapter_10;

public class Sample15 {
    int[] values;
    public double getValueForPeriod(int periodNumber) {
        if (periodNumber >= values.length) return 0;
        return values[periodNumber];
    }
}
