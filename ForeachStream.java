import java.util.Arrays;
import java.util.List;

public class ForeachStream {
    public static void main(String[]args){
        List<Integer>numbers= Arrays.asList(5,10,15,20,25);
        numbers.stream().forEach(System.out::println);
    }
}
