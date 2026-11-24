import geometry.Circle;

public class Area {

    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        double area = circle.area();
        System.out.println("Area of the circle: " + area);
    }
}

/**
 output:
 Area of the circle: 78.53981633974483
 */
