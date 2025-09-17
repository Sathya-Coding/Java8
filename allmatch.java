import java.util.Arrays;
import java.util.List;

public class allmatch {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2, 4, 6, 8);

        boolean result = numbers.stream().allMatch(n -> n % 2 == 0);
        System.out.println("All even? " + result);
 }

}
