public class Car {
    private Wheel wheel;
    private Engine engine;
    private GearBox gearBox;
    private Body body;

    public Wheel getWheel() {
        return wheel;
    }

    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void setGearBox(GearBox gearBox) {
        this.gearBox = gearBox;
    }

    public void setBody(Body body) {
        this.body = body;
    }

    public Engine getEngine() {
        return engine;
    }

    public GearBox getGearBox() {
        return gearBox;
    }

    public Body getBody() {
        return body;
    }
}
