import java.util.Random;
import java.util.stream.Stream;

public class generate {
    public static void main(String[] args) {
        Stream.generate(() -> new Random().nextInt(10))
                .limit(4)
                .forEach(System.out::println);
    }

}
