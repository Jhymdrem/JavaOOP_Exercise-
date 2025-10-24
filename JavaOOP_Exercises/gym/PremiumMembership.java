package gym;

public class PremiumMembership extends GymMembership {
    private boolean personalTrainer;
    private boolean spaAccess;

    public PremiumMembership(String memberName, String membershipType, int duration, boolean personalTrainer, boolean spaAccess) {
        super(memberName, membershipType, duration);
        this.personalTrainer = personalTrainer;
        this.spaAccess = spaAccess;
    }

    public void checkSpecialOffers() {
        if (personalTrainer && spaAccess)
            System.out.println("Special Offer: Free 1-Month Extension!");
        else
            System.out.println("No special offers available.");
    }

    public void displayDetails() {
        System.out.println("Member: " + memberName);
        System.out.println("Membership Type: " + membershipType);
        System.out.println("Duration: " + duration + " months");
        System.out.println("Total Fees: " + calculateFees());
        checkSpecialOffers();
    }
}
