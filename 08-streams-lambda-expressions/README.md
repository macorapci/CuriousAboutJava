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
13
10
11
14
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
findAny: 80.0
findAny: 664.0
findAny: 664.0
findAny: 664.0
findAny: 664.0
findAny: 664.0
findAny: 664.0
findAny: 710.0
findAny: 664.0
findAny: 664.0
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


## Main019

````java
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main019 {
	public static void main(String... args) {
		List<String> g = Arrays.asList("AAA", "BBB", "CCC", "AAA");
 
        	Map<String, Long> result= g.stream().collect(
                	Collectors.groupingBy(
                    		Function.identity(),
                    		Collectors.counting())
		);
 
        	System.out.println(result);
	}
}

````
<details>
<summary>Click For Output!</summary>

````console
$ javac Main019.java
$ java Main019
{AAA=2, CCC=1, BBB=1}
$

````
</details>


## Main020

````java
import java.util.*;
import java.util.stream.*;

public class Main020 {
	public static void main(String... args) {
		var list = new LinkedList<>();
		list.add("AAA");
		list.add("BBB");

		Stream s = list.stream();
		s.forEach(System.out::println);
		s.forEach(System.out::println);
	}
}

````
<details>
<summary>Click For Output!</summary>

````console
$ javac Main020.java
Note: Main020.java uses unchecked or unsafe operations.
Note: Recompile with -Xlint:unchecked for details.
$ java Main020
AAA
BBB
$

````
</details>


## Main021

````java
import java.util.function.*;

public class Main021 {
	public static void main(String... args) {
		IntUnaryOperator add = a -> a + 1;
		System.out.println(add.applyAsInt(10));
	}
}

````
<details>
<summary>Click For Output!</summary>

````console
$ java Main021
11
$ javac Main021.java
$

````
</details>


## Main022

````java
import java.util.function.*;

public class Main022 {
	public static void main(String... args) { 
		Predicate foo = s -> s.startsWith("-");
		System.out.println(foo.test("I-Am-The-One"));
	}
}

````
<details>
<summary>Click For Output!</summary>

````console
$ javac Main022.java
Main022.java:5: error: cannot find symbol
		Predicate foo = s -> s.startsWith("-");
		                      ^
  symbol:   method startsWith(String)
  location: variable s of type Object
Note: Main022.java uses unchecked or unsafe operations.
Note: Recompile with -Xlint:unchecked for details.
1 error
$

````
</details>


## Main023

````java
import java.util.function.*;

public class Main022 {
        public static void main(String... args) {
                Predicate<String> foo = s -> s.startsWith("-");
                System.out.println(foo.test("I-Am-The-One"));
        }
}

````
<details>
<summary>Click For Output!</summary>

````console
$ javac Main023.java
Main023.java:3: error: class Main022 is public, should be declared in a file named Main022.java
public class Main022 {
       ^
1 error
$

````
</details>


## Main024

````java
import java.util.function.*;

public class Main024 {
        public static void main(String... args) {
                var list = new ArrayList<>();
		list.add("AAA");
		list.add("BBB");
		list.add("CCC");

		list.stream()
			.filter(String::isNotEmpty)
			.forEach(System.out::println);
        }
}

````
<details>
<summary>Click For Output!</summary>

````console
$ javac Main024.java
Main024.java:5: error: cannot find symbol
                var list = new ArrayList<>();
                               ^
  symbol:   class ArrayList
  location: class Main024
Main024.java:11: error: invalid method reference
			.filter(String::isNotEmpty)
			        ^
  cannot find symbol
    symbol:   method isNotEmpty()
    location: class String
2 errors
$

````
</details>


## Main025

````java
import java.util.function.*;
import java.util.stream.*;

public class Main025 {
        public static void main(String... args) {
        	var ints = IntStream.of(6, 10);
		var longs = ints.mapToLong(x -> x);
		var first = longs.average().getAsDouble();

		var moreLongs = LongStream.of(6, 10);
		var stats = moreLongs.summaryStatistics();
		var second = stats.getAverage();

		System.out.println(first + ", " + second);
	}
}

````
<details>
<summary>Click For Output!</summary>

````console
$ java Main025
8.0, 8.0
$ javac Main025.java
$

````
</details>


## Main026

````java
import java.util.*;
import java.util.stream.*;

public class Main026 {
	public static void main(String... args) {
		var foo = new ArrayList<Foo026>();

		var one = new Foo026();
		one.bar = "AAA";
		one.voo = 1;

		var two = new Foo026();
		two.bar = "BBB";
		two.voo = 2;

		var three = new Foo026();
		three.bar = "CCC";
		three.voo = 1; 

		foo.add(one);
		foo.add(two);
		foo.add(three);

		var bar = foo.stream()
			.collect(
				Collectors.groupingByConcurrent(x -> x.voo)
			);
		
		System.out.println(bar);
	}
}

class Foo026 {
	public String bar;
	public int voo;

	@Override
	public String toString() {
		return this.bar;
	}
}

````
<details>
<summary>Click For Output!</summary>

````console
$ javac Main026.java
$ java Main026
{1=[AAA, CCC], 2=[BBB]}
$

````
</details>


## Main027

````java
import java.util.stream.*;
import java.util.function.*;

public class Main027 {
	public static void main(String... args) {
		var s = Stream.of("AAA", "BBBB", "CCC", "D", "EEEE");
		var map = s.collect(Collectors.toMap(String::length, k -> " !" + k, (a, b) -> a + " * " + b));
		System.out.println(map);
	}
}

````
<details>
<summary>Click For Output!</summary>

````console
$ javac Main027.java
$ java Main027
{1= !D, 3= !AAA *  !CCC, 4= !BBBB *  !EEEE}
$

````
</details>


## Main028

````java
import java.util.stream.*;

public class Main028 {
	public static void main(String... args) {
		var s = Stream.iterate(1, i -> i + 1);
		var a = s.anyMatch(i -> i > 5);
		System.out.println(a);
	
		s = Stream.iterate(1, i -> i + 1);	
		var b = s.peek(System.out::println)
			.allMatch(i -> i > 5);
                System.out.println(b);

		s = Stream.iterate(1, i -> i + 1);
		var c = s.peek(System.out::println)
			.noneMatch(i -> i > 5);
                System.out.println(c);
	}
}

````
<details>
<summary>Click For Output!</summary>

````console
$ javac Main028.java
$ java Main028
true
1
false
1
2
3
4
5
6
false
$

````
</details>


## Main029

````java
import java.util.*;
  
public class Main029 {
        public static void main(String... args) {
        	List.of(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
			.parallelStream()
			.parallel()
			.parallel()
			.parallel()
			.forEach(System.out::println);
        }
}

````
<details>
<summary>Click For Output!</summary>

````console
$ javac Main029.java
$ java Main029
6
7
5
0
1
8
2
10
9
3
4
$

````
</details>


## Main030

````java
import java.util.stream.*;
import java.util.function.*;

public class Main030 {
	public static void main(String... args) {
		Stream<Foo030> stream = Stream.of(
			new Foo030("AAA", 10),
			new Foo030("BBB", 10),
			new Foo030("CCC", 10),
			new Foo030("AAA", 10),
			new Foo030("BBB", null),
			new Foo030("FFF", 10),
			new Foo030(null, 10)		
		);

		var map = stream.collect(
			Collectors.groupingBy(Foo030::getStrValue,
				Collectors.summingInt(Foo030::getIntValue))		
		);
		
		System.out.println("***********");
		System.out.println("map.get(\"AAA\")");
		System.out.println(map.get("AAA"));
		System.out.println("***********");
		System.out.println("***********");
                System.out.println("map.get(\"BBB\")");
                System.out.println(map.get("BBB"));
                System.out.println("***********");
		System.out.println("***********");
                System.out.println("map.get(null)");
                System.out.println(map.get(null));
                System.out.println("***********");
		System.out.println("***********");
                System.out.println("map");
                System.out.println(map);
                System.out.println("***********");
	}
}

class Foo030 {
	private String strValue;
	private Integer intValue;

	public Foo030 (String strValue, Integer intValue) {
		this.strValue = strValue;
		this.intValue = intValue;
	}

	public String getStrValue() {
		return this.strValue;
	}

	public Integer getIntValue() {
		return this.intValue;
	}
}

````
<details>
<summary>Click For Output!</summary>

````console
$ javac Main030.java
$ java Main030
Exception in thread "main" java.lang.NullPointerException
	at java.base/java.util.stream.Collectors.lambda$summingInt$19(Collectors.java:673)
	at java.base/java.util.stream.Collectors.lambda$groupingBy$53(Collectors.java:1136)
	at java.base/java.util.stream.ReduceOps$3ReducingSink.accept(ReduceOps.java:169)
	at java.base/java.util.Spliterators$ArraySpliterator.forEachRemaining(Spliterators.java:948)
	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:484)
	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
	at java.base/java.util.stream.ReduceOps$ReduceOp.evaluateSequential(ReduceOps.java:913)
	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
	at java.base/java.util.stream.ReferencePipeline.collect(ReferencePipeline.java:578)
	at Main030.main(Main030.java:16)
$

````
</details>


## Main031

````java
import java.util.stream.*;
import java.util.function.*;

public class Main031 {
	public static void main(String... args) {
		Stream<Foo031> stream = Stream.of(
			new Foo031("AAA", 10),
			new Foo031("BBB", 10),
			new Foo031("CCC", 10),
			new Foo031("AAA", 10),
			new Foo031("BBB", null),
			new Foo031("FFF", 10),
			new Foo031(null, 10)		
		);

		var map = stream
			.filter(x -> x.getIntValue() != null)
			.collect(
				Collectors.groupingBy(Foo031::getStrValue,
					Collectors.summingInt(Foo031::getIntValue))		
			);
		
		System.out.println("***********");
		System.out.println("map.get(\"AAA\")");
		System.out.println(map.get("AAA"));
		System.out.println("***********");
		System.out.println("***********");
                System.out.println("map.get(\"BBB\")");
                System.out.println(map.get("BBB"));
                System.out.println("***********");
		System.out.println("***********");
                System.out.println("map.get(null)");
                System.out.println(map.get(null));
                System.out.println("***********");
		System.out.println("***********");
                System.out.println("map");
                System.out.println(map);
                System.out.println("***********");
	}
}

class Foo031 {
	private String strValue;
	private Integer intValue;

	public Foo031 (String strValue, Integer intValue) {
		this.strValue = strValue;
		this.intValue = intValue;
	}

	public String getStrValue() {
		return this.strValue;
	}

	public Integer getIntValue() {
		return this.intValue;
	}
}

````
<details>
<summary>Click For Output!</summary>

````console
$ java Main031
Exception in thread "main" java.lang.NullPointerException: element cannot be mapped to a null key
	at java.base/java.util.Objects.requireNonNull(Objects.java:246)
	at java.base/java.util.stream.Collectors.lambda$groupingBy$53(Collectors.java:1134)
	at java.base/java.util.stream.ReduceOps$3ReducingSink.accept(ReduceOps.java:169)
	at java.base/java.util.stream.ReferencePipeline$2$1.accept(ReferencePipeline.java:177)
	at java.base/java.util.Spliterators$ArraySpliterator.forEachRemaining(Spliterators.java:948)
	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:484)
	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
	at java.base/java.util.stream.ReduceOps$ReduceOp.evaluateSequential(ReduceOps.java:913)
	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
	at java.base/java.util.stream.ReferencePipeline.collect(ReferencePipeline.java:578)
	at Main031.main(Main031.java:18)
$ javac Main031.java
$

````
</details>


## Main032

````java
import java.util.stream.*;
import java.util.function.*;

public class Main032 {
	public static void main(String... args) {
		Stream<Foo032> stream = Stream.of(
			new Foo032("AAA", 10),
			new Foo032("BBB", 10),
			new Foo032("CCC", 10),
			new Foo032("AAA", 10),
			new Foo032("BBB", null),
			new Foo032("FFF", 10),
			new Foo032(null, 10)		
		);

		var map = stream
			.filter(x -> x != null)
			.filter(x -> x.getStrValue() != null)
			.filter(x -> x.getIntValue() != null)
			.collect(
				Collectors.groupingBy(Foo032::getStrValue,
					Collectors.summingInt(Foo032::getIntValue))		
			);
		
		System.out.println("***********");
		System.out.println("map.get(\"AAA\")");
		System.out.println(map.get("AAA"));
		System.out.println("***********");
		System.out.println("***********");
                System.out.println("map.get(\"BBB\")");
                System.out.println(map.get("BBB"));
                System.out.println("***********");
		System.out.println("***********");
                System.out.println("map.get(null)");
                System.out.println(map.get(null));
                System.out.println("***********");
		System.out.println("***********");
                System.out.println("map");
                System.out.println(map);
                System.out.println("***********");
	}
}

class Foo032 {
	private String strValue;
	private Integer intValue;

	public Foo032 (String strValue, Integer intValue) {
		this.strValue = strValue;
		this.intValue = intValue;
	}

	public String getStrValue() {
		return this.strValue;
	}

	public Integer getIntValue() {
		return this.intValue;
	}
}

````
<details>
<summary>Click For Output!</summary>

````console
$ java Main032
***********
map.get("AAA")
20
***********
***********
map.get("BBB")
10
***********
***********
map.get(null)
null
***********
***********
map
{AAA=20, CCC=10, BBB=10, FFF=10}
***********
$ javac Main032.java
$

````
</details>


## Main033

````java
import java.util.stream.*;

public class Main033 {
	public static void main(String... args) {
		Stream.of("AAA", "BBB", "CCC")
			.map(s -> s.length())
			.forEach(System.out::println);
	}
}

````
<details>
<summary>Click For Output!</summary>

````console
$ java Main033
3
3
3
$ javac Main033.java
$

````
</details>


## Main034

````java
import java.util.*;


public class Main034 {
	public static void main(String... args) {
		var one = List.of(1, 2, 3)
			.stream()
			.reduce(1, (a, b) -> a+b, (a, b) -> a+b);

		var two = List.of(1, 2, 3)
			.stream()
			.reduce(1, (a,b) -> a+b);

		System.out.println(one + ", " + two);

		var three = List.of(1, 2, 3)
                        .parallelStream()
                        .reduce(1, (a, b) -> a+b, (a, b) -> a+b);

                var four = List.of(1, 2, 3)
                        .parallelStream()
                        .reduce(1, (a,b) -> a+b);

		System.out.println(three + ", " + four);
	}
}

````
<details>
<summary>Click For Output!</summary>

````console
$ java Main034
7, 7
9, 9
$ javac Main034.java
$

````
</details>


## Main035

````java
import java.util.stream.*;
import java.util.*;

public class Main035 {
	public static void main(String... args) {
		Stream<Integer> s = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
  
        	Map<Boolean, List<Integer> > map = s.collect(
                	Collectors.partitioningBy(num -> num > 3));
  
        	System.out.println(map);
	}
}

````
<details>
<summary>Click For Output!</summary>

````console
$ java Main035
{false=[1, 2, 3], true=[4, 5, 6, 7, 8, 9, 10]}
$ javac Main035.java
$

````
</details>


## Main036

````java
import java.util.*;
import java.util.function.*;

public class Main036 {
	public static void main(String... args) {
		Consumer<Object> consumer1 = System.out::println;
		var consumer2 = System.out::println;

		consumer1.accept("AAA");
		consumer2.accept("BBB");
	}
}

````
<details>
<summary>Click For Output!</summary>

````console
$ javac Main036.java
Main036.java:7: error: cannot infer type for local variable consumer2
		var consumer2 = System.out::println;
		    ^
  (method reference needs an explicit target-type)
1 error
$

````
</details>


## Main037

````java
import java.util.stream.*;

public class Main037 {
	public static void main(String... args) {
		var value = IntStream.of(0, 1, 2, 3, 4, 5)
			.reduce(-5, (before, after) -> {
				System.out.println(before + ", " + after);
				return before + after;	
			});

		System.out.println("value: " + value);
	}
}

````
<details>
<summary>Click For Output!</summary>

````console
$ javac Main037.java
$ java Main037
-5, 0
-5, 1
-4, 2
-2, 3
1, 4
5, 5
value: 10
$

````
</details>


## Main038

````java
import java.util.stream.*;
import java.util.*;

public class Main038 {
  public static void main(String... args) {
    var value = List.of(new StringBuilder("AAA"), new StringBuilder("BBB"), new StringBuilder("CCC"), new StringBuilder("DDD"))
      .stream()
      .reduce(
          0,
          (before, after) -> {
            System.out.println("first lambda -> " + before + ", " + after);
            return before + after.length();
          },
          (before, after) -> {
            System.out.println("second lambda -> " + before + ", " + after);
            return before + after;
          });

    System.out.println("value: " + value);
  }
}

````
<details>
<summary>Click For Output!</summary>

````console
$ javac Main038.java
$ java Main038
first lambda -> 0, AAA
first lambda -> 3, BBB
first lambda -> 6, CCC
first lambda -> 9, DDD
value: 12
$

````
</details>


## Main039

````java
import java.util.*;
import java.util.stream.*;

public class Main039 {
  public static void main(String... args) {
    var map = Stream.of(Boolean.TRUE, Boolean.TRUE)
      .collect(Collectors.partitioningBy(b -> b));

    System.out.println(map);
  }
}

````
<details>
<summary>Click For Output!</summary>

````console
$ javac Main039.java
$ java Main039
{false=[], true=[true, true]}
$

````
</details>


## Main040

````java
import java.util.*;
import java.util.stream.*;

public class Main040 {
  public static void main(String... args) {
    var map = Stream.of(Boolean.TRUE, Boolean.TRUE, null)
      .collect(Collectors.partitioningBy(b -> b));

    System.out.println(map);
  }
}

````
<details>
<summary>Click For Output!</summary>

````console
$ java Main040
Exception in thread "main" java.lang.NullPointerException
	at Main040.lambda$main$0(Main040.java:7)
	at java.base/java.util.stream.Collectors.lambda$partitioningBy$62(Collectors.java:1388)
	at java.base/java.util.stream.ReduceOps$3ReducingSink.accept(ReduceOps.java:169)
	at java.base/java.util.Spliterators$ArraySpliterator.forEachRemaining(Spliterators.java:948)
	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:484)
	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
	at java.base/java.util.stream.ReduceOps$ReduceOp.evaluateSequential(ReduceOps.java:913)
	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
	at java.base/java.util.stream.ReferencePipeline.collect(ReferencePipeline.java:578)
	at Main040.main(Main040.java:7)
$ javac Main040.java
$

````
</details>


## Main041

````java
import java.util.*;
import java.util.stream.*;

public class Main041 {
  public static void main(String... args) {
    var one = List.of(1, 2);
    var two = List.of(3, 4);
    var count = Stream.of(one, two)
      .flatMapToInt(List::stream)
      .peek(System.out::println)
      .count();

    System.out.println("count: " + count);
  }
}

````
<details>
<summary>Click For Output!</summary>

````console
$ javac Main041.java
Main041.java:9: error: incompatible types: bad return type in method reference
      .flatMapToInt(List::stream)
                    ^
    Stream<Integer> cannot be converted to IntStream
Note: Some messages have been simplified; recompile with -Xdiags:verbose to get full output
1 error
$

````
</details>


## Main042

````java
import java.util.*;
import java.util.stream.*;

public class Main042 {
  public static void main(String... args) {
    var one = List.of(1, 2);
    var two = List.of(3, 4);
    var count = Stream.of(one, two)
      .flatMapToInt(v -> (IntStream)v.stream())
      .peek(System.out::println)
      .count();

    System.out.println("count: " + count);
  }
}

````
<details>
<summary>Click For Output!</summary>

````console
$ javac Main042.java
Main042.java:9: error: incompatible types: Stream<Integer> cannot be converted to IntStream
      .flatMapToInt(v -> (IntStream)v.stream())
                                            ^
1 error
$

````
</details>


## Main043

````java
import java.util.*;
import java.util.stream.*;

public class Main043 {
  public static void main(String... args) {
    IntSummaryStatistics stats = IntStream.iterate(0, i -> i + 1)
      .limit(10)
      .summaryStatistics();

    System.out.println(stats.getSum());
    System.out.println(stats.getCount());
    System.out.println(stats.getMax());
  }
}

````
<details>
<summary>Click For Output!</summary>

````console
$ java Main043
45
10
9
$ javac Main043.java
$

````
</details>


## Main044

````java
import java.util.*;
import java.util.stream.*;

public class Main044 {
  public static void main(String... args) {
    Stream.generate(() -> 10)
      .limit(5);
  }
}

````
<details>
<summary>Click For Output!</summary>

````console
$ java Main044
$ javac Main044.java
$

````
</details>


## Main045

````java
import java.util.*;

public class Main045 {
  public static void main(String... args) {
    Optional<String> opt = Optional.empty();
    try{
      System.out.println(opt.orElseThrow());
    } catch(Exception ex) {
      ex.printStackTrace();
    }

    System.out.println("****************************");

    try{
      System.out.println(opt.orElseThrow(() -> new Exception("AAAAAA:")));
    } catch(Exception ex) {
      ex.printStackTrace();
    }
  }
}

````
<details>
<summary>Click For Output!</summary>

````console
$ java Main045
****************************
$ javac Main045.java
$

````
</details>


## Main046

````java
import java.util.function.*;

public class Main046 {
  public static void main(String... args) {
    BinaryOperator<Long> lambda = (a, b) -> {
      long a = 10L;
      return a*b;
    };

    var result = lambda.apply(5L, 10L);
    System.out.println(result);
  }
}

````
<details>
<summary>Click For Output!</summary>

````console
$ javac Main046.java
Main046.java:6: error: variable a is already defined in method main(String...)
      long a = 10L;
           ^
1 error
$

````
</details>


## Main047

````java
import java.util.function.*;

public class Main047 {
  public static void main(String... args) {
    BinaryOperator<Long> lambda = (a, b) -> {
      a = 10L;
      return a*b;
    };

    var result = lambda.apply(5L, 10L);
    System.out.println(result);
  }
}

````
<details>
<summary>Click For Output!</summary>

````console
$ java Main047
100
$ javac Main047.java
$

````
</details>


## Main048

````java
import java.util.stream.*;

public class Main48 {
  public static void main(String... args) {
    LongStream.of(0, 1, 2, 3, 4, 5, 6, 7)
      .mapToInt(a -> a)
      .forEach(System.out::println);
  }
}

````
<details>
<summary>Click For Output!</summary>

````console
$ javac Main048.java
Main048.java:3: error: class Main48 is public, should be declared in a file named Main48.java
public class Main48 {
       ^
Main048.java:6: error: incompatible types: bad return type in lambda expression
      .mapToInt(a -> a)
                     ^
    possible lossy conversion from long to int
Note: Some messages have been simplified; recompile with -Xdiags:verbose to get full output
2 errors
$

````
</details>


## Main049

````java
import java.util.ArrayList;
import java.util.List;

public class Main049 {
    public static void main(String[] args) {
        var list = List.of(new AwesomeObject().name("AAA").value(10),
                new AwesomeObject049().name("BBB").value(20),
                new AwesomeObject049().name("CCC").value(20),
                new AwesomeObject049().name("CCC").value(30),
                new AwesomeObject049().name("DDD").value(30),
                new AwesomeObject049().name("EEE").value(20),
                new AwesomeObject049().name("FFF").value(30));

        var map = list.parallelStream()
                .collect(() -> new ArrayList<AwesomeObject049>(),
                        (ArrayList<AwesomeObject049> tempResultList, AwesomeObject049 tempAwesome) -> {
                            if (tempResultList.isEmpty() || tempResultList.get(0).getValue() == tempAwesome.getValue()) {
                                tempResultList.add(tempAwesome);
                                return;
                            }

                            if (tempResultList.get(0).getValue() < tempAwesome.getValue()) {
                                tempResultList.clear();
                                tempResultList.add(tempAwesome);
                            }
                        },
                        (ArrayList<AwesomeObject049> oldList, ArrayList<AwesomeObject049> newList) -> { // *1
                            if (newList.isEmpty()) {
                                return;
                            }

                            if (oldList.isEmpty() || oldList.get(0).getValue() < newList.get(0).getValue()) {
                                oldList.clear();
                                oldList.addAll(newList);
                                return;
                            }

                            if (oldList.get(0).getValue() == newList.get(0).getValue()) {
                                oldList.addAll(newList);
                            }
                        });

        System.out.println(map);
    }
}

class AwesomeObject049 {
    private int value;
    private String name;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public AwesomeObject value(int value) {
        this.value = value;
        return this;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AwesomeObject name(String name) {
        this.name = name;
        return this;
    }

    @Override
    public String toString() {
        return "AwesomeObject{" +
                "value=" + value +
                ", name='" + name + '\'' +
                '}';
    }
}

````
<details>
<summary>Click For Output!</summary>

````console
$ javac Main049.java
Main049.java:59: error: cannot find symbol
    public AwesomeObject value(int value) {
           ^
  symbol:   class AwesomeObject
  location: class AwesomeObject049
Main049.java:72: error: cannot find symbol
    public AwesomeObject name(String name) {
           ^
  symbol:   class AwesomeObject
  location: class AwesomeObject049
Main049.java:6: error: cannot find symbol
        var list = List.of(new AwesomeObject().name("AAA").value(10),
                               ^
  symbol:   class AwesomeObject
  location: class Main049
3 errors
$

````
</details>


## Main050

````java
import java.util.function.*;

public class Main050 {
    public static void main(String[] args) {
      DoubleToIntFunction f = p -> p * 100;
      System.out.println(f.apply(0.10));
    }
}

````
<details>
<summary>Click For Output!</summary>

````console
$ javac Main050.java
Main050.java:5: error: incompatible types: bad return type in lambda expression
      DoubleToIntFunction f = p -> p * 100;
                                     ^
    possible lossy conversion from double to int
Main050.java:6: error: cannot find symbol
      System.out.println(f.apply(0.10));
                          ^
  symbol:   method apply(double)
  location: variable f of type DoubleToIntFunction
2 errors
$

````
</details>


## Main051

````java
import java.util.function.*;
import java.util.*;

public class Main051 {
    public static void main(String[] args) {
      List<Integer> list = List.of(0, 1, 2, 3, 4, 5, 6, 7);
      Consumer<Integer> cons = a -> System.out.println(a);
      Function<Integer, String> func = a -> a + "";

      list.forEach(cons);
      list.forEach(func);
    }
}

````
<details>
<summary>Click For Output!</summary>

````console
$ javac Main051.java
Main051.java:11: error: incompatible types: Function<Integer,String> cannot be converted to Consumer<? super Integer>
      list.forEach(func);
                   ^
Note: Some messages have been simplified; recompile with -Xdiags:verbose to get full output
1 error
$

````
</details>


## Main052

````java
import java.util.function.*;

public class Main052 {
    public static void main(String[] args) {
      System.out.println("Which of these get compiler error?");
      DoublePredicate a;
      LongUnaryOpeator b;
      ShortSupplier c;
      ToIntBiFunction d;
      ToStringOperator e;
    }
}

````
<details>
<summary>Click For Output!</summary>

````console
$ javac Main052.java
Main052.java:7: error: cannot find symbol
      LongUnaryOpeator b;
      ^
  symbol:   class LongUnaryOpeator
  location: class Main052
Main052.java:8: error: cannot find symbol
      ShortSupplier c;
      ^
  symbol:   class ShortSupplier
  location: class Main052
Main052.java:10: error: cannot find symbol
      ToStringOperator e;
      ^
  symbol:   class ToStringOperator
  location: class Main052
3 errors
$

````
</details>


## Main053

````java
import java.util.function.*;

public class Main053 {
    public static void main(String[] args) {
      var s = "AAAAA";
      Predicate<String> a = s::contains;
      System.out.println(a.test("A"));
    }
}

````
<details>
<summary>Click For Output!</summary>

````console
$ javac Main053.java
$ java Main053
true
$

````
</details>


## Main054

````java
import java.util.function.*;

public class Main054 {
    public static void main(String[] args) {
      System.out.println("How many line will be compile?");
      Predicate<String> one = (final String s) -> s.isEmpty();
      Predicate<String> one = (final s) -> s.isEmpty();
      Predicate<String> one = (final var s) -> s.isEmpty();
      Predicate<String> one = (String s) -> s.isEmpty();
      Predicate<String> one = (var s) -> s.isEmpty();
    }
}

````
<details>
<summary>Click For Output!</summary>

````console
$ javac Main054.java
Main054.java:7: error: <identifier> expected
      Predicate<String> one = (final s) -> s.isEmpty();
                                      ^
1 error
$

````
</details>


## Main055

````java
import java.util.function.*;
import java.util.*;

public class Main055 {
    public static void main(String[] args) {
      List<String> list = List.of("0", "1", "2", "3");
      list.removeIf(e -> e < 1);
      list.forEach(x -> System.out.println(x));
    }
}

````
<details>
<summary>Click For Output!</summary>

````console
$ javac Main055.java
Main055.java:7: error: bad operand types for binary operator '<'
      list.removeIf(e -> e < 1);
                           ^
  first type:  String
  second type: int
1 error
$

````
</details>


## Main056

````java
import java.util.function.*;
import java.util.*;

public class Main056 {
    public static void main(String[] args) {
      System.out.println("How many will be compiled?");
      IntFunction<Integer> one = (Integer i) -> f;
      IntFunction<Integer> two = (i) -> null;
      IntFunction<Integer> three = i -> i;
      IntFunction<Integer> four = () -> 5;
      IntFunction<Integer> five = () -> Integer.valueOf(0);
    }
}

````
<details>
<summary>Click For Output!</summary>

````console
$ javac Main056.java
Main056.java:7: error: cannot find symbol
      IntFunction<Integer> one = (Integer i) -> f;
                                                ^
  symbol:   variable f
  location: class Main056
Main056.java:7: error: incompatible types: incompatible parameter types in lambda expression
      IntFunction<Integer> one = (Integer i) -> f;
                                 ^
Main056.java:10: error: incompatible types: incompatible parameter types in lambda expression
      IntFunction<Integer> four = () -> 5;
                                  ^
Main056.java:11: error: incompatible types: incompatible parameter types in lambda expression
      IntFunction<Integer> five = () -> Integer.valueOf(0);
                                  ^
4 errors
$

````
</details>


## Main057

````java
import java.util.*;

public class Main058 {
  public static void main(String... args) {
    List.of("aa", "bb", "cc")
      .limit(1)
      .map(String::toUpperCase)
      .forEach(System.out::println);
  }
}

````
<details>
<summary>Click For Output!</summary>

````console
$ javac Main057.java
Main057.java:3: error: class Main058 is public, should be declared in a file named Main058.java
public class Main058 {
       ^
Main057.java:6: error: cannot find symbol
      .limit(1)
      ^
  symbol:   method limit(int)
  location: interface List<String>
2 errors
$

````
</details>


## Main058

````java
import java.util.stream.*;
import java.util.*;

public class Main058 {
  public static void main(String... args) {
    Stream<Integer> stream = Stream.of(5, 8, 6, 10, 1);

    Comparator<Integer> comp = (a, b) -> {
      System.out.println("a: " + a + " b: " + b + " a-b: " + (a-b));
      return a-b;
    };

    stream.sorted(comp).forEach(System.out::println);
  }
}

````
<details>
<summary>Click For Output!</summary>

````console
$ java Main058
a: 8 b: 5 a-b: 3
a: 6 b: 8 a-b: -2
a: 6 b: 8 a-b: -2
a: 6 b: 5 a-b: 1
a: 10 b: 6 a-b: 4
a: 10 b: 8 a-b: 2
a: 1 b: 8 a-b: -7
a: 1 b: 6 a-b: -5
a: 1 b: 5 a-b: -4
1
5
6
8
10
$ javac Main058.java
$

````
</details>


## Main059

````java
import java.util.stream.*;
import java.util.function.*;
import java.util.*;

public class Main059 {
  private static BooleanSupplier supp;

  static {
    supp = () -> true;
  }

  public static void main(String... args) {
    if (supp.get()) {
      System.out.println("true");
    } else {
      System.out.println("false");
    }
  }
}

````
<details>
<summary>Click For Output!</summary>

````console
$ javac Main059.java
Main059.java:13: error: cannot find symbol
    if (supp.get()) {
            ^
  symbol:   method get()
  location: variable supp of type BooleanSupplier
1 error
$

````
</details>


## Main060

````java
import java.util.stream.*;
import java.util.*;

public class Main060 {
  public static void main(String... args) {
    List.of(0, 1, 2, 3, 4, 5, 6, 7)
      .parallelStream()
      .collect(Collectors.groupingByConcurrent(x -> x % 2))
      .forEach(System.out::println);
  }
}

````
<details>
<summary>Click For Output!</summary>

````console
$ javac Main060.java
Main060.java:9: error: incompatible types: incompatible parameter types in method reference
      .forEach(System.out::println);
               ^
Note: Some messages have been simplified; recompile with -Xdiags:verbose to get full output
1 error
$

````
</details>



