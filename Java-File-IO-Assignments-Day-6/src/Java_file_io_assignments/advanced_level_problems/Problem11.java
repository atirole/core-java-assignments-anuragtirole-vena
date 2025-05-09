package Java_file_io_assignments.advanced_level_problems;
// 11. 11️ Write a program to read a binary file (e.g., image.jpg) and copy its contents to image_copy.jpg.
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Problem11
{
    public static void main(String[] args)
    {
        FileInputStream inputStream = null;
        FileOutputStream outputStream = null;
        String path = "/Users/atirole/IdeaProjects/Java-File-IO-Assignments-Day-6/src/Java_file_io_assignments/advanced_level_problems/All_Files/";
        try
        {
            // Open the input stream to read from the source binary file
            inputStream = new FileInputStream(path + "image.jpg");

            // Open the output stream to write to the destination file
             outputStream = new FileOutputStream(path + "image_copy.jpg");

            byte[] buffer = new byte[1024]; // Buffer to hold chunks of data
            int bytesRead;

            // Read and write in chunks
            while ((bytesRead = inputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, bytesRead); // Write only the bytes read
                /*

                 outputStream.write(buffer, 0, bytesRead);
                 Writes bytes to image_copy.jpg.
                 buffer → the data array.
                 0 → start writing from the beginning of the buffer.
                 bytesRead → number of valid bytes to write from the buffer (don't write the full 1024 if it's less).

                */
            }

            System.out.println("File copied successfully to image_copy.jpg");
        }
        catch (IOException e)
        {
            System.out.println("Error during file copy: " + e.getMessage());
            e.printStackTrace();
        }
        finally
        {
            // Close resources in finally block
            try {
                if (inputStream != null) {
                    inputStream.close();
                }
                if (outputStream != null) {
                    outputStream.close();
                }
            } catch (IOException e)
            {
                System.out.println("Error closing streams: " + e.getMessage());
            }
        }
    }
}
