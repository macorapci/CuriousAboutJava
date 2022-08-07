import java.util.concurrent.*;

public class Main003 {
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
      try {
         f.get(); 
      } catch (Exception e) {
        //TODO: handle exception
        e.printStackTrace();
      }
    }

    s.shutdown();
    System.out.println("!Y!");
  }
}
