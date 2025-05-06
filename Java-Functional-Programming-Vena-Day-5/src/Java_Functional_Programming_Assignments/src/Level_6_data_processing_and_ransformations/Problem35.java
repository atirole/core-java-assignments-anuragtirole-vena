package Level_6_data_processing_and_ransformations;

// Problem35: Calculate the average salary of employees in each department using Collectors.groupingBy() and averagingDouble().
import java.util.*;
import java.util.stream.*;

public class Problem35
{
    static class Employee
    {
        private String name;
        private String department;
        private double salary;

        public Employee(String name, String department, double salary)
        {
            this.name = name;
            this.department = department;
            this.salary = salary;
        }

        public String getName()
        {
            return name;
        }

        public String getDepartment()
        {
            return department;
        }

        public double getSalary()
        {
            return salary;
        }
    }

    public static void main(String[] args)
    {
        List<Employee> employees = Arrays.asList(
                new Employee("Anurag", "Sales", 5000),
                new Employee("Vijay", "HR", 4500),
                new Employee("Sandeep", "Sales", 5500),
                new Employee("Ayushi", "IT", 6000),
                new Employee("Gopal", "HR", 4800)
        );

        Map<String, Double> avgSalaryByDept = employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.averagingDouble(Employee::getSalary)  // average salary per department
                ));

        System.out.println("Average salary by department: " + avgSalaryByDept);
    }
}
