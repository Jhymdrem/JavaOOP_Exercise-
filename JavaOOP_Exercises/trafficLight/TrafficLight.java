package trafficLight;

public class TrafficLight {
    
    private String color;
    private double duration;

    public TrafficLight(String color, double duration) {
        this.color = color;
        this.duration = duration;
    }

    public double getDuration() {
        return duration;
    }

    public String getColor() {
        return color;
    }

    public boolean colorIs(String color) {
        System.out.println("[ Current color is " + this.color + " ]");
        return this.color.equals(color);
    }

    public void setTrafficColor(String color, double duration) {
        this.color = color;
        this.duration = duration;
        System.out.println("[ Color change to " + color + " and duration to " + duration + " menutes! ]");
    }

}
