package course;

public class OnlineCourse extends Course {
    private String platform;
    private int duration;

    public OnlineCourse(String name, String instructor, int credits, String platform, int duration) {
        super(name, instructor, credits);
        this.platform = platform;
        this.duration = duration;
    }

    public boolean isEligibleForCertificate() {
        return duration >= 4;
    }

    public void displayDetails() {
        super.displayDetails();
        System.out.println("Platform: " + platform);
        System.out.println("Duration: " + duration + " weeks");
        System.out.println("Eligible for Certificate: " + isEligibleForCertificate());
    }
}
