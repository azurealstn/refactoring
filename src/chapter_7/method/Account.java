package chapter_7.method;

public class Account {
    private AccountType type;
    private int daysOverdrawn;

    public double overdraftCharge() {
        return type.overdraftCharge(daysOverdrawn);
    }

    public double bankCharge() {
        double result = 4.5;
        if (daysOverdrawn > 0) {
            result += overdraftCharge();
        }
        return result;
    }
}
