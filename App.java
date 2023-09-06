import java.util.Scanner;  // Import the Scanner class

public class App {
    public static void main(String[] args) {
        System.out.println("Welcome to the calculator!"); // Display the string.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number, enter second number and an operation to perform on them: +, - or *");
        double number1 = scanner.nextDouble();
        double number2 = scanner.nextDouble();
        String input = scanner.next();
        double results;
        if (input.equals("+")) { // comparing two strings use equals method as two different objs with same value
        results = number1 + number2;
        } else if (input.equals("-")) {
            results = number1 - number2;
        } else {
            results = number1 * number2;
        }
        System.out.println("The results is " + results);
            }
}
