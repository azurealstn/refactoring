package chapter_7.field;

public class Account {
    private AccountType type;

    public double interestForAmountDays(double amount, int days) {
        return type.getInterestRate() * amount * days / 365;
    }
}
