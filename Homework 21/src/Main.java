public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.setEngine(car.getEngine());
        car.setWheel(car.getWheel());
        car.setGearBox(car.getGearBox());
        car.setBody(car.getBody());

        Wheel wheel = new Wheel();
        Engine engine = new Engine();
        GearBox gearBox = new GearBox();
        Body body = new Body();

        wheel.setWheel(4);
        System.out.println("Количество колес: " + wheel.getWheel());
        engine.setEngine(1.6);
        System.out.println("Объем двигателя: " + engine.getEngine());
        gearBox.setGearBox(4);
        System.out.println("Количество передач: " + gearBox.getGearBox());
        body.setBody("Купе");
        System.out.println("Тип кузова: " + body.getBody());
    }
}
