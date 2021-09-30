public class Country {
    private final String name;
    private final int age;
    private final int gdp;

    public Country(String name, int age, int gdp) {
        this.name = name;
        this.age = age;
        this.gdp = gdp;
    }

    public Country setName(String name){
        return new Country(name, age, gdp);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getGdp() {
        return gdp;
    }

    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gdp=" + gdp +
                '}';
    }
}
