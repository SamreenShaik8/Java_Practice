// a whole number greater than 1 that cannot be exactly divided by any whole number other than itself
import java.util.Scanner;

public class Prime_Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking the user input from the user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();
        
        // condition to check the number is greater than 1 or not
        if (number < 2) {
            System.out.println(number + " is not a prime number.");
        } else {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(number + " is a prime number.");
            } else {
                System.out.println(number + " is not a prime number.");
            }
        }
    }
}