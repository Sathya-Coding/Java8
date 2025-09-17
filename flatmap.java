import java.util.Arrays;
import java.util.List;

public class flatmap {
    public static void main(String[] args) {
        List<List<String>> names = Arrays.asList(
                Arrays.asList("John", "Jane"),
                Arrays.asList("Jack", "Jill")
        );

        names.stream()
                .flatMap(List::stream)
                .forEach(System.out::println);
    }

}
