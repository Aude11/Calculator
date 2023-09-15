import java.util.ArrayList;

public class Division implements Calculation{
    public int calculate(ArrayList<Integer> numbers) {
        int sum = numbers.get(0);
        for (int i = 1; i < numbers.size(); i++) {
            sum /= numbers.get(i);
        }
          return sum;
    }
}
