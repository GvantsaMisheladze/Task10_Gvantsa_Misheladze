import java.util.Arrays;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("dog", "cat", "elephant", "tiger", "lion", "ant");
        words.stream()
                .filter(word -> word.length() > 4)
                .map(String::toLowerCase)
                .sorted()
                .forEach(System.out::println);
    }
}
