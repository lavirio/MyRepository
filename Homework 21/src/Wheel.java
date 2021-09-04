public class Wheel {
    private int wheelNumber;

    public int getWheelNumber() {
        return wheelNumber;
    }
    public void setWheelNumber(int wheelNumber) {
        this.wheelNumber = wheelNumber;
    }

    @Override
    public String toString() {
        return "Wheel{" +
                "wheel=" + wheelNumber +
                '}';
    }
}
