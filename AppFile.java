import java.util.Scanner;  // Import the Scanner class
import java.util.ArrayList; // import the ArrayList class
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors

public class AppFile {
    public static void main(String[] args) {
        System.out.println("Welcome to the calculator!"); // Display the string.
        String paternRepeated = "=";
        System.out.println(paternRepeated.repeat(30)); // Display the string.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose an operation:");
        String operation = scanner.next();
        System.out.println("Enter a file:");
        String fileName = scanner.next();
        ArrayList<Integer> myNumb = new ArrayList<Integer>();
        //String curDir = System.getProperty("user.dir");
        //System.out.println(curDir);
        try {
            File myFile = new File("file.txt"); // Specify the filename+
            int number;
            Scanner myReader = new Scanner(myFile);
            while (myReader.hasNextLine()) {
            String data = myReader.nextLine();
            number = Integer.parseInt(data);
            System.out.println(data);
            myNumb.add(number);
            }
            myReader.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
          }
        int results;
        OperationFactoryStrategy factory = new OperationFactoryStrategy();
        results = factory.performOperation(operation, myNumb);
        String data = "Results = " + results;
        System.out.println(data);
        Loggin myResults = new Loggin("results.txt");
        myResults.createFile();
        myResults.writeOnFile(data);
            }
        
}