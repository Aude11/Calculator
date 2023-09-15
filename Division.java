import java.util.ArrayList;

public class Division implements Calculation{
    public int calculate(ArrayList<Integer> numbers) {
        int sum = numbers.get(0);
        for (int i = 1; i < numbers.size(); i++) {
            if (numbers.get(i) == 0){
                return 0; // handle expection better
            }
            sum /= numbers.get(i); // expection for int div  by 0
        }
          return sum;
    }
}
