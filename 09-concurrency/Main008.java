import java.util.concurrent.*;
import java.util.concurrent.locks.*;
import java.lang.InterruptedException;

public class Main007 {
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
    var foo = new Foo006();
    for (int i = 0; i < 5; i++) {
      new Thread(() -> foo.lockUp()).start();
      // Thread.sleep(100);
    }
  }
}

class Foo006 {
  private Lock lock = new ReentrantLock();

  public void lockUp() {
    if (lock.tryLock()) {
      // lock.lock();
      System.out.println("Locked Up!");
      lock.unlock();
    }
  }
}
