public class Main {
    public static void main(String[] args) {

        Truck truck1 = new Truck("truck1", 6);
        Truck truck2 = new Truck("truck2", 8);
        Car car1 = new Car("car1", 4);
        Car car2 = new Car("car2", 4);
        Bicycle bicycle1 = new Bicycle("bicycle1", 2);
        Bicycle bicycle2 = new Bicycle("bicycle2", 2);

        Transport[] autopark = {truck1, truck2, car1, car2, bicycle1, bicycle2};
        for (Transport t : autopark) {
            t.check();
        }
    }
}