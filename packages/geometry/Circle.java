package geometry;

public class Circle {

    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }
}
//compile using- javac -d output packages\geometry\Circle.java