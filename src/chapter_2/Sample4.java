package chapter_2;

public class Sample4 {
    public double calcBasePrice(double quantity, double itemPrice) {
        return discountFactor(basePrice(quantity, itemPrice));
    }

    private static double discountFactor(double basePrice) {
        if (basePrice > 1000) {
            return basePrice * 0.95;
        } else {
            return basePrice * 0.98;
        }
    }

    private double basePrice(double quantity, double itemPrice) {
        return quantity * itemPrice;
    }
}
