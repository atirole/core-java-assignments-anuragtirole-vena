package Exception_Handling_Assignments.Task_3_exception_safe_resource_handling_with_multiple_resources;

public class Main
{
    public static void main(String[] args)
    {
        // Sample file paths (adjust if needed)
        String path ="/Users/atirole/Users/atirole/IdeaProjects/Java-Exception-Handling_Assignments-Day-7/src/Exception_Handling_Assignments/Task_3_exception_safe_resource_handling_with_multiple_resources/";
        String inputFile = path+"input.txt";
        String outputFile = path+"output.txt";

        FileCopier copier = new FileCopier();
        copier.copy(inputFile, outputFile);
    }
}
