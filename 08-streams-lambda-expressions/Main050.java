import java.util.function.*;

public class Main050 {
    public static void main(String[] args) {
      DoubleToIntFunction f = p -> p * 100;
      System.out.println(f.apply(0.10));
    }
}
