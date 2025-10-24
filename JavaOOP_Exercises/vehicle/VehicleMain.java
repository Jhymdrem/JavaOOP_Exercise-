package vehicle;

public class VehicleMain {
    public static void main(String[] args) {
        System.out.println("""
                VEHICLE SYSTEM
                =========================================
                """);

        Car car = new Car("Toyota", "Camry", 2024, 15.2);
        Truck truck = new Truck("Ford", "F-150", 2023, 3.5);

        car.displayDetails();
        System.out.println();
        truck.displayDetails();
    }
}
