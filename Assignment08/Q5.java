import java.io.FileWriter;
import java.io.IOException;

// Custom checked exception
class CustomCheckedException extends Exception {
    public CustomCheckedException(String message) {
        super(message);
    }
}

public class Q5 {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("abc.txt");
            
            // Add condition to throw exception
            boolean errorCondition = true;
            if (errorCondition) {
                throw new CustomCheckedException("This is a manually thrown checked exception");
            }
            
            fw.write("Hello");
            fw.close();
        } catch (CustomCheckedException ce) {
            System.out.println("Caught custom exception: " + ce.getMessage());
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
