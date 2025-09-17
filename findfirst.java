import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class findfirst {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Jane", "Jack", "Jill");

        Optional<String> first = names.stream()
                .filter(n -> n.startsWith("J"))
                .findFirst();

        first.ifPresent(n -> System.out.println("First name starting with J: " + n));
    }

}
