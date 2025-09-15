import java.util.Arrays;
import java.util.List;

public class ForeachLambda {
    public static void main(String[]args){
        List<String>fruits= Arrays.asList("Apple","Banana","Mango");
        fruits.forEach(f->System.out.println(f));
        fruits.forEach(System.out::println);
    }
}
