import java.util.Arrays;
import java.util.List;

public class MapStringLambda {
    public static void main(String[]args){
        List<String>words= Arrays.asList("lamda","java","streams");
        words.stream().map(s -> s.toUpperCase()).forEach(System.out::println);
    }
}
