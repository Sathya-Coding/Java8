import java.util.Arrays;
import java.util.List;

public class sorted {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Jack", "John", "Jane");

        names.stream()
                .sorted()
                .forEach(System.out::println);
}

}
