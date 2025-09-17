import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DistinctStream {
    public static void main(String[]args){
        List<Integer>numbers= Arrays.asList(2, 4, 2, 8, 6, 8, 10, 6);
        List<Integer>distinctlist=numbers.stream().distinct().collect(Collectors.toList());
        System.out.println(distinctlist);
    }
}
