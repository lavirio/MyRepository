public class Engine {

    private double engineVolume;

    public void setEngineVolume(Double engineVolume) {
        this.engineVolume = engineVolume;
    }
    public double getEngineVolume() {
        return engineVolume;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "engine=" + engineVolume +
                '}';
    }
}
