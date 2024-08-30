import java.util.Scanner;

public class PrimeFactors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scanner.nextInt();
        System.out.println("Prime factors of " + num + " are: ");
        primeFactors(num);
    }

    public static void primeFactors(int num) {
        for (int i = 2; i <= num; i++) {
            if (isPrime(i) && num % i == 0) {
                System.out.print(i + " ");
                while (num % i == 0) {
                    num /= i;
                }
            }
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}