package chapter_6;

public class Sample3 {
    public boolean isBasePrice() {
        return getBasePrice() > 1000;
    }
    private int getBasePrice() {
        return 1000;
    }
}
