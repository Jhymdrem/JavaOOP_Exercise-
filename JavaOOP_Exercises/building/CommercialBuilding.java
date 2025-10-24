package building;

public class CommercialBuilding extends Building {
    private double officeSpace;

    public CommercialBuilding(String address, int floors, double totalArea, double officeSpace) {
        super(address, floors, totalArea);
        this.officeSpace = officeSpace;
    }

    public double calculateRent(double rentPerSqm) {
        return officeSpace * rentPerSqm;
    }
}
