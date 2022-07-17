import java.util.*;

public class Main058 {
  public static void main(String... args) {
    List.of("aa", "bb", "cc")
      .limit(1)
      .map(String::toUpperCase)
      .forEach(System.out::println);
  }
}
