package task_4_prioritization_engine;

import java.util.*;

public class Main
{

    public static void main(String[] args)
    {
        // Create a PriorityQueue with a lambda expression for the comparator
        PriorityQueue<Task> taskQueue = new PriorityQueue<>((t1, t2) -> {
            // First, compare by deadline (earliest deadline first)
            int deadlineComparison = Integer.compare(t1.getDeadline(), t2.getDeadline());

            // If deadlines are the same, compare by priority (highest priority first)
            if (deadlineComparison == 0)
            {
                return Integer.compare(t2.getPriority(), t1.getPriority()); // Descending order of priority
            }

            return deadlineComparison;
        });

        // Adding tasks to the PriorityQueue
        taskQueue.add(new Task("Task A", 2, 5)); // Priority 2, Deadline 5
        taskQueue.add(new Task("Task B", 1, 3)); // Priority 1, Deadline 3
        taskQueue.add(new Task("Task C", 3, 5)); // Priority 3, Deadline 5
        taskQueue.add(new Task("Task D", 2, 1)); // Priority 2, Deadline 1
        taskQueue.add(new Task("Task E", 3, 3)); // Priority 3, Deadline 3

        // Poll and print tasks in the order they should be executed
        System.out.println("Tasks to be executed in order:");
        while (!taskQueue.isEmpty())
        {
            Task task = taskQueue.poll();
            System.out.println(task);
        }
    }
}

