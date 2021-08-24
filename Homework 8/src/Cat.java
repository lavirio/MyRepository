public class Cat {
    String breed;
    String name;
    String gender;
    int age;
    String bodyColor;

    public Cat (String breed, String name, String gender, int age, String bodyColor) {
        this.breed = breed;
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.bodyColor = bodyColor;
    }

    public String getBreed() {
        return breed;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public String getBodyColor() {
        return bodyColor;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setBodyColor(String bodyColor) {
        this.bodyColor = bodyColor;
    }

    public void check() {
        System.out.print("Порода: " + breed + "\n" + "Имя: " + name + "\n" + "Пол: " + gender + "\n" + "Возраст: " + age + " года"+ "\n" + "Цвет: " + bodyColor);
    }
}
