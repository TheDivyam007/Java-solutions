import java.util.Scanner;

class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void work() {
        System.out.println(name + " is working.");
    }

    public double getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }
}

class HRManager extends Employee {
    public HRManager(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void work() {
        System.out.println("HR Manager " + getName() + " is managing HR tasks.");
    }

    public void addEmployee(Employee employee) {
        System.out.println("HR Manager " + getName() + " is adding employee: " +
                employee.getName());
    }
}

public class FOUR {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input for Employee
        System.out.print("Enter employee name: ");
        String empName = scanner.nextLine();
        System.out.print("Enter employee salary: ");
        double empSalary = scanner.nextDouble();
        Employee emp1 = new Employee(empName, empSalary);

        // Get input for HRManager
        System.out.print("Enter HR Manager name: ");
        scanner.nextLine(); // Consume the newline character
        String hrManagerName = scanner.nextLine();
        System.out.print("Enter HR Manager salary: ");
        double hrManagerSalary = scanner.nextDouble();
        HRManager hrManager = new HRManager(hrManagerName, hrManagerSalary);

        emp1.work();
        System.out.println("Employee Salary: $" + emp1.getSalary());
        hrManager.work();
        System.out.println("HR Manager Salary: $" + hrManager.getSalary());
        Employee emp2 = new Employee("Bob", 55000.0);
        hrManager.addEmployee(emp2);
        scanner.close();
    }
}
