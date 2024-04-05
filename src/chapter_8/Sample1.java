package chapter_8;

public class Sample1 {
    private int low;
    private int high;

    public int getLow() {
        return low;
    }

    public int getHigh() {
        return high;
    }

    public boolean includes(int arg) {
        return arg >= getLow() && arg <= getHigh();
    }
}
