import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Lambda1stFind {
    public static void main(String[]args){
        List<String>vehicles= Arrays.asList("Car","Bike","Bus","Cycle");
        Optional<String>result= vehicles.stream().filter(v->(v.startsWith("B"))).findFirst();
        result.ifPresent(System.out::println);

    }
}
