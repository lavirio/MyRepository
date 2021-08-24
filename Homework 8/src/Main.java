public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Сфинкс", "Персик", "Мужской", 3, "Черный");
        System.out.println("Кошка № 1");
        cat.check();

        System.out.println();
        System.out.println();

        cat.setBreed("Британец");
        cat.setName("Мартина");
        cat.setGender("Женский");
        cat.setAge(4);
        cat.setBodyColor("Белый");
        cat.check();

        System.out.println();
        System.out.println();

        Employee employee = new Employee("Антон", "1324","Газпром");
        System.out.print("Имя: " + employee.getName() + "\nID: " + employee.getEmployeeID() + "\nКомания: " + employee.getCompany());
    }
}
