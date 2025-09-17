import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamCollectors {
    public static void main(String[]args){
        List<String>Names= Arrays.asList("John","Alice","Bob","Kenny");
        List<String>result=Names.stream().filter(name->name.startsWith("A")).collect(Collectors.toList());
        System.out.println(result);
    }
}
