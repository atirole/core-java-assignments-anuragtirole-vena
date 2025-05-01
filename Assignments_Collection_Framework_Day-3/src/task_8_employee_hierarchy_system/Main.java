package task_8_employee_hierarchy_system;

public class Main {

    public static void main(String[] args) {
        // Create some managers and employees
        Manager manager1 = new Manager(1, "Anurag");
        Manager manager2 = new Manager(2, "Vijay");

        Employee emp1 = new Employee(101, "Sandeep");
        Employee emp2 = new Employee(102, "Mahesh");
        Employee emp3 = new Employee(103, "Gopal");
        Employee emp4 = new Employee(104, "Sarthak");

        EmployeeHierarchySystem system = new EmployeeHierarchySystem();

        // Adding employees to the hierarchy
        system.addEmployee(manager1, Level.JUNIOR, emp1);
        system.addEmployee(manager1, Level.MID, emp2);
        system.addEmployee(manager1, Level.SENIOR, emp3);
        system.addEmployee(manager2, Level.JUNIOR, emp4);

        // Printing hierarchy for each manager
        system.printEmployeeHierarchy(manager1);
        system.printEmployeeHierarchy(manager2);
    }
}
