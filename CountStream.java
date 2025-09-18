import java.util.Arrays;
import java.util.List;

public class CountStream {
    public static void main(String[]args){
        List<String>Names= Arrays.asList("apple", "banana", "cherry", "apple", "banana");
        long count=Names.stream().count();
        System.out.println("Total Names: "+count);
    }
}
