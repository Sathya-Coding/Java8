import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Collectuppercase {
    public static void main(String[]args){
        List<String>words= Arrays.asList("dog", "cat", "elephant");
        List<String>UpperList=words.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(UpperList);
    }
}
