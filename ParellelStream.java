import java.util.Arrays;
import java.util.List;

public class ParellelStream {
    public static void main(String[]args){
        List<Integer>numbers= Arrays.asList(40, 55,60,70,10,95);
        numbers.parallelStream().filter(n->n>50).forEach(System.out::println);
    }
}
