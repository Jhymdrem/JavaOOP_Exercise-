package rectangle;

public class Rectangle {
    
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public  double getWidth() {
        return width;
    }

    public  double getHeigth() {
        return height;
    }

    public double getArea() {
        return width * height;
    }

    public  double getTotal() {
        return 2 * (width + height);
    }
}
