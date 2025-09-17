import java.util.Arrays;
import java.util.List;

public class ComparatorLambda {
    public static void main(String[]args){
        List<Integer>numbers= Arrays.asList(5,2,9,7,1);
        numbers.sort((a,b)->a-b);
        System.out.println(numbers);
    }
}
