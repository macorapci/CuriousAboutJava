import java.util.concurrent.*;

public class Main012 {
  public static void main(String[] args) {
    System.out.println("Which of will get compile error");

    Executors.newFixedScheduledThreadPool();
    Executors.newThreadPool();
    Executors.newFixedThreadPool(2);
    Executors.newSingleThreadExecutor();
    Executors.newSingleThreadScheduledExecutor();
  } 
}
