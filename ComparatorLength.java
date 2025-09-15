import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ComparatorLength {
    public static void main(String[]args){
        List<String>names= Arrays.asList("Alice","John","Bob");
        Collections.sort(names,(a,b)->a.compareTo(b));
        System.out.println("Sorted Names:"+names);
    }
}
