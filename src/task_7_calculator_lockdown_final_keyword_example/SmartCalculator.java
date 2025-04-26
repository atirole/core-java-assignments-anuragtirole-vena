package task_7_calculator_lockdown_final_keyword_example;

public class SmartCalculator extends BasicCalculator
{

    //  This will cause a compile-time ERROR if you try to override
    /*
    //Override
    public int add(int a, int b) {
        return a + b + 10; // Not allowed because add() is final in parent
    }
    */

    // New method - allowed
    public int subtract(int a, int b)
    {
        return a - b;
    }
}

