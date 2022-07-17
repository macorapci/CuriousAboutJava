import java.util.function.*;
import java.util.*;

public class Main056 {
    public static void main(String[] args) {
      System.out.println("How many will be compiled?");
      IntFunction<Integer> one = (Integer i) -> f;
      IntFunction<Integer> two = (i) -> null;
      IntFunction<Integer> three = i -> i;
      IntFunction<Integer> four = () -> 5;
      IntFunction<Integer> five = () -> Integer.valueOf(0);
    }
}
