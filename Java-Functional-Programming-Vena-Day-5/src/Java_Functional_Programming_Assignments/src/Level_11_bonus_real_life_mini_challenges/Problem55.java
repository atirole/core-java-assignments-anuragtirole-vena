package Level_11_bonus_real_life_mini_challenges;

// Problem 55: From a list of jobs, return FAILED job names in uppercase, sorted alphabetically.

import java.util.*;
import java.util.stream.*;

public class Problem55
{
    static class Job {

        private String name;
        private String status;

        public Job(String name, String status)
        {
            this.name = name;
            this.status = status;
        }

        public String getName()
        {
            return name;
        }
        public String getStatus()
        {
            return status;
        }
    }

    public static void main(String[] args)
    {
        List<Job> jobs = Arrays.asList(
                new Job("JobA", "SUCCESS"),
                new Job("JobB", "FAILED"),
                new Job("JobC", "FAILED"),
                new Job("JobD", "SUCCESS"));

        // Filter jobs where status is FAILED, convert name to uppercase, and sort
        List<String> failedJobs = jobs.stream()
                .filter(job -> job.getStatus().equalsIgnoreCase("FAILED"))
                .map(job -> job.getName().toUpperCase())
                .sorted()
                .collect(Collectors.toList());

        failedJobs.forEach(System.out::println);
    }
}
