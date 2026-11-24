import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class AgeException extends Exception {

    public AgeException(String message) {
        super(message);
    }
}

public class ExceptionHandling {

    public static void main(String[] args) {
        int age = 22;

        try {

            checkAge(age); //this will cause AgeException

            int result = 10 / 10; //this will cause an ArithmeticException
            
            File file;
            file = new File("sample.txt");
            FileReader reader = new FileReader(file);
            reader.read();
            //this will cause FileNotFoundException and cosume Exception catch block

            int[] numbers = {1, 2, 3};
            System.out.println(numbers[5]); //this will cause ArrayIndexOutOfBoundsException

        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println(e + " Division by zero is not allowed.");
        }catch (FileNotFoundException e) {
            System.out.println("An unexpected error occurred: " + e);
        }  catch (AgeException | IOException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e);
        }
        finally {
            System.out.println("Execution completed");
        }
        }

    

    static void checkAge(int age) throws AgeException {
        if (age < 18) {
            throw new AgeException("Age must be at least 18.");
        }
    }
}
