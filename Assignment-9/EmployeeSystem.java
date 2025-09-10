class Employee {
    static String companyName = "Tech Limited";
    private static int totalEmployees = 0;

    private String name;
    private final String id;
    private String designation;

    Employee(String name, String designation, String id) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        totalEmployees++;
    }

    public static void displayTotalEmployees() { 
        System.out.println("Company: " + companyName);
        System.out.println("Total Employees: " + totalEmployees);
        System.out.println("---------------------------------");
    }

    public void displayEmployeeDetails() {
        if (this instanceof Employee) {
            System.out.println("Employee ID   : " + id);
            System.out.println("Name          : " + name);
            System.out.println("Designation   : " + designation);
            System.out.println("Company       : " + companyName);
            System.out.println("---------------------------------");
        }
    }
}

public class EmployeeSystem {
    public static void main(String[] args) {
        Employee e1 = new Employee("Sarthak", "Software Engineer", "101");
        Employee e2 = new Employee("Shubhum", "Machine Learning", "102");
        Employee e3 = new Employee("Nitin", "java developer", "103");

        e1.displayEmployeeDetails();
        e2.displayEmployeeDetails();
        e3.displayEmployeeDetails();

        Employee.displayTotalEmployees();
    }
}
