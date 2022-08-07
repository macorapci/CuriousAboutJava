import java.util.concurrent.*;
import java.util.concurrent.locks.*;
import java.lang.InterruptedException;
import java.util.*;

public class Main013 {
  public static void main(String[] args) throws InterruptedException {
    Runnable runnable = () -> {
      try {
        bar();
      } catch (InterruptedException e) {
        System.err.println("Main InterruptedException");
      } catch (ExecutionException e) {
        System.err.println("Main ExecutionException");
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

  private static void bar() throws InterruptedException, ExecutionException {
    ExecutorService s = Executors.newSingleThreadExecutor();
    Future<?> f1 = s.submit(() -> System.out.println("AAAA"));
    Future<?> f2 = s.submit(() -> 3.14);
    System.out.println(f1.get() + ", " + f2.get());
    s.shutdown();
  } 
}
