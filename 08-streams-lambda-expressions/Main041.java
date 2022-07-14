import java.util.*;
import java.util.stream.*;

public class Main041 {
  public static void main(String... args) {
    var one = List.of(1, 2);
    var two = List.of(3, 4);
    var count = Stream.of(one, two)
      .flatMapToInt(List::stream)
      .peek(System.out::println)
      .count();

    System.out.println("count: " + count);
  }
}
