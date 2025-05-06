package Level_7_custom_types_and_nested_streams;

// Problem39.java
// Create a function that takes a list of people and returns a map of age group (<20, 20–40, 40+) → list of people.
import java.util.*;
import java.util.stream.*;

public class Problem39
{
    static class Person
    {
        private String name;
        private int age;
        public Person(String name, int age)
        {
            this.name = name;
            this.age = age;
        }
        public String getName()
        {
            return name;
        }
        public int getAge()
        {
            return age;
        }
        @Override
        public String toString()
        {
            return name + " (" + age + ")";
        }
    }

    public static void main(String[] args)
    {
        List<Person> people = Arrays.asList(
                new Person("Anurag", 18),
                new Person("Sandeep", 25),
                new Person("Vijay", 41),
                new Person("Ayushi", 36),
                new Person("Gopal", 50)
        );

        Map<String, List<Person>> groupedByAge = people.stream()
                .collect(Collectors.groupingBy(p -> {
                    if (p.getAge() < 20)
                    {
                        return "<20";
                    }
                    else if (p.getAge() <= 40)
                    {
                        return "20-40";
                    }
                    else
                    {
                        return "40+";
                    }
                }));

        System.out.println("People grouped by age category: " + groupedByAge);
    }
}
