package gym;

public class GymMain {
    public static void main(String[] args) {
        System.out.println("""
                GYM MEMBERSHIP SYSTEM
                =========================================
                """);

        PremiumMembership member = new PremiumMembership("JhymDrenMG", "Premium", 6, true, true);
        member.displayDetails();
    }
}
