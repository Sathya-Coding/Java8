import java.util.Arrays;
import java.util.List;

public class SortStringLengthLambda {
    public static void main(String[]args){
        List<String>Fruits= Arrays.asList("Apple","Banana","Kiwi","Grapes");
        Fruits.sort((s1,s2)->s1.length()-s2.length());
        System.out.println(Fruits);
    }

}
