package building;

public class ResidentialBuilding extends Building {
    private int apartments;

    public ResidentialBuilding(String address, int floors, double totalArea, int apartments) {
        super(address, floors, totalArea);
        this.apartments = apartments;
    }

    public double calculateRent(double rentPerUnit) {
        return apartments * rentPerUnit;
    }
}
