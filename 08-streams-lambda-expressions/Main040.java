import java.util.*;
import java.util.stream.*;

public class Main040 {
  public static void main(String... args) {
    var map = Stream.of(Boolean.TRUE, Boolean.TRUE, null)
      .collect(Collectors.partitioningBy(b -> b));

    System.out.println(map);
  }
}
