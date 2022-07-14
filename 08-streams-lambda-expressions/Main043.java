import java.util.*;
import java.util.stream.*;

public class Main043 {
  public static void main(String... args) {
    IntSummaryStatistics stats = IntStream.iterate(0, i -> i + 1)
      .limit(10)
      .summaryStatistics();

    System.out.println(stats.getSum());
    System.out.println(stats.getCount());
    System.out.println(stats.getMax());
  }
}
