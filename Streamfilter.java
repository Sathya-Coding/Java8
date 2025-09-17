import java.util.Arrays;
import java.util.List;

public class Streamfilter {
    public static void main(String[]args){
        List<Integer>numbers= Arrays.asList(12, 3, 45, 6, 89, 34, 22);
        numbers.stream().filter(n->n>20).forEach(System.out::println);
    }
}
