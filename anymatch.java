import java.util.Arrays;
import java.util.List;

public class anymatch {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Jane", "Jack");

        boolean result = names.stream().anyMatch(n -> n.startsWith("J"));
        System.out.println("Any name starts with J? " + result);
}

}
