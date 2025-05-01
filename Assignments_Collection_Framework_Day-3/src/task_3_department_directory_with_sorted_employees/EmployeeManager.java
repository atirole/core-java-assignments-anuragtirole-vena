package task_3_department_directory_with_sorted_employees;

import java.util.*;

public class EmployeeManager
{
    private final Map<String, List<Employee>> departmentMap = new HashMap<>();

    // Add employee to appropriate department list
    public void addEmployee(Employee emp)
    {
        if (!departmentMap.containsKey(emp.department))
        {
            departmentMap.put(emp.department, new ArrayList<>());
        }
        departmentMap.get(emp.department).add(emp);
    }

    // Sort each department's employee list by descending salary
    public void sortEmployeesBySalaryInDepartments()
    {
        for (List<Employee> employees : departmentMap.values())
        {
            employees.sort((e1, e2) -> Double.compare(e2.salary, e1.salary));
        }
    }

    // Return top N paid employees across all departments
    public List<Employee> getTopPaidEmployees(int n)
    {
        List<Employee> allEmployees = new ArrayList<>();
        for (List<Employee> empList : departmentMap.values())
        {
            allEmployees.addAll(empList);
        }
        allEmployees.sort((e1, e2) -> Double.compare(e2.salary, e1.salary));

        // Use if-else to handle the case for N > size
        if (n >= allEmployees.size())
        {
            return allEmployees;
        }
        else
        {
            return allEmployees.subList(0, n);
        }
    }

    // For printing all employees by department (sorted)
    public void printDepartmentWiseEmployees()
    {
        for (String dept : departmentMap.keySet())
        {
            System.out.println("\nDepartment: " + dept);
            for (Employee emp : departmentMap.get(dept))
            {
                System.out.println("  " + emp);
            }
        }
    }

    // Getter method for departmentMap
    public Map<String, List<Employee>> getDepartmentMap()
    {
        return departmentMap;
    }
}
