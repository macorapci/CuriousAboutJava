import java.util.stream.*;
import java.util.*;

public class Main060 {
  public static void main(String... args) {
    List.of(0, 1, 2, 3, 4, 5, 6, 7)
      .parallelStream()
      .collect(Collectors.groupingByConcurrent(x -> x % 2))
      .forEach(System.out::println);
  }
}
