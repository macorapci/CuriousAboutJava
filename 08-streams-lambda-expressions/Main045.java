import java.util.*;

public class Main045 {
  public static void main(String... args) {
    Optional<String> opt = Optional.empty();
    try{
      System.out.println(opt.orElseThrow());
    } catch(Exception ex) {
      ex.printStackTrace();
    }

    System.out.println("****************************");

    try{
      System.out.println(opt.orElseThrow(() -> new Exception("AAAAAA:")));
    } catch(Exception ex) {
      ex.printStackTrace();
    }
  }
}
