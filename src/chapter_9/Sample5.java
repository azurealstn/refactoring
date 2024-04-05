package chapter_9;

public class Sample5 {
    public double getPayAmount() {
        if (isDead) return deadAmount();
        if (isSeparated) return separatedAmoun();
        if (isRetired) return retiredAmount();
        return normalPayAmount();
    }
}
