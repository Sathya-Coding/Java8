import java.util.Arrays;
import java.util.List;

public class StreamSorted {
    public static void main(String[]args){
        List<String>names= Arrays.asList("John", "Alice", "David", "Bob");
        names.stream().sorted().forEach(System.out::println);
    }
}
