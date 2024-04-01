package chapter_6;

public class Sample2 {
    int numberOfLateDeliveries;
    public int getRating() {
        return numberOfLateDeliveries > 5 ? 2 : 1;
    }
}
