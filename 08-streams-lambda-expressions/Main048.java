import java.util.stream.*;

public class Main48 {
  public static void main(String... args) {
    LongStream.of(0, 1, 2, 3, 4, 5, 6, 7)
      .mapToInt(a -> a)
      .forEach(System.out::println);
  }
}
