package chapter_9;

public class Sample7 {
    public double getExpenseLimit() {
        Assert.isTrue(expenseLimit != NULL_EXPENSE || primaryProject != null);
        return (expenseLimit != NULL_EXPENSE) ? expenseLimit : primaryProject.getMemberExpenseLimit();
    }
}
