import java.util.concurrent.*;
import java.util.concurrent.locks.*;
import java.lang.InterruptedException;
import java.util.*;

public class Main014 {
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
    for (var k = 0; k < 20; k++) {
      System.out.println("*************");
      car();
      System.out.println("*************");
    }
  }


  private static void car() throws InterruptedException, ExecutionException {
    ExecutorService s = Executors.newFixedThreadPool(2);
    Future<?> f1 = s.submit(() -> firstJob());
    Future<?> f2 = s.submit(() -> secondJob());
    f1.get();
    f2.get();
    s.shutdown();
  }

  private static void firstJob() {
    ExecutorService s = Executors.newFixedThreadPool(3);
    try {
      Callable<Integer> call = () -> sleep();
      final var r = List.of(call, call, call);
      var results = s.invokeAll(r);
    } catch (Exception ex) {
      System.err.println(ex);
    }

    System.out.println("First!");
    s.shutdown();
  }

  private static void secondJob() {
    ExecutorService s = Executors.newFixedThreadPool(3);

    try {
      Callable<Integer> call = () -> sleep();
      final var r = List.of(call, call, call);
      var results = s.invokeAny(r);
    } catch (Exception ex) {
      System.err.println(ex);
    }

    System.out.println("Second!");
    s.shutdown();
  }

  private static int sleep() {
    try {
      Thread.sleep(100);
    } catch (Exception e) {
      // don't do that
    }

    return 1;
  }
}
