package chapter_8;

public class Sample3 {

    public static final double GRAVITATIONAL_CONSTANT = 9.81;

    public double potentialEnergy(double mass, double height) {
        return mass * GRAVITATIONAL_CONSTANT * height;
    }
}
