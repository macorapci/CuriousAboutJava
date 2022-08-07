import java.util.concurrent.*;

public class Main002 {
  public static void main(String[] args) {
    Callable callable = new Callable() {
      public Object call() {
        System.out.println("X");
        return 10;
      }
    };

    var s = Executors.newScheduledThreadPool(1);

    for (int i = 0; i < 10; i++) {
      Future f = s.submit(callable);
      f.get();
    }

    s.shutdown();
    System.out.println("!Y!");
  }
}
