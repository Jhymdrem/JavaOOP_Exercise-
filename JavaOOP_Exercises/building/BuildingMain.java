package building;

public class BuildingMain {
    public static void main(String[] args) {
        System.out.println("""
                BUILDING SYSTEM
                =========================================
                """);

        ResidentialBuilding rb = new ResidentialBuilding("123 Elm St", 5, 8000, 20);
        CommercialBuilding cb = new CommercialBuilding("456 Oak Ave", 10, 15000, 5000);

        System.out.println("Residential Rent: " + rb.calculateRent(10000));
        System.out.println("Commercial Rent: " + cb.calculateRent(250));
    }
}
