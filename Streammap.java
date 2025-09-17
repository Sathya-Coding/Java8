import java.util.Arrays;
import java.util.List;

public class Streammap {
    public static void main(String[]args){
        List<String>words= Arrays.asList("api","stream","java");
        words.stream().map(s1->s1.toUpperCase()).forEach(System.out::println);
    }
}
