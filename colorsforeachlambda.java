import java.util.Arrays;
import java.util.List;

public class colorsforeachlambda {
    public static void main(String[]args){
        List<String>colors= Arrays.asList("red","green","blue");
        colors.forEach(System.out::println);
    }
}
