public class Car extends Bicycle {

    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void check() {
        System.out.println("Обслуживаем " + super.getModelName());
        for (int i = 0; i < getWheelsCount(); i++) {
            updateTyre();
        }
        checkEngine();
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }
}