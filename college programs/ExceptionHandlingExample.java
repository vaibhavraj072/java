import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter an integer: ");
            int number = scanner.nextInt();

            if (number < 0) {
                throw new IllegalArgumentException("Number must be non-negative");
            }

            System.out.println("The entered number is: " + number);

        } catch (InputMismatchException e) {
            System.out.println("Error: You must enter an integer.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Scanner closed.");
        }
    }
}
