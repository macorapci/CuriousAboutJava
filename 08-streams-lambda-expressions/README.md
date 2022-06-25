# Arrays and Collections

 ````console
macorapci@monster:~/CuriousAboutCoding$ java --version
openjdk 11.0.14 2022-01-18
OpenJDK Runtime Environment (build 11.0.14+9-Ubuntu-0ubuntu2.20.04)
OpenJDK 64-Bit Server VM (build 11.0.14+9-Ubuntu-0ubuntu2.20.04, mixed mode, sharing) 
````

## Main001

````java
import java.util.*;

public class Main001 {
	public static void main(String... args) {
		List.of(0, 1, 2, 3, 4).stream()
			.foreach(System.out::println);

		List.of(10, 11, 12, 13, 14).parallel()
			.foreach(System.out::println);

		List.of(20, 21, 22, 23, 24).parallel()
                        .foreachOrdered(System.out::println);
	}
}

````
<details>
<summary>Click For Output!</summary>

````console
$ javac Main001.java
Main001.java:6: error: cannot find symbol
			.foreach(System.out::println);
			^
  symbol:   method foreach(System.out::println)
  location: interface Stream<Integer>
Main001.java:8: error: cannot find symbol
		List.of(10, 11, 12, 13, 14).parallel()
		                           ^
  symbol:   method parallel()
  location: interface List<Integer>
Main001.java:11: error: cannot find symbol
		List.of(20, 21, 22, 23, 24).parallel()
		                           ^
  symbol:   method parallel()
  location: interface List<Integer>
3 errors
$

````
</details>


## Main002

````java
import java.util.*;

public class Main002 {
	public static void main(String... args) {
		List.of(0, 1, 2, 3, 4).stream()
			.foreach(System.out::println);

		List.of(10, 11, 12, 13, 14).parallelStream()
			.foreach(System.out::println);

		List.of(20, 21, 22, 23, 24).parallelStream()
                        .foreachOrdered(System.out::println);
	}
}

````
<details>
<summary>Click For Output!</summary>

````console
$ javac Main002.java
Main002.java:6: error: cannot find symbol
			.foreach(System.out::println);
			^
  symbol:   method foreach(System.out::println)
  location: interface Stream<Integer>
Main002.java:9: error: cannot find symbol
			.foreach(System.out::println);
			^
  symbol:   method foreach(System.out::println)
  location: interface Stream<Integer>
Main002.java:12: error: cannot find symbol
                        .foreachOrdered(System.out::println);
                        ^
  symbol:   method foreachOrdered(System.out::println)
  location: interface Stream<Integer>
3 errors
$

````
</details>


## Main003

````java
import java.util.*;

public class Main003 {
	public static void main(String... args) {
		List.of(0, 1, 2, 3, 4).stream()
			.forEach(System.out::println);

		List.of(10, 11, 12, 13, 14).parallelStream()
			.forEach(System.out::println);

		List.of(20, 21, 22, 23, 24).parallelStream()
                        .forEachOrdered(System.out::println);
	}
}

````
<details>
<summary>Click For Output!</summary>

````console
$ java Main003
0
1
2
3
4
12
14
13
11
10
20
21
22
23
24
$ javac Main003.java
$

````
</details>


## Main004

````java
import java.util.function.UnaryOperator;

public class Main004 {
	public static void main(String... args) {
		// UnaryOperator<T> extends Function<T, T>
		UnaryOperator operator = x -> x * 2;
		System.out.println(operator.apply(3.0));
	}
}

````
<details>
<summary>Click For Output!</summary>

````console
$ javac Main004.java
Main004.java:6: error: bad operand types for binary operator '*'
		UnaryOperator operator = x -> x * 2;
		                                ^
  first type:  Object
  second type: int
Note: Main004.java uses unchecked or unsafe operations.
Note: Recompile with -Xlint:unchecked for details.
1 error
$

````
</details>


## Main005

````java
import java.util.function.UnaryOperator;

public class Main005 {
	public static void main(String... args) {
		// UnaryOperator<T> extends Function<T, T>
		UnaryOperator<Double> operator = x -> x * 2;
		System.out.println(operator.apply(3.0));
	}
}

````
<details>
<summary>Click For Output!</summary>

````console
$ javac Main005.java
$ java Main005
6.0
$

````
</details>


## Main006

````java
import java.util.*;

public class Main006 {
	public static void main(String... args) {
		Comparator<String> comp = (s1, s2) -> 007;
		System.out.println(comp.compare("100", "200"));
		System.out.println(comp.compare("AAb", "AAA"));
	}
}

````
<details>
<summary>Click For Output!</summary>

````console
$ javac Main006.java
$ java Main006
7
7
$

````
</details>


## Main007

````java
import java.util.*;
import java.util.function.*;

public class Main007 {
	public static void main(String... args) {
		ToIntFunction<Integer> toInt = x -> x * 2;
		var foo = List.of(0, 1, 2, 3)
			.stream()
			.mapToInt(toInt)
			.sum();
	
		System.out.println(foo);
	}
}

````
<details>
<summary>Click For Output!</summary>

````console
$ javac Main007.java
$ java Main007
12
$

````
</details>


## Main008

````java
import java.util.stream.*;

public class Main008 {
	public static void main(String... args) {
		var stream = Stream.of(0, 1, 2, 3, 4);

		System.out.println(stream.min().get());
	}
}

````
<details>
<summary>Click For Output!</summary>

````console
$ javac Main008.java
Main008.java:7: error: method min in interface Stream<T> cannot be applied to given types;
		System.out.println(stream.min().get());
		                         ^
  required: Comparator<? super Integer>
  found: no arguments
  reason: actual and formal argument lists differ in length
  where T is a type-variable:
    T extends Object declared in interface Stream
1 error
$

````
</details>


## Main009

````java
import java.util.stream.*;

public class Main009 {
	public static void main(String... args) {
		Stream<Integer> stream = Stream.of(0, 1, 2, 3, 4);

		System.out.println(stream.min().get());
	}
}

````
<details>
<summary>Click For Output!</summary>

````console
$ javac Main009.java
Main009.java:7: error: method min in interface Stream<T> cannot be applied to given types;
		System.out.println(stream.min().get());
		                         ^
  required: Comparator<? super Integer>
  found: no arguments
  reason: actual and formal argument lists differ in length
  where T is a type-variable:
    T extends Object declared in interface Stream
1 error
$

````
</details>


## Main010

````java
import java.util.stream.*;

public class Main010 {
	public static void main(String... args) {
		var stream = IntStream.of(0, 1, 2, 3, 4);

		System.out.println(stream.min().get());
	}
}

````
<details>
<summary>Click For Output!</summary>

````console
$ javac Main010.java
Main010.java:7: error: cannot find symbol
		System.out.println(stream.min().get());
		                               ^
  symbol:   method get()
  location: class OptionalInt
1 error
$

````
</details>


## Main011

````java
import java.util.function.*;

public class Main011 {
	public static void main(String... args) {
		Supplier<String> supplier = String::new;
		System.out.println("Value: " + supplier.get());
	}
}

````
<details>
<summary>Click For Output!</summary>

````console
$ java Main011
Value: 
$ javac Main011.java
$

````
</details>


## Main012

````java
import java.util.function.*;

public class Main012 {
	public static void main(String... args) {
		Consumer<Integer> consumer = (x) -> x * 3;

		System.out.println(comsumer.accept(10));
	}
}

````
<details>
<summary>Click For Output!</summary>

````console
$ javac Main012.java
Main012.java:5: error: incompatible types: lambda body is not compatible with a void functional interface
		Consumer<Integer> consumer = (x) -> x * 3;
		                                      ^
    (consider using a block lambda body, or use a statement expression instead)
Main012.java:7: error: cannot find symbol
		System.out.println(comsumer.accept(10));
		                   ^
  symbol:   variable comsumer
  location: class Main012
2 errors
$

````
</details>


## Main013

````java
import java.util.function.*;

public class Main013 {
	public static void main(String... args) {
		ToDoubleBiFunction<Integer, Double> func = (Integer a, Double b) -> {
			int c;
			return b;
		};


		System.out.println(func.applyAsDouble(10, 20.0));
		System.out.println(func.applyAsDouble(10, null));
	}
}

````
<details>
<summary>Click For Output!</summary>

````console
$ javac Main013.java
$ java Main013
20.0
$

````
</details>


## Main014

````java
import java.util.stream.*;

public class Main014 {
	public static void main(String... args) {
		DoubleStream stream = Stream.of(1.0, 2.0, 3.0, 4.0);
	
		System.out.println(stream.avarage());
		System.out.println(stream.count());
		System.out.println(stream.max());
		System.out.println(stream.sum());
	}
}

````
<details>
<summary>Click For Output!</summary>

````console
$ javac Main014.java
Main014.java:5: error: incompatible types: no instance(s) of type variable(s) T exist so that Stream<T> conforms to DoubleStream
		DoubleStream stream = Stream.of(1.0, 2.0, 3.0, 4.0);
		                               ^
  where T is a type-variable:
    T extends Object declared in method <T>of(T...)
Main014.java:7: error: cannot find symbol
		System.out.println(stream.avarage());
		                         ^
  symbol:   method avarage()
  location: variable stream of type DoubleStream
2 errors
$

````
</details>


## Main015

````java
import java.util.stream.*;

public class Main015 {
	public static void main(String... args) {
		DoubleStream stream = DoubleStream.iterate(1.0, x -> x + 1)
			.limit(10);
	
		System.out.println(stream.average());
		System.out.println(stream.count());
		System.out.println(stream.max());
		System.out.println(stream.sum());
	}
}

````
<details>
<summary>Click For Output!</summary>

````console
$ javac Main015.java
$ java Main015
OptionalDouble[5.5]
$

````
</details>


## Main016

````java
import java.util.stream.*;

public class Main016 {
	public static void main(String... args) {
		DoubleStream stream = DoubleStream.iterate(1.0, x -> x + 1)
			.limit(10);
		System.out.println(stream.average());

		stream = DoubleStream.iterate(1.0, x -> x + 1)
                        .limit(10);
		System.out.println(stream.count());

		stream = DoubleStream.iterate(1.0, x -> x + 1)
                        .limit(10);
		System.out.println(stream.max());

		stream = DoubleStream.iterate(1.0, x -> x + 1)
                        .limit(10);
		System.out.println(stream.sum());
	}
}

````
<details>
<summary>Click For Output!</summary>

````console
$ java Main016
OptionalDouble[5.5]
10
OptionalDouble[10.0]
55.0
$ javac Main016.java
$

````
</details>


## Main017

````java
import java.util.stream.*;

public class Main017 {
	public static void main(String... args) {
		DoubleStream stream = DoubleStream.iterate(1.0, x -> x + 1)
			.limit(0);
		System.out.println(stream.average());

		stream = DoubleStream.iterate(1.0, x -> x + 1)
                        .limit(0);
		System.out.println(stream.count());

		stream = DoubleStream.iterate(1.0, x -> x + 1)
                        .limit(0);
		System.out.println(stream.max());

		stream = DoubleStream.iterate(1.0, x -> x + 1)
                        .limit(0);
		System.out.println(stream.sum());
	}
}

````
<details>
<summary>Click For Output!</summary>

````console
$ java Main017
OptionalDouble.empty
0
OptionalDouble.empty
0.0
$ javac Main017.java
$

````
</details>


## Main018

````java
import java.util.stream.*;

public class Main018 {
	public static void main(String... args) {
		for (var k = 0; k < 10; k++) {
			var findAny = DoubleStream.iterate(0.0, x -> x + 1)
                        .limit(1000)
                        .parallel()
                        .findAny();

	                System.out.println("findAny: " + findAny.getAsDouble());

		}
		
		for (var k = 0; k < 10; k++) {
                        var findFirst = DoubleStream.iterate(0.0, x -> x + 1)
                        .limit(1000)
                        .parallel()
                        .findFirst();

                        System.out.println("findFirst: " + findFirst.getAsDouble());
                }
	}
}

````
<details>
<summary>Click For Output!</summary>

````console
$ javac Main018.java
$ java Main018
findAny: 832.0
findAny: 664.0
findAny: 664.0
findAny: 664.0
findAny: 664.0
findAny: 664.0
findAny: 664.0
findAny: 664.0
findAny: 664.0
findAny: 336.0
findFirst: 0.0
findFirst: 0.0
findFirst: 0.0
findFirst: 0.0
findFirst: 0.0
findFirst: 0.0
findFirst: 0.0
findFirst: 0.0
findFirst: 0.0
findFirst: 0.0
$

````
</details>



