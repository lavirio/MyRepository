public class Country {
    private String name;
    private int quantity;
    private int land;
    private String capital;
    private boolean sea;

    public Country(String capital) {
        this.capital = capital;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getLand() {
        return land;
    }

    public void setLand(int land) {
        this.land = land;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public char getSea() {
        return sea;
    }

    public void setSea(char sea) {
        this.sea = sea;
    }
}
