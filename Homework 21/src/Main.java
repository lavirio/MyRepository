public class Main {
    public static void main(String[] args) {
        Car car = new Car();

        Wheel wheel = new Wheel();
        wheel.setWheelNumber(4);

        Engine engine = new Engine();
        engine.setEngineVolume(1.6);

        GearBox gearBox = new GearBox();
        gearBox.setGearBoxShift(4);

        Body body = new Body();
        body.setBodyType("Купе");

        car.setWheel(wheel);
        car.setEngine(engine);
        car.setGearBox(gearBox);
        car.setBody(body);

        System.out.println("Количество колес: " + car.getWheel().getWheelNumber());
        System.out.println("Объем двигателя: " + car.getEngine().getEngineVolume());
        System.out.println("Количество передач: " + car.getGearBox().getGearBoxShift());
        System.out.println("Тип кузова: " + car.getBody().getBodyType());
        System.out.println(car);
    }
}
