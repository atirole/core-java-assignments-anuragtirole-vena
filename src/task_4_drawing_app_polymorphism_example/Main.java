package task_4_drawing_app_polymorphism_example;

public class Main
{
    public static void main(String[] args)
    {
        Shape[] shapes = new Shape[3];

        shapes[0] = new Circle();
        shapes[1] = new Square();
        shapes[2] = new Triangle();

        // Enhanced for-each loop
        for (Shape shape : shapes)
        {
            shape.draw(); // Polymorphic behavior
        }
    }
}


