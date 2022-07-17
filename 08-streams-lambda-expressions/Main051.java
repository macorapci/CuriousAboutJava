import java.util.function.*;
import java.util.*;

public class Main051 {
    public static void main(String[] args) {
      List<Integer> list = List.of(0, 1, 2, 3, 4, 5, 6, 7);
      Consumer<Integer> cons = a -> System.out.println(a);
      Function<Integer, String> func = a -> a + "";

      list.forEach(cons);
      list.forEach(func);
    }
}
