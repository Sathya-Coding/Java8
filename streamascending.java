import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class streamascending {
    public static void main(String[]args){
        List<Integer>numbers= Arrays.asList(9, 1, 6, 3, 8, 2);
        List<Integer>Sortedlist=numbers.stream().sorted().collect(Collectors.toList());
        System.out.println(Sortedlist);
    }
}
