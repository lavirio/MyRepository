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
    public void check() {
        System.out.print("Порода: " + breed + "\n" + "Имя: " + name + "\n" + "Пол: " + gender + "\n" + "Возраст: " + age + " года"+ "\n" + "Цвет: " + bodyColor);
    }
}
