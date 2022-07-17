import java.util.stream.*;
import java.util.function.*;
import java.util.*;

public class Main059 {
  private static BooleanSupplier supp;

  static {
    supp = () -> true;
  }

  public static void main(String... args) {
    if (supp.get()) {
      System.out.println("true");
    } else {
      System.out.println("false");
    }
  }
}
