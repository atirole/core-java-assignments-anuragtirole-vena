package task_8_employee_hierarchy_system;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class EmployeeHierarchySystem
{

    private Map<Manager, Map<Level, List<Employee>>> hierarchyMap = new HashMap<>();

    // Add employee to a manager's hierarchy
    public void addEmployee(Manager manager, Level level, Employee employee)
    {
        hierarchyMap
                .computeIfAbsent(manager, k -> new HashMap<>())  // Create new Map for manager if absent
                .computeIfAbsent(level, k -> new ArrayList<>())  // Create new List for level if absent
                .add(employee);  // Add employee to the list at the specified level
    }

    // Print employees reporting to a manager at each level
    public void printEmployeeHierarchy(Manager manager)
    {
        System.out.println("Employees reporting to manager: " + manager.name);

        if (!hierarchyMap.containsKey(manager))
        {
            System.out.println("No employees found.");
            return;
        }

        Map<Level, List<Employee>> levels = hierarchyMap.get(manager);
        for (Map.Entry<Level, List<Employee>> entry : levels.entrySet())
        {
            System.out.println(entry.getKey() + " level employees:");
            for (Employee emp : entry.getValue())
            {
                System.out.println("  " + emp);
            }
        }
    }
}
