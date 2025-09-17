import java.util.Arrays;
import java.util.List;

public class nonematch {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 3, 5);

        boolean result = numbers.stream().noneMatch(n -> n % 2 == 0);
        System.out.println("No evens? " + result);
 }

}
