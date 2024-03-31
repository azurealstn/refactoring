package chapter_2;

public class Sample1 {
    public void printOwing(double amount) {
        printBanner();
        amount = getAmount(amount);
        printDetails(amount);
    }

    private double getAmount(double amount) {
        for (int i = 1; i <= 5; i++) {
            amount *= i;
        }
        return amount;
    }

    private void printDetails(double amount) {
        System.out.println("name: " + "Mike");
        System.out.println("amount: " + amount);
    }

    private void printBanner() {
        System.out.println("printBanner()");
    }
}
