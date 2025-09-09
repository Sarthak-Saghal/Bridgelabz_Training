
class Employee {
    public int employeeID;      
    protected String department; 
    private double salary;       


    public Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

   
    public void setSalary(double newSalary) {
        if (newSalary >= 0) {
            this.salary = newSalary;
            System.out.println("Salary updated to $" + this.salary);
        } else {
            System.out.println("Invalid salary amount.");
        }
    }

   
    public void displaySalary() {
        System.out.println("Salary: $" + salary);
    }


    public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        displaySalary();
        System.out.println("-----------------------");
    }
}

class Manager extends Employee {
    private String managerLevel;

    // Constructor
    public Manager(int employeeID, String department, double salary, String managerLevel) {
        super(employeeID, department, salary);
        this.managerLevel = managerLevel;
    }


    public void displayManagerDetails() {
        // Can access employeeID (public) and department (protected) directly
        System.out.println("Manager ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Manager Level: " + managerLevel);
        displaySalary(); 
        System.out.println("-----------------------");
    }
}

public class EmployeeTest {
    public static void main(String[] args) {
        Employee emp1 = new Employee(101, "HR", 50000);
        emp1.displayEmployeeDetails();
        emp1.setSalary(55000); 
        emp1.displayEmployeeDetails();

        Manager mgr1 = new Manager(201, "IT", 80000, "Senior");
        mgr1.displayManagerDetails();
        mgr1.setSalary(85000); 
        mgr1.displayManagerDetails();
    }
}

