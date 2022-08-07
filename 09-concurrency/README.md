# Concurrency

 ````console
macorapci@monster:~/CuriousAboutCoding$ java --version
openjdk 11.0.14 2022-01-18
OpenJDK Runtime Environment (build 11.0.14+9-Ubuntu-0ubuntu2.20.04)
OpenJDK 64-Bit Server VM (build 11.0.14+9-Ubuntu-0ubuntu2.20.04, mixed mode, sharing) 
````

## Main001

````java
import java.util.concurrent.*;

public class Main001 {
  public static void main(String[] args) {
    Callable callable = new Callable() {
      public Object run() {
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

````
<details>
<summary>Click For Output!</summary>

````console
$ javac Main001.java
Main001.java:5: error: <anonymous Main001$1> is not abstract and does not override abstract method call() in Callable
    Callable callable = new Callable() {
                                       ^
Note: Main001.java uses unchecked or unsafe operations.
Note: Recompile with -Xlint:unchecked for details.
1 error
$

````
</details>


## Main002

````java
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

````
<details>
<summary>Click For Output!</summary>

````console
$ javac Main002.java
Main002.java:16: error: unreported exception InterruptedException; must be caught or declared to be thrown
      f.get();
           ^
Note: Main002.java uses unchecked or unsafe operations.
Note: Recompile with -Xlint:unchecked for details.
1 error
$

````
</details>


## Main003

````java
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

````
<details>
<summary>Click For Output!</summary>

````console
$ javac Main003.java
Note: Main003.java uses unchecked or unsafe operations.
Note: Recompile with -Xlint:unchecked for details.
$ java Main003
X
X
X
X
X
X
X
X
X
X
!Y!
$

````
</details>


## Main004

````java
import java.util.concurrent.*;

public class Main004 {
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
      /*
      try {
         f.get(); 
      } catch (Exception e) {
        //TODO: handle exception
        e.printStackTrace();
      }
      */
    }

    s.shutdown();
    System.out.println("!Y!");
  }
}

````
<details>
<summary>Click For Output!</summary>

````console
$ java Main004
!Y!
X
X
X
X
X
X
X
X
X
X
$ javac Main004.java
Note: Main004.java uses unchecked or unsafe operations.
Note: Recompile with -Xlint:unchecked for details.
$

````
</details>


## Main005

````java
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

````
<details>
<summary>Click For Output!</summary>

````console
$ javac Main005.java
$ java Main005
false
true
false
true
false
true
false
false
true
true
false
true
true
false
true
false
true
false
false
true
$

````
</details>


## Main006

````java
import java.util.concurrent.*;
import java.util.concurrent.locks.*;
import java.lang.InterruptedException;

public class Main006 {
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
      Thread.sleep(100);
    }
  }
}

class Foo006 {
  private Lock lock = new ReentrantLock();

  public void lockUp() {
    if (lock.tryLock()) {
      lock.lock();
      System.out.println("Locked Up!");
      lock.unlock();
    }
  }
}

````
<details>
<summary>Click For Output!</summary>

````console
$ javac Main006.java
$ java Main006
Locked Up!
$

````
</details>


## Main007

````java
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
      Thread.sleep(100);
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

````
<details>
<summary>Click For Output!</summary>

````console
$ javac Main007.java
$ java Main007
Locked Up!
Locked Up!
Locked Up!
Locked Up!
Locked Up!
$

````
</details>


## Main008

````java
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

````
<details>
<summary>Click For Output!</summary>

````console
$ javac Main008.java
Main008.java:5: error: class Main007 is public, should be declared in a file named Main007.java
public class Main007 {
       ^
1 error
$

````
</details>


## Main009

````java
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



````
<details>
<summary>Click For Output!</summary>

````console
$ javac Main009.java
$ java Main009
Success one
Success four
$

````
</details>


## Main010

````java
import java.util.concurrent.*;
import java.util.concurrent.locks.*;
import java.lang.InterruptedException;
import java.util.*;

public class Main010 {
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

  private static void bar() {  //throws InterruptedException {
    var s = Executors.newCachedThreadPool();
    Future result = s.submit(() -> System.out.println(10));
    s.shutdown();
    System.out.println(result.get());
  } 
}

````
<details>
<summary>Click For Output!</summary>

````console
$ javac Main010.java
Main010.java:11: error: exception InterruptedException is never thrown in body of corresponding try statement
      } catch (InterruptedException e) {
        ^
Main010.java:36: error: unreported exception InterruptedException; must be caught or declared to be thrown
    System.out.println(result.get());
                                 ^
2 errors
$

````
</details>


## Main011

````java
import java.util.concurrent.*;
import java.util.concurrent.locks.*;
import java.lang.InterruptedException;
import java.util.*;

public class Main011 {
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
    var s = Executors.newCachedThreadPool();
    Future result = s.submit(() -> System.out.println(10));
    s.shutdown();
    System.out.println(result.get());
  } 
}

````
<details>
<summary>Click For Output!</summary>

````console
$ javac Main011.java
$ java Main011
10
null
$

````
</details>


## Main012

````java
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

````
<details>
<summary>Click For Output!</summary>

````console
$ javac Main012.java
Main012.java:7: error: cannot find symbol
    Executors.newFixedScheduledThreadPool();
             ^
  symbol:   method newFixedScheduledThreadPool()
  location: class Executors
Main012.java:8: error: cannot find symbol
    Executors.newThreadPool();
             ^
  symbol:   method newThreadPool()
  location: class Executors
2 errors
$

````
</details>


## Main013

````java
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

````
<details>
<summary>Click For Output!</summary>

````console
$ java Main013
AAAA
null, 3.14
$ javac Main013.java
$

````
</details>


## Main014

````java
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

````
<details>
<summary>Click For Output!</summary>

````console
$ java Main014
*************
First!
Second!
*************
*************
First!
Second!
*************
*************
Second!
First!
*************
*************
Second!
First!
*************
*************
Second!
First!
*************
*************
Second!
First!
*************
*************
Second!
First!
*************
*************
Second!
First!
*************
*************
Second!
First!
*************
*************
Second!
First!
*************
*************
Second!
First!
*************
*************
First!
Second!
*************
*************
Second!
First!
*************
*************
Second!
First!
*************
*************
Second!
First!
*************
*************
Second!
First!
*************
*************
Second!
First!
*************
*************
Second!
First!
*************
*************
Second!
First!
*************
*************
Second!
First!
*************
$ javac Main014.java
$

````
</details>



