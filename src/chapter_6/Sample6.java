package chapter_6;

public class Sample6 {
    double height = 3.5;
    double width = 2.5;
    public void splitTemporaryVariable() {
        final double perimeter = 2 * (height + width);
        System.out.println("perimeter = " + perimeter);
        final double area = height * width;
        System.out.println("area = " + area);
    }
}
