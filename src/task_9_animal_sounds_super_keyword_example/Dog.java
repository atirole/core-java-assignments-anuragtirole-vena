package task_9_animal_sounds_super_keyword_example;

public class Dog extends Animal
{

    //Override
    public void makeSound()
    {
        super.makeSound(); // Call parent class method
        System.out.println("Dog says: Woof");
    }
}

