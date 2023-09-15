import java.util.Scanner;  // Import the Scanner class
import java.util.ArrayList; // import the ArrayList class

public class App {
    public static void main(String[] args) {
        System.out.println("Welcome to the calculator!"); // Display the string.
        String paternRepeated = "=";
        System.out.println(paternRepeated.repeat(30)); // Display the string.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose an operation:");
        String operation = scanner.next();
        int results;
        System.out.println("How many numbers?");
        int count = scanner.nextInt();
        int i = 0;
        String userInput;
        ArrayList<Integer> myNumb = new ArrayList<Integer>();
        int number;
          do {
            System.out.println("Enter number " + (i+1) + ":");
            userInput = scanner.next();
            if (userInput.equals("done")) {
                break;
            }
            number = Integer.parseInt(userInput);
            myNumb.add(number);
            i++;
          }
          while (i < count);

        switch(operation) {
            case "+":
                Addition myAdd = new Addition(); // only need to create this obj if + op 
                results = myAdd.calculate(myNumb);
                break;
            case "-":
                Substraction mySubtraction = new Substraction(); 
                results = mySubtraction.calculate(myNumb);
                break;
            case "*":
                Multiplication myMultiplication = new Multiplication();
                results = myMultiplication.calculate(myNumb);
                break;
            default:
                System.out.println("Invalid operation");
                results = 0;
          }
        System.out.println("Results = "+ results);
            }
}