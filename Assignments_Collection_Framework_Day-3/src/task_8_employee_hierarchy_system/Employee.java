package task_8_employee_hierarchy_system;

class Employee
{
    public int id;
    public String name;

    public Employee(int id, String name)
    {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString()
    {
        return id + " - " + name;
    }
}
