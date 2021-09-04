public class Car {
    public static void main(String[] args) {
        Engine engine = new Engine();
        engine.setEngine(1.6);
        System.out.println("Объем двигателя: " + engine.getEngine());
        GearBox gearBox = new GearBox();
        gearBox.setGearBox(4);
        System.out.println("Количество передач: " + gearBox.getGearBox());
        Body body = new Body();
        body.setBody("Кабриолет");
        System.out.println("Тип кузова: " + body.getBody());
        Wheel wheel = new Wheel();
        wheel.setWheel(4);
        System.out.println("Количество колес: " + wheel.getWheel());
    }
}
