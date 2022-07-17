import java.util.function.*;

public class Main054 {
    public static void main(String[] args) {
      System.out.println("How many line will be compile?");
      Predicate<String> one = (final String s) -> s.isEmpty();
      Predicate<String> one = (final s) -> s.isEmpty();
      Predicate<String> one = (final var s) -> s.isEmpty();
      Predicate<String> one = (String s) -> s.isEmpty();
      Predicate<String> one = (var s) -> s.isEmpty();
    }
}
