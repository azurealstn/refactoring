package chapter_10;

public class Sample14 {
    private int balance;
    public void withdraw(int amount) {
        if (amount > balance) throw new BalanceException();
        balance -= amount;
    }

    static class BalanceException extends RuntimeException {}
}
