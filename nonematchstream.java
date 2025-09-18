import java.util.Arrays;
import java.util.List;

public class nonematchstream {
    public static void main(String[]args){
        List<String>fruits= Arrays.asList("apple", "banana", "cherry");
        Boolean Result=fruits.stream().noneMatch(n->n.startsWith("z"));
        System.out.println(Result);
    }
}
