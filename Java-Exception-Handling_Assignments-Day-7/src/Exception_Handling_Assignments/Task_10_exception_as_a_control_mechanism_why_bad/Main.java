package Exception_Handling_Assignments.Task_10_exception_as_a_control_mechanism_why_bad;

public class Main
{
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, -1, 50};

        System.out.println("Incorrect version using exceptions to break loop");
        for (int i = 0; i < numbers.length; i++)
        {
            try
            {
                if (numbers[i] == -1)
                {
                    throw new Exception("End of data");
                }
                System.out.println("Processing: " + numbers[i]);
            }
            catch (Exception e)
            {
                System.err.println("Breaking loop due to: " + e.getMessage());
                break; // Exception used to exit loop
            }
        }
    }
}

/* why bad
Performance cost: Throwing exceptions is expensive.

Misleading intent: Exceptions are for unexpected errors, not flow control.

Code readability suffers.
*/
