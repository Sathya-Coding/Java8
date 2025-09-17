import java.util.Arrays;
import java.util.List;

public class StreamCount {
    public static void main(String[]args){
        List<Integer>numbers= Arrays.asList(10, 15, 20, 25, 30);
        long count=numbers.stream().filter(n->n%5==0).count();
        System.out.println(count);
    }
}
