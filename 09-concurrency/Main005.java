import java.util.concurrent.*;
import java.util.concurrent.atomic.*;

public class Main005 {
  private AtomicBoolean atom = new AtomicBoolean(false);

  boolean turn() {
    return atom.getAndSet(!atom.get());
  }

  public static void main(String[] args) {
    var main = new Main005();
    ExecutorService s = Executors.newCachedThreadPool();

    for (int i = 0; i < 20; i++) {
      s.execute(() -> System.out.println(main.turn()));
    }

    s.shutdown();
  }
}
