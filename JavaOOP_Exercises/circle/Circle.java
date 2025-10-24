package circle;

public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.sqrt(radius / Math.PI);
    }

    public double getCircumference() {
        return radius / (2 * Math.PI);
    }
}
