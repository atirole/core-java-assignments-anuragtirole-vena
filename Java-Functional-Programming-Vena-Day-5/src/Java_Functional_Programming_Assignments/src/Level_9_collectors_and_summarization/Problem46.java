package Level_9_collectors_and_summarization;


// 46. Write a program that groups a list of employees by joining year, and then finds the max salary in each year.

import java.util.*;
import java.util.stream.*;

public class Problem46
{
    static class Employee
    {
        private String name;
        private int joiningYear;
        private double salary;

        public Employee(String name, int joiningYear, double salary)
        {
            this.name = name;
            this.joiningYear = joiningYear;
            this.salary = salary;
        }

        public int getJoiningYear()
        {
            return joiningYear;
        }
        public double getSalary()
        {
            return salary;
        }
        public String getName()
        {
            return name;
        }
    }

    public static void main(String[] args)
    {
        List<Employee> employees = Arrays.asList(
                new Employee("Anurag", 2021, 50000),
                new Employee("Sandeep", 2021, 65000),
                new Employee("Ayushi", 2022, 70000),
                new Employee("Gopal", 2022, 55000)
        );

        Map<Integer, Optional<Employee>> highestSalariesByYear = employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getJoiningYear,
                        Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary))
                ));

        highestSalariesByYear.forEach((year, empOpt) -> {
            empOpt.ifPresent(emp -> System.out.println("Year: " + year + ", Highest Paid: " + emp.getName() + ", Salary: " + emp.getSalary()));
        });
    }
}
