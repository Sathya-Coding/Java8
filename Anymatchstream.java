import java.util.Arrays;
import java.util.List;

public class Anymatchstream {
    public static void main(String[]args){
        List<Integer>numbers= Arrays.asList(3, 7, 12, 19, 21);
        boolean result=numbers.stream().anyMatch(n->n%5==0);
        System.out.println(result);
    }
}
