import java.util.ArrayList;

public class OperationFactoryStrategy {
    public int performOperation(String operator, ArrayList<Integer> myNumb) {
        switch(operator) {
            case "+":
                Addition myAdd = new Addition(); // only need to create this obj if + op 
                return myAdd.calculate(myNumb);
            case "-":
                Substraction mySubtraction = new Substraction(); 
                return mySubtraction.calculate(myNumb);
            case "*":
                Multiplication myMultiplication = new Multiplication();
                return myMultiplication.calculate(myNumb);
            case "/":
                Division myDivision = new Division();
                return myDivision.calculate(myNumb);
            default:
                System.out.println("Invalid operation");
          }
    }
}
