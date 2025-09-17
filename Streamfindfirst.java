import java.util.Arrays;
import java.util.List;

public class Streamfindfirst {
    public static void main(String[]args){
        List<Integer>numbers= Arrays.asList(11, 22, 33, 44, 55);
        numbers.stream().filter(n->n>20).findFirst().ifPresent(n->System.out.println(n));
    }
}
