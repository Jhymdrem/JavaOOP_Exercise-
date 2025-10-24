package inventory;

public class Product {
    private String prudoctName;
    private int stack;
    private double price;

    public Product(String productName, int stack, double price) {
        this.prudoctName = productName;
        this.stack = stack;
        this.price = price;
    }

    public String getName() {
        return prudoctName;
    }

    public double getPrice() {
        return price;
    }

    public int getStack() {
        return stack;
    }

    public void setStack(int newStack) {
        this.stack = newStack;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void buyStack(int buyStack, double amount) {

        double value = buyStack * price;

        if (buyStack > stack) System.out.println("[ Stack is not enough! ]");
        else if (value <= amount) this.stack -= buyStack;
        else System.out.println("[ your amount is not enough for the total of " + value + " ]");
    }
}
