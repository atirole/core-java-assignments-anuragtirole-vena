package task_9_animal_sounds_super_keyword_example;

public class Cat extends Animal
{

    //Override
    public void makeSound()
    {
        super.makeSound(); // Call parent class method
        System.out.println("Cat says: Meow");
    }
}

