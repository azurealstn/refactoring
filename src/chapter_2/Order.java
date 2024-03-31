package chapter_2;

public class Order {
    public double price() {
        return new PriceCalculator().compute();
    }

    static class PriceCalculator {
        double primaryBasePrice;
        double secondaryBasePrice;
        double tertiaryBasePrice;

        public double compute() {
            // 계산 로직 ...
        }
    }
}
