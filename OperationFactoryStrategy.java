public class OperationFactoryStrategy {
    public int performOperation(String operator) {
        int results;
        switch(operator) {
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
            case "/":
                Division myDivision = new Division();
                results = myDivision.calculate(myNumb);
            default:
                System.out.println("Invalid operation");
                results = 0;
          }
    }
}
