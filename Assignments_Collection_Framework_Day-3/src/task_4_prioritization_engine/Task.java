package task_4_prioritization_engine;

public class Task
{
    private String name;
    private int priority;   // Higher number = higher priority
    private int deadline;   // Lower number = closer deadline

    public Task(String name, int priority, int deadline)
    {
        this.name = name;
        this.priority = priority;
        this.deadline = deadline;
    }

    // Getter methods
    public String getName()
    {

        return name;
    }

    public int getPriority()
    {
        return priority;
    }

    public int getDeadline()
    {
        return deadline;
    }

    @Override
    public String toString()
    {
        return "Task{name='" + name + "', priority=" + priority + ", deadline=" + deadline + "}";
    }
}

