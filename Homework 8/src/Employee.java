public class Employee {
    String name;
    String employeeID;
    String company;

    public Employee (String name, String employeeID, String company) {
        this.name = name;
        this.employeeID = employeeID;
        this.company = company;

    }

    public String getName() {
        return name;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public String getCompany() {
        return company;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void check () {
        System.out.println("Имя: " + name + "\n" + "ID: " + employeeID + "\n" + "Компания: " + company);
    }
}
