package trafficLight;

public class TrafficLightMain {
    public static void main(String[] args) {
        TrafficLight trafficLight = new TrafficLight("red", 5);

        String color = "red";
        
        System.out.println("""
                TRAFFICLIGHT
                =====================
                """);
        if (trafficLight.colorIs(color)) {
            System.out.println("Duration is " + trafficLight.getDuration() + " menutes!");
        } else {
            System.out.println("Color " + color + " is not match to color " + trafficLight.getColor() + "!");
        }

        trafficLight.setTrafficColor("blue", 10);

        System.out.println();
    }
}
