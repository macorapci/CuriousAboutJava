import java.util.function.*;
import java.util.*;

public class Main055 {
    public static void main(String[] args) {
      List<String> list = List.of("0", "1", "2", "3");
      list.removeIf(e -> e < 1);
      list.forEach(x -> System.out.println(x));
    }
}
