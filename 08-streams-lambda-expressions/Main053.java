import java.util.function.*;

public class Main053 {
    public static void main(String[] args) {
      var s = "AAAAA";
      Predicate<String> a = s::contains;
      System.out.println(a.test("A"));
    }
}
