import java.util.Scanner;

public class SmithNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scanner.nextInt();
        if (isSmithNumber(num)) {
            System.out.println(num + " is a Smith number.");
        } else {
            System.out.println(num + " is not a Smith number.");
        }
    }

    public static boolean isSmithNumber(int num) {
        int sumOfDigits = sumOfDigits(num);
        int sumOfPrimeFactors = sumOfPrimeFactors(num);
        return sumOfDigits == sumOfPrimeFactors;
    }

    public static int sumOfDigits(int num) {
        int sum = 0;
        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    public static int sumOfPrimeFactors(int num) {
        int sum = 0;
        for (int i = 2; i <= num; i++) {
            while (num % i == 0) {
                sum += sumOfDigits(i);
                num /= i;
            }
        }
        return sum;
    }
}