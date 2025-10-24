package gym;

public class GymMembership {
    protected String memberName;
    protected String membershipType;
    protected int duration;

    public GymMembership(String memberName, String membershipType, int duration) {
        this.memberName = memberName;
        this.membershipType = membershipType;
        this.duration = duration;
    }

    public double calculateFees() {
        return switch (membershipType.toLowerCase()) {
            case "basic" -> duration * 500;
            case "standard" -> duration * 800;
            default -> duration * 1000;
        };
    }
}
