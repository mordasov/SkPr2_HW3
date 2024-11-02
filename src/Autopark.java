public class Autopark {
    private static Transport[] autopark = new Transport[]{
            new Truck("truck1", 6),
            new Truck("truck2", 8),
            new Car("car1", 4),
            new Car("car2", 4),
            new Bicycle("bicycle1", 2),
            new Bicycle("bicycle2", 2),
    };

    public static Transport[] getAutopark() {
        return autopark;
    }
}
