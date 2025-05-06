package Level_6_data_processing_and_ransformations;

// Problem34: Given a list of Employee objects, group them by department and count how many employees are in each department.
import java.util.*;
import java.util.stream.*;

public class Problem34
{
    static class Employee
    {
        private String name;
        private String department;

        public Employee(String name, String department)
        {
            this.name = name;
            this.department = department;
        }

        public String getName()
        {
            return name;
        }

        public String getDepartment()
        {
            return department;
        }
    }

    public static void main(String[] args)
    {
        List<Employee> employees = Arrays.asList(
                new Employee("Anurag", "Sales"),
                new Employee("Vijay", "HR"),
                new Employee("Sandeep", "Sales"),
                new Employee("Ayushi", "IT"),
                new Employee("Gopal", "HR")
        );

        Map<String, Long> countByDept = employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.counting()                 // count per department
                ));

        System.out.println("Employee count by department: " + countByDept);
    }
}
