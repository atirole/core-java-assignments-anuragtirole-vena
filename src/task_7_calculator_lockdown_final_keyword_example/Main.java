package task_7_calculator_lockdown_final_keyword_example;

public class Main
{
    public static void main(String[] args)
    {
        SmartCalculator calc = new SmartCalculator();

        System.out.println("Addition: " + calc.add(5, 3));   // Inherited final method
        System.out.println("Subtraction: " + calc.subtract(5, 3)); // New method
    }
}

