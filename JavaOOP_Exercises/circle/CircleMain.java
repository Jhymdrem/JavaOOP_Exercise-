package circle;

public class CircleMain {
    public static void main(String[] args) {
        Circle circle = new Circle(9);

        System.out.println("""
                CIRCLE
                =========================
                """);
        System.out.println("Before: \nRadius: " + circle.getRadius() + "\nArea: " + circle.getArea() + "\nCircumference: " + circle.getCircumference() + '\n');

        circle.setRadius(6);
        System.out.println("After: \nRadius: " + circle.getRadius() + "\nArea: " + circle.getArea() + "\nCircumference: " + circle.getCircumference() + '\n');
        
    }
}
