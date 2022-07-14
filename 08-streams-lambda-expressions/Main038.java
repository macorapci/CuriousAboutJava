import java.util.stream.*;
import java.util.*;

public class Main038 {
  public static void main(String... args) {
    var value = List.of(new StringBuilder("AAA"), new StringBuilder("BBB"), new StringBuilder("CCC"), new StringBuilder("DDD"))
      .stream()
      .reduce(
          0,
          (before, after) -> {
            System.out.println("first lambda -> " + before + ", " + after);
            return before + after.length();
          },
          (before, after) -> {
            System.out.println("second lambda -> " + before + ", " + after);
            return before + after;
          });

    System.out.println("value: " + value);
  }
}
