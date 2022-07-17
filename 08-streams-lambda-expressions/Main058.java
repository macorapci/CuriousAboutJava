import java.util.stream.*;
import java.util.*;

public class Main058 {
  public static void main(String... args) {
    Stream<Integer> stream = Stream.of(5, 8, 6, 10, 1);

    Comparator<Integer> comp = (a, b) -> {
      System.out.println("a: " + a + " b: " + b + " a-b: " + (a-b));
      return a-b;
    };

    stream.sorted(comp).forEach(System.out::println);
  }
}
