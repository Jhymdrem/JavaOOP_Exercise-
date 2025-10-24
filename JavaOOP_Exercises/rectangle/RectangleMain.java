package rectangle;

public class RectangleMain {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(30, 15);

        System.out.println("""
                RECTANGLE
                =========================
                """);
        System.out.println("Width: " + rectangle.getWidth() + '\n' + "Height: " + rectangle.getHeigth() + '\n' + "Area: " + rectangle.getArea() + '\n' + "Total: " + rectangle.getTotal());
    }
}
