public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Сфинкс", "Персик", "Мужской", 3, "Черный");
        System.out.println("Кошка № 1");
        cat.check();

        System.out.println();
        System.out.println();

        System.out.println("Кошка № 2");
        cat.setBreed("Британец");
        cat.setName("Мартина");
        cat.setGender("Женский");
        cat.setAge(4);
        cat.setBodyColor("Серый");
        cat.check();

        System.out.println();
        System.out.println();

        System.out.println("Кошка № 3");
        System.out.print("Порода: " + cat.getBreed() + "\nИмя: " + cat.getName() + "\nПол: " + cat.getGender() + "\nВозраст: " + cat.getAge() + " года" + "\nЦвет: " + cat.getBodyColor());

        System.out.println();
        System.out.println();

        Employee employee = new Employee("Антон", "1324","Газпром");
        System.out.println("Работник № 1");
        System.out.print("Имя: " + employee.getName() + "\nID: " + employee.getEmployeeID() + "\nКомания: " + employee.getCompany());

        System.out.println();
        System.out.println();

        System.out.println("Работник № 2");
        employee.setName("Илья");
        employee.setEmployeeID("4356");
        employee.setCompany("Лукойл");
        employee.check();
    }
}
