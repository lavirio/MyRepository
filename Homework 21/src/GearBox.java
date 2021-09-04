public class GearBox {

    private int gearBoxShift;

    public int getGearBoxShift() {
        return gearBoxShift;
    }
    public void setGearBoxShift(int gearBoxShift) {
        this.gearBoxShift = gearBoxShift;
    }

    @Override
    public String toString() {
        return "GearBox{" +
                "gearBox=" + gearBoxShift +
                '}';
    }
}
