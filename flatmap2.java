import java.util.Arrays;
import java.util.List;

public class flatmap2 {
    public static void main(String[]args){
      List  <List<Integer>>numbers= Arrays.asList(Arrays.asList(1,2),Arrays.asList(3,4),Arrays.asList(5,6));
        numbers.stream().flatMap(List::stream).forEach(System.out::println);
    }
}
