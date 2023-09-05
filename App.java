import java.util.Scanner;  // Import the Scanner class
import java.util.Random;

public class App {
    public static void main(String[] args) {
        System.out.println("Welcome to the calculator!"); // Display the string.
        Random random = new Random();
        int randomNumber1 = random.nextInt(100);
        int randomNumber2 = random.nextInt(100);
        System.out.println("Random number 1: " + randomNumber1);
        System.out.println("Random number 2: " + randomNumber2);
        System.out.println("Enter an operation to perform on them: +, - or *"); // Display the string.
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        int results;
        if (input.equals("+")) { // compare two strings use equals method as two different objs with same value
        results = randomNumber1 + randomNumber2;
        } else if (input.equals("-")) {
            results = randomNumber1 - randomNumber2;
        } else {
            results = randomNumber1 * randomNumber2;
        }
        System.out.println("The results is " + results);
            }
}
