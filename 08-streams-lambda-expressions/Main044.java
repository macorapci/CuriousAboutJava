import java.util.*;
import java.util.stream.*;

public class Main044 {
  public static void main(String... args) {
    Stream.generate(() -> 10)
      .limit(5);
  }
}
