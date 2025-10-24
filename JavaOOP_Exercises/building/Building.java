package building;

public class Building {
    protected String address;
    protected int floors;
    protected double totalArea;

    public Building(String address, int floors, double totalArea) {
        this.address = address;
        this.floors = floors;
        this.totalArea = totalArea;
    }
}
