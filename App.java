import java.util.Scanner;  // Import the Scanner class

public class App {
    public static void main(String[] args) {
        System.out.println("Welcome to the calculator!"); // Display the string.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number, enter second number and an operation to perform on them: +, - or *");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        String operation = scanner.next();
        int results;

        switch(operation) {
            case "+":
                Addition myAdd = new Addition(); // I only need to create this obj if + op 
                results = myAdd.calculate(number1, number2);
                break;
            case "-":
                Substraction mySubtraction = new Substraction(); 
                results = mySubtraction.calculate(number1, number2);
                break;
            case "*":
                Multiplication myMultiplication = new Multiplication();
                results = myMultiplication.calculate(number1, number2);
                break;
            default:
                System.out.println("Invalid operation");
                number1 = 0;
                number2 = 0;
                results = 0;
          }
        System.out.println(number1 + " " + operation + " " + number2 + " " + "=" + " " + results);
            }
}