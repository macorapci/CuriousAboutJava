# Arrays and Collections

 ````console
macorapci@monster:~/CuriousAboutCoding$ java --version
openjdk 11.0.14 2022-01-18
OpenJDK Runtime Environment (build 11.0.14+9-Ubuntu-0ubuntu2.20.04)
OpenJDK 64-Bit Server VM (build 11.0.14+9-Ubuntu-0ubuntu2.20.04, mixed mode, sharing) 
````

## Main001

````java
public class Main001 {
        public static void main(String... args) {
		System.out.println("Find which ones will compile?");

                []String foo = new String[];
                String[] bar = new String[1]{"bar"};
                String boo[] = new String[] {};
		String far[] = new String[0] {};
        }
}  

````
<details>
<summary>Click For Output!</summary>

````console
$ javac Main001.java
Main001.java:5: error: illegal start of expression
                []String foo = new String[];
                ^
Main001.java:5: error: array dimension missing
                []String foo = new String[];
                                           ^
Main001.java:6: error: array creation with both dimension expression and initialization is illegal
                String[] bar = new String[1]{"bar"};
                                            ^
Main001.java:8: error: array creation with both dimension expression and initialization is illegal
		String far[] = new String[0] {};
		                             ^
4 errors
$

````
</details>


## Main002

````java
public class Main002 {
	public static void main(String... args) {
		Generic002<String> foo = new Generic002<>("Hello");
		System.out.println(foo.getItem());
	}
}

class Generic002<T> {
	private T item;

	Generic002(T item) {
		this.item = item;
	}

	public T getItem() {
		return item;
	}
}	

````
<details>
<summary>Click For Output!</summary>

````console
$ java Main002
Hello
$ javac Main002.java
$

````
</details>


## Main003

````java
public class Main003 {
	public static void main(String... args) {
		var foo = new Generic003<String>("Hello");
		System.out.println(foo.getItem());
	}
}

class Generic003<Bar> {
	private Bar item;

	Generic003(Bar item) {
		this.item = item;
	}

	public Bar getItem() {
		return item;
	}
}	

````
<details>
<summary>Click For Output!</summary>

````console
$ java Main003
Hello
$ javac Main003.java
$

````
</details>


## Main004

````java
public class Main004 {
	public static void main(String... args) {
		var foo = new Generic004<String>("Hello");
		System.out.println(foo.getItem());
	}
}

class Generic004<Generic004> {
	private Generic004 item;

	Generic004(Generic004 item) {
		this.item = item;
	}

	public Generic004 getItem() {
		return item;
	}
}	

````
<details>
<summary>Click For Output!</summary>

````console
$ javac Main004.java
$ java Main004
Hello
$

````
</details>


## Main005

````java
import java.util.ArrayList;
import java.util.List;

public class Main005 {
	public static void main(String... args) {
		List<String> foo = new ArrayList<?>();
		foo.add("String");
		foo.add(null);

		System.out.println(foo.size());
	}
}

````
<details>
<summary>Click For Output!</summary>

````console
$ javac Main005.java
Main005.java:6: error: unexpected type
		List<String> foo = new ArrayList<?>();
		                                ^
  required: class or interface without bounds
  found:    ?
1 error
$

````
</details>


## Main006

````java
import java.util.ArrayList;
import java.util.List;

public class Main006 {
	public static void main(String... args) {
		List<> foo = new ArrayList<String>();
		foo.add("String");
		foo.add(null);

		System.out.println(foo.size());
	}
}

````
<details>
<summary>Click For Output!</summary>

````console
$ javac Main006.java
Main006.java:6: error: illegal start of type
		List<> foo = new ArrayList<String>();
		     ^
1 error
$

````
</details>


## Main007

````java
import java.util.ArrayList;
import java.util.List;

public class Main007 {
	public static void main(String... args) {
		List<String> foo = new ArrayList<>();
		foo.add("String");
		foo.add(null);

		System.out.println(foo.size());
	}
}

````
<details>
<summary>Click For Output!</summary>

````console
$ java Main007
2
$ javac Main007.java
$

````
</details>


## Main008

````java
import java.util.ArrayDeque;

public class Main008 {
	public static void main(String... args) {
		var foo = new ArrayDeque<String>();

		foo.offer("10");
		foo.offer("11");

		foo.push("20");
		foo.push("21");

		System.out.println(foo.getFirst());
		System.out.println(foo.size());
	}
}

````
<details>
<summary>Click For Output!</summary>

````console
$ javac Main008.java
$ java Main008
21
4
$

````
</details>


## Main009

````java
import java.util.ArrayDeque;

public class Main009 {
	public static void main(String... args) {
		var foo = new ArrayDeque<String>();

		foo.push("0");

		foo.offer("10");
		foo.offer("11");

		foo.push("20");
		foo.push("21");

		System.out.println(foo);
	}
}

````
<details>
<summary>Click For Output!</summary>

````console
$ javac Main009.java
$ java Main009
[21, 20, 0, 10, 11]
$

````
</details>


## Main010

````java
import java.util.ArrayDeque;

public class Main010 {
	public static void main(String... args) {
		var foo = new ArrayDeque<String>();

		foo.offer("10");
		foo.offer("11");

		foo.push("20");
		foo.push("21");

		System.out.println(foo.pop());
		System.out.println(foo.size());
	}
}

````
<details>
<summary>Click For Output!</summary>

````console
$ java Main010
21
3
$ javac Main010.java
$

````
</details>


## Main011

````java
import java.util.ArrayDeque;

public class Main011 {
	public static void main(String... args) {
		var foo = new ArrayDeque<String>();

		foo.offer("10");
		foo.offer("11");

		foo.push("20");
		foo.push("21");

		System.out.println(foo.getLast());
		System.out.println(foo.size());
	}
}

````
<details>
<summary>Click For Output!</summary>

````console
$ java Main011
11
4
$ javac Main011.java
$

````
</details>


## Main012

````java
import java.util.ArrayDeque;

public class Main012 {
	public static void main(String... args) {
		var foo = new ArrayDeque<String>();

		foo.offer("10");
		foo.offer("11");

		foo.push("20");
		foo.push("21");

		System.out.println(foo.poll());
		System.out.println(foo.size());
	}
}

````
<details>
<summary>Click For Output!</summary>

````console
$ javac Main012.java
$ java Main012
21
3
$

````
</details>


## Main013

````java
import java.util.ArrayDeque;

public class Main013 {
	public static void main(String... args) {
		var foo = new ArrayDeque<String>();

		foo.offer("10");
		foo.offer("11");

		foo.push("20");
		foo.push("21");

		System.out.println(foo.peek());
		System.out.println(foo.size());
	}
}

````
<details>
<summary>Click For Output!</summary>

````console
$ javac Main013.java
$ java Main013
21
4
$

````
</details>


## Main014

````java
public class Main014 {
	public static void main(String... args) {
		var array = new String[5][5];
		Object[] objArray = array;

		System.out.println("Compiled!");
	}
}

````
<details>
<summary>Click For Output!</summary>

````console
$ javac Main014.java
$ java Main014
Compiled!
$

````
</details>


## Main015

````java
import java.util.*;

public class Main015 {
	public static void main(String... args) {
		List<Foo015> list = new ArrayList<Foo015>();
		
		list.add(new Foo015("AAA"));
		list.add(new Foo015("A"));
		list.add(new Foo015("AAAAAA"));

		Collections.sort(list);
		System.out.println(list);	
	}
}


class Foo015 implements Comparator<Foo015> {
	public String value;

	public Foo015(String value) {
		this.value = value;
	}

	@Override
	public int compareTo(Foo015 foo) {
		return this.value.length() - foo.value.length();
	}

	@Override
	public String toString() {
		return "Foo{value= "+ this.value + " }";
	}
}

````
<details>
<summary>Click For Output!</summary>

````console
$ javac Main015.java
Main015.java:11: error: no suitable method found for sort(List<Foo015>)
		Collections.sort(list);
		           ^
    method Collections.<T#1>sort(List<T#1>) is not applicable
      (inference variable T#1 has incompatible bounds
        equality constraints: Foo015
        lower bounds: Comparable<? super T#1>)
    method Collections.<T#2>sort(List<T#2>,Comparator<? super T#2>) is not applicable
      (cannot infer type-variable(s) T#2
        (actual and formal argument lists differ in length))
  where T#1,T#2 are type-variables:
    T#1 extends Comparable<? super T#1> declared in method <T#1>sort(List<T#1>)
    T#2 extends Object declared in method <T#2>sort(List<T#2>,Comparator<? super T#2>)
Main015.java:17: error: Foo015 is not abstract and does not override abstract method compare(Foo015,Foo015) in Comparator
class Foo015 implements Comparator<Foo015> {
^
Main015.java:24: error: method does not override or implement a method from a supertype
	@Override
	^
3 errors
$

````
</details>


## Main016

````java
import java.util.*;

public class Main016 {
	public static void main(String... args) {
		List<Foo016> list = new ArrayList<Foo016>();
		
		list.add(new Foo016("AAA"));
		list.add(new Foo016("A"));
		list.add(new Foo016("AAAAAA"));

		Collections.sort(list);
		System.out.println(list);	
	}
}


class Foo016 implements Comparable<Foo016> {
	public String value;

	public Foo016(String value) {
		this.value = value;
	}

	@Override
	public int compareTo(Foo016 foo) {
		return this.value.length() - foo.value.length();
	}

	@Override
	public String toString() {
		return "Foo{value= "+ this.value + " }";
	}
}

````
<details>
<summary>Click For Output!</summary>

````console
$ javac Main016.java
$ java Main016
[Foo{value= A }, Foo{value= AAA }, Foo{value= AAAAAA }]
$

````
</details>


## Main017

````java
import java.util.*;

public class Main017 {
	public static void main(String... args) {
		String[] array = {"C", "F", "A"};
		var theChoosenOne = array[0];
		
		Arrays.sort(array);
		
		// Arrays.binarySearch(array, element). Searchs for element in array. If finds returns its index. Otherwise returns -1. 
		var result = Arrays.binarySearch(array, theChoosenOne);
		
		System.out.println(result);
	}
}

````
<details>
<summary>Click For Output!</summary>

````console
$ javac Main017.java
$ java Main017
1
$

````
</details>


## Main018

````java
public class Main018 {
	public static void main(String... args) {
		System.out.println("How many declarations get error.");
		[][] String one;
		[] String two;
		[] String[] three;
		String[] four;
		String[][] five;
		String [] six[];
		String seven[][];
		String eight[];
	}
}

````
<details>
<summary>Click For Output!</summary>

````console
$ javac Main018.java
Main018.java:4: error: illegal start of expression
		[][] String one;
		^
Main018.java:5: error: illegal start of expression
		[] String two;
		^
Main018.java:6: error: illegal start of expression
		[] String[] three;
		^
3 errors
$

````
</details>


## Main019

````java
import java.util.*;

public class Main019 {
	public static void main(String... args) {
		var set = new TreeSet<Integer>();
		set.add(10);
		set.add(2);
		set.add(30);
		set.add(30);
		set.add(-5);

		System.out.println(set.size());
		System.out.println(set.iterator().next());
		System.out.println(set.iterator().next());
	}
}

````
<details>
<summary>Click For Output!</summary>

````console
$ java Main019
4
-5
-5
$ javac Main019.java
$

````
</details>


## Main020

````java
import java.util.*;

public class Main020 {
	public static void main(String... args) {
		List<Foo020> list = List.of(new Foo020("AAA"), new Foo020("BBB"), new Foo020("CCC"), new Foo020("AAA"));

		System.out.println("Before= " + list);
		Collections.sort(list);
		System.out.println("After = " + list);
	}
}

class Foo020 {
	public String value;

	public Foo020(String value) {
		this.value = value;
	}

	public int compareTo(Foo020 foo) {
		return 20;
	}
	
	@Override
	public String toString() {
		return "Foo{value= "+ this.value + " }";
	}
}

````
<details>
<summary>Click For Output!</summary>

````console
$ javac Main020.java
Main020.java:8: error: no suitable method found for sort(List<Foo020>)
		Collections.sort(list);
		           ^
    method Collections.<T#1>sort(List<T#1>) is not applicable
      (inference variable T#1 has incompatible bounds
        equality constraints: Foo020
        lower bounds: Comparable<? super T#1>)
    method Collections.<T#2>sort(List<T#2>,Comparator<? super T#2>) is not applicable
      (cannot infer type-variable(s) T#2
        (actual and formal argument lists differ in length))
  where T#1,T#2 are type-variables:
    T#1 extends Comparable<? super T#1> declared in method <T#1>sort(List<T#1>)
    T#2 extends Object declared in method <T#2>sort(List<T#2>,Comparator<? super T#2>)
1 error
$

````
</details>


## Main021

````java
import java.util.*;

public class Main021 {
	public static void main(String... args) {
		List<Foo021> list = List.of(new Foo021("AAA"), new Foo021("BBB"), new Foo021("CCC"), new Foo021("AAA"));

		System.out.println("Before= " + list);
		Collections.sort(list);
		System.out.println("After = " + list);
	}
}

class Foo021 implements Comparable<Foo021> {
	public String value;

	public Foo021(String value) {
		this.value = value;
	}

	public int compareTo(Foo021 foo) {
		return 20;
	}
	
	@Override
	public String toString() {
		return "Foo{value= "+ this.value + " }";
	}
}

````
<details>
<summary>Click For Output!</summary>

````console
$ java Main021
Before= [Foo{value= AAA }, Foo{value= BBB }, Foo{value= CCC }, Foo{value= AAA }]
$ javac Main021.java
$

````
</details>


## Main022

````java
import java.util.*;

public class Main022 {
	public static void main(String... args) {
		List<Foo022> list = new ArrayList<>();
		list.add(new Foo022("AAA"));
		list.add(new Foo022("BBB"));
		list.add(new Foo022("CCC"));
		list.add(new Foo022("AAA"));

		System.out.println("Before= " + list);
		Collections.sort(list);
		System.out.println("After = " + list);
	}
}

class Foo022 implements Comparable<Foo022> {
	public String value;

	public Foo022(String value) {
		this.value = value;
	}

	public int compareTo(Foo022 foo) {
		return 20;
	}

	@Override
	public String toString() {
		return "Foo{value= "+ this.value + " }";
	}
}

````
<details>
<summary>Click For Output!</summary>

````console
$ java Main022
Before= [Foo{value= AAA }, Foo{value= BBB }, Foo{value= CCC }, Foo{value= AAA }]
After = [Foo{value= AAA }, Foo{value= BBB }, Foo{value= CCC }, Foo{value= AAA }]
$ javac Main022.java
$

````
</details>


## Main023

````java
public class Main023 {
	public static void main(String... args) {
		var one = new Generic023(new Foo023());
		var two = new Generic023(new Bar023());
		var three = new Generic023(new Boo023());
	}
}

class Foo023 {}
class Bar023 extends Foo023 {}
class Boo023 {}

class Generic023<GIT extends Foo023> {
	public GIT item;

	public Generic023(GIT item) {
		this.item = item;
	}
}

````
<details>
<summary>Click For Output!</summary>

````console
$ javac Main023.java
Main023.java:5: error: incompatible types: Boo023 cannot be converted to Foo023
		var three = new Generic023(new Boo023());
		                           ^
Note: Main023.java uses unchecked or unsafe operations.
Note: Recompile with -Xlint:unchecked for details.
Note: Some messages have been simplified; recompile with -Xdiags:verbose to get full output
1 error
$

````
</details>


## Main024

````java
import java.util.*;

public class Main024 {
	public static void main(String... main) {
		/* public class LinkedList<E>
		 * extends AbstractSequentialList<E>
		 * implements List<E>, Deque<E>, Cloneable, Serializable
		 */
		var foo = new LinkedList<Integer>();
		
		foo.offer(1);
		foo.offer(2);
		foo.offer(3);

		foo.push(4);

		System.out.println("Before= " + foo);
		System.out.println(foo.poll());
		System.out.println(foo.poll());	
		System.out.println("After = " + foo);
	}
}

````
<details>
<summary>Click For Output!</summary>

````console
$ java Main024
Before= [4, 1, 2, 3]
4
1
After = [2, 3]
$ javac Main024.java
$

````
</details>


## Main025

````java
import java.util.*;

public class Main025 {
	/* static int 
	 * mismatch(Object[] a, Object[] b)
	 * Finds and returns the index of the first mismatch between two Object arrays, otherwise return -1 if no mismatch is found.
	 */
	public static void main(String... args) {
		var arrayA = new String[] {"A", "B", "C"};
		var arrayB = new String[] {"A", "C", "D"};

		var searchA = Arrays.binarySearch(arrayA, "A");
		var searchD = Arrays.binarySearch(arrayA, "D");

		System.out.println("searchA= " + searchA);
		System.out.println("searchD= " + searchD);

		var mismatchSameArray = Arrays.mismatch(arrayA, arrayA);
		var mismatch = Arrays.mismatch(arrayA, arrayB);
 
		var arrayC = new String[] {"A", "B", "C", "D", "E", "F"};
		var mismatchLongArray = Arrays.mismatch(arrayA, arrayC);

		System.out.println("mismatchSameArray= " + mismatchSameArray);
		System.out.println("mismatch= " + mismatch);
		System.out.println("mismatchLongArray= " + mismatchLongArray);

	}
}

````
<details>
<summary>Click For Output!</summary>

````console
$ javac Main025.java
$ java Main025
searchA= 0
searchD= -4
mismatchSameArray= -1
mismatch= 1
mismatchLongArray= 3
$

````
</details>


## Main026

````java
import java.util.*;

public class Main026 {
	public static void main(String... args) {
		String[] array = {"A", "B"};
		var foo = Arrays.asList(array);
		var bar = Arrays.asList("A, B");

		System.out.println(foo.size() + "," + bar.size());
	}
}

````
<details>
<summary>Click For Output!</summary>

````console
$ javac Main026.java
$ java Main026
2,1
$

````
</details>


## Main027

````java
import java.lang.reflect.*;

public class Main027 {
	public static void main(String... args) {
		var one = new Generic027<Integer>();	
		one.print(new Integer(1));

		var two = new Generic027<>();
		two.print(new Integer(2));

		Generic027 three = new Generic027();
		three.print(new Integer(3));

		Generic027 four = new Generic027<Integer>();
		four.print(new Integer(4));
		
		Generic027<Integer> five = new Generic027<Integer>();
		five.print(new Integer(5));
	}
}

class Generic027<T> {
	public void print(T item) {
		System.out.println(item);
	}
}

````
<details>
<summary>Click For Output!</summary>

````console
$ javac Main027.java
Note: Main027.java uses or overrides a deprecated API.
Note: Recompile with -Xlint:deprecation for details.
Note: Main027.java uses unchecked or unsafe operations.
Note: Recompile with -Xlint:unchecked for details.
$ java Main027
1
2
3
4
5
$

````
</details>


## Main028

````java
public class Main028 {
	public static void main(String... args) {
		float[] one = new float[];
		float[] two = new float[1];
		float[] three = new[] float;
		float[] four = new[1] float;
		float[][] five = new[1] float[1];
	}
}

````
<details>
<summary>Click For Output!</summary>

````console
$ javac Main028.java
Main028.java:3: error: array dimension missing
		float[] one = new float[];
		                         ^
Main028.java:5: error: <identifier> expected
		float[] three = new[] float;
		                   ^
Main028.java:5: error: array dimension missing
		float[] three = new[] float;
		                      ^
Main028.java:6: error: <identifier> expected
		float[] four = new[1] float;
		                  ^
Main028.java:6: error: ';' expected
		float[] four = new[1] float;
		                     ^
Main028.java:6: error: not a statement
		float[] four = new[1] float;
		                      ^
Main028.java:7: error: <identifier> expected
		float[][] five = new[1] float[1];
		                    ^
Main028.java:7: error: ';' expected
		float[][] five = new[1] float[1];
		                       ^
Main028.java:7: error: ']' expected
		float[][] five = new[1] float[1];
		                              ^
Main028.java:7: error: not a statement
		float[][] five = new[1] float[1];
		                             ^
10 errors
$

````
</details>



