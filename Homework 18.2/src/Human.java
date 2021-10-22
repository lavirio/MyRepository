public class Human {
    private String name;
    private String typeOfNumber;
    private String number;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTypeOfNumber() {
        return typeOfNumber;
    }

    public void setTypeOfNumber(String typeOfNumber) {
        this.typeOfNumber = typeOfNumber;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Human(String name, String typeOfNumber, String number) {
        this.name = name;
        this.typeOfNumber = typeOfNumber;
        this.number = number;
    }
}
