package Exception_Handling_Assignments.Task_7_handling_suppressed_exceptions;

public class CustomResource implements AutoCloseable
{
    private String name;

    public CustomResource(String name)
    {
        this.name = name;
    }

    public void use()
    {
        System.out.println(name + " is in use.");
    }

    @Override
    public void close() throws Exception
    {
        System.out.println("Closing " + name);
        throw new Exception("Error while closing " + name);
    }
}
