import java.util.concurrent.*;
import java.util.concurrent.locks.*;
import java.lang.InterruptedException;
import java.util.*;

public class Main009 {
  public static void main(String[] args) {
    Runnable runnable = () -> {
      try {
        bar();
      } catch (InterruptedException e) {
        System.err.println("Main InterruptedException");
      }
    };

    /*
      Don't interest with bottom. 
      Focus with what runnable will do.
      Try to find Runnable execute could be succes or stuck in Deadlock or something else
    */
    ExecutorService s = Executors.newSingleThreadExecutor();
    s.execute(runnable);
    s.shutdown();

    try {
      s.awaitTermination(10L, TimeUnit.SECONDS);
    } catch (Exception ex) {
      System.err.println("Couldn't finish in 10 sec.");
    }
  }

  private static void bar() throws InterruptedException {
    List<String> list = List.of("0", "1", "2", "3", "4", "5", "6", "7");

    try {
      var one = new CopyOnWriteArrayList<String>(list);
      for (String a: one) {
        one.remove(a);
      }

      System.out.println("Success one");
    } catch (Exception ex) {
      System.err.println("Error one");
    }

    try {
      var two = Collections.synchronizedList(list);
      for (String a: two) {
        two.remove(a);
      }

      System.out.println("Success two");
    } catch (Exception ex) {
      System.err.println("Error two");
    }

    try {
      var three = new ArrayList<String>(list);
      for (String a: three) {
        three.remove(a);
      }

      System.out.println("Success three");
    } catch (Exception ex) {
      System.err.println("Error three");
    }

    try {
      var four = new ConcurrentLinkedQueue<String>(list);
      for (String a: four) {
        four.remove(a);
      }

      System.out.println("Success four");
    } catch (Exception ex) {
      System.err.println("Error four");
    }
  }
}


