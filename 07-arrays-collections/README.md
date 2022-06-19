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
$ javac Main002.java
$ java Main002
Hello
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
$ javac Main003.java
$ java Main003
Hello
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
$ java Main004
Hello
$ javac Main004.java
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
$ javac Main007.java
$ java Main007
2
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
$ java Main008
21
4
$ javac Main008.java
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
$ java Main009
[21, 20, 0, 10, 11]
$ javac Main009.java
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
$ javac Main010.java
$ java Main010
21
3
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
$ java Main012
21
3
$ javac Main012.java
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
$ java Main013
21
4
$ javac Main013.java
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
$ javac Main019.java
$ java Main019
4
-5
-5
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
$ javac Main021.java
$ java Main021
Before= [Foo{value= AAA }, Foo{value= BBB }, Foo{value= CCC }, Foo{value= AAA }]
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
$ javac Main022.java
$ java Main022
Before= [Foo{value= AAA }, Foo{value= BBB }, Foo{value= CCC }, Foo{value= AAA }]
After = [Foo{value= AAA }, Foo{value= BBB }, Foo{value= CCC }, Foo{value= AAA }]
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
$ java Main025
searchA= 0
searchD= -4
mismatchSameArray= -1
mismatch= 1
mismatchLongArray= 3
$ javac Main025.java
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
$ java Main026
2,1
$ javac Main026.java
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
$ java Main027
1
2
3
4
5
$ javac Main027.java
Note: Main027.java uses or overrides a deprecated API.
Note: Recompile with -Xlint:deprecation for details.
Note: Main027.java uses unchecked or unsafe operations.
Note: Recompile with -Xlint:unchecked for details.
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


## Main029

````java
import java.util.*;

public class Main029 {
	public static void main(String... args) {
		List<Foo029> list = new ArrayList<>();
		list.add(new Foo029(5));
		list.add(new Foo029(2));
		list.add(new Foo029(-5));
		list.add(new Foo029(0));
		list.add(new Foo029(30));

		System.out.println("Before : " + list);
		Collections.sort(list);
		System.out.println("After  : " + list);
	}
}

class Foo029 implements Comparable<Foo029> {
	public int value;
	
	public Foo029(int value) {
		this.value = value;
	}

	@Override
	public int compareTo(Foo029 foo) {
		return this.value - foo.value;
	}

	@Override
	public String toString() {
		return "Foo { value= " + this.value + " }";
	}
}

````
<details>
<summary>Click For Output!</summary>

````console
$ javac Main029.java
$ java Main029
Before : [Foo { value= 5 }, Foo { value= 2 }, Foo { value= -5 }, Foo { value= 0 }, Foo { value= 30 }]
After  : [Foo { value= -5 }, Foo { value= 0 }, Foo { value= 2 }, Foo { value= 5 }, Foo { value= 30 }]
$

````
</details>


## Main030

````java
import java.util.*;

public class Main030 {
	public static void main(String... args) {
		var setOf = Set.of("AA", "BB", "CC");
		var setCopyOf = Set.copyOf(setOf);
		System.out.println(setCopyOf);
	}
}



````
<details>
<summary>Click For Output!</summary>

````console
$ java Main030
[AA, CC, BB]
$ javac Main030.java
$

````
</details>


## Main031

````java
import java.util.*;

public class Main031 {
	public static void main(String... args) {
		var os = new String[] {"DD", "BB", "CC"};
		Arrays.sort(os);

		System.out.println(Arrays.binarySearch(os, "FF"));
		System.out.println(Arrays.binarySearch(os, "BB"));
	}
}

````
<details>
<summary>Click For Output!</summary>

````console
$ java Main031
-4
0
$ javac Main031.java
$

````
</details>


## Main032

````java
import java.util.*;

public class Main032 {
	public static void main(String... args) {
		var os = new String[] {"DD", "BB", "CC"};
		Arrays.sort(os);

		System.out.println(Arrays.binarySearch(os, "AA"));
		System.out.println(Arrays.binarySearch(os, "BB"));
	}
}

````
<details>
<summary>Click For Output!</summary>

````console
$ java Main032
-1
0
$ javac Main032.java
$

````
</details>


## Main033

````java
import java.util.*;

public class Main033 {
	public static void main(String... args) {
		var os = new String[] {"DD", "BB", "CC"};
		Arrays.sort(os);

		System.out.println(Arrays.binarySearch(os, "CF"));
		System.out.println(Arrays.binarySearch(os, "BB"));
	}
}

````
<details>
<summary>Click For Output!</summary>

````console
$ java Main033
-3
0
$ javac Main033.java
$

````
</details>


## Main034

````java
import java.util.*;

public class Main034 {
	public static void main(String... args) {
		var q = new ArrayDeque<String>();
		q.offerFirst("AA");
		q.offer("BB");
		q.offerLast("CC");
	
		System.out.println(q);
		System.out.println(q.poll());
		System.out.println(q.removeFirst());
		System.out.println(q.size());
	}
}

````
<details>
<summary>Click For Output!</summary>

````console
$ java Main034
[AA, BB, CC]
AA
BB
1
$ javac Main034.java
$

````
</details>


## Main035

````java
import java.util.*;

public class Main035 {
	public static void main(String... args) {
		int [] array1d, array2d[];
		array2d = new int[2][3];
		System.out.println(Arrays.deepToString(array2d));
	}
}

````
<details>
<summary>Click For Output!</summary>

````console
$ java Main035
[[0, 0, 0], [0, 0, 0]]
$ javac Main035.java
$

````
</details>


## Main036

````java
import java.util.*;

public class Main036 {
	public static void main(String... args) {
		var one = new HashSet<>();
		var two = new HashSet<Object>();
		HashSet<> three = new HashSet<Object>();
		HashSet<Object> four = new HashSet<>();
		HashSet<Object> five = new HashSet<Object>();
	
		System.out.println("Compiled :)");
	}
}

````
<details>
<summary>Click For Output!</summary>

````console
$ javac Main036.java
Main036.java:7: error: illegal start of type
		HashSet<> three = new HashSet<Object>();
		        ^
1 error
$

````
</details>


## Main037

````java
import java.util.*;

public class Main037 {
	public static void main(String... args) {
		var foo = new int[] {1, 2, 3};
		var bar = new int[] {1, 3, 3};

		System.out.println(Arrays.compare(foo, bar));
	}
}

````
<details>
<summary>Click For Output!</summary>

````console
$ javac Main037.java
$ java Main037
-1
$

````
</details>


## Main038

````java
import java.util.*;

public class Main038 {
        public static void main(String... args) {
                var foo = new int[] {1, 3, 3};
                var bar = new int[] {1, 2, 3};

                System.out.println(Arrays.compare(foo, bar));
        }
} 

````
<details>
<summary>Click For Output!</summary>

````console
$ javac Main038.java
$ java Main038
1
$

````
</details>


## Main039

````java
import java.util.*;

public class Main039 {
        public static void main(String... args) {
                var foo = new int[] {1, 2, 3, 4};
                var bar = new int[] {1, 2, 3};

                System.out.println(Arrays.compare(foo, bar));
        }
} 

````
<details>
<summary>Click For Output!</summary>

````console
$ java Main039
1
$ javac Main039.java
$

````
</details>


## Main040

````java
import java.util.*;

public class Main040 {
        public static void main(String... args) {
                var foo = new int[] {1, 2, 3, 4};
                var bar = new int[] {1, 3, 3};

                System.out.println(Arrays.compare(foo, bar));
        }
} 

````
<details>
<summary>Click For Output!</summary>

````console
$ javac Main040.java
$ java Main040
-1
$

````
</details>


## Main041

````java
import java.util.*;

public class Main041 {
        public static void main(String... args) {
                var foo = new int[] {1, 2, 3};
                var bar = new int[] {1, 2, 3};

                System.out.println(Arrays.compare(foo, bar));
        }
} 

````
<details>
<summary>Click For Output!</summary>

````console
$ javac Main041.java
$ java Main041
0
$

````
</details>


## Main042

````java
import java.util.*;

public class Main042 {
	public static void main(String... args) {
		var foo = List.of("AA", "BBB", "CC", "DDDD");
		Collections.sort(foo, Comparator.comparing(String::length));
		System.out.println(foo.get(0));
	}
}

````
<details>
<summary>Click For Output!</summary>

````console
$ javac Main042.java
$ java Main042
Exception in thread "main" java.lang.UnsupportedOperationException
	at java.base/java.util.ImmutableCollections.uoe(ImmutableCollections.java:72)
	at java.base/java.util.ImmutableCollections$AbstractImmutableList.sort(ImmutableCollections.java:111)
	at java.base/java.util.Collections.sort(Collections.java:179)
	at Main042.main(Main042.java:6)
$

````
</details>


## Main043

````java
import java.util.*;

public class Main043 {
	public static void main(String... args) {
		var foo = new int[] {5, 3, 0, -5, 20, 10, 30, -50};
		System.out.println(Arrays.binarySearch(foo, 0));
	}
}

````
<details>
<summary>Click For Output!</summary>

````console
$ javac Main043.java
$ java Main043
-5
$

````
</details>


## Main044

````java
public class Main044 {
	public static void main(String... args) {
		var one = new Wrapper<Foo044>();
		var two = new Wrapper<Bar044>();
		var three = new Wrapper<Boo044>();	
	}
}

class Foo044 {}
class Bar044 extends Foo044 {}
class Boo044 {}
class Wrapper<? extends Foo044> {}

````
<details>
<summary>Click For Output!</summary>

````console
$ javac Main044.java
Main044.java:12: error: <identifier> expected
class Wrapper<? extends Foo044> {}
              ^
1 error
$

````
</details>


## Main045

````java
public class Main045 {
        public static void main(String... args) {
                var one = new Wrapper<Foo045>();
                var two = new Wrapper<Bar045>();
                var three = new Wrapper<Boo045>();
        }
}

class Foo045 {}
class Bar045 extends Foo045 {}
class Boo045 {}
class Wrapper<T extends Foo045> {}

````
<details>
<summary>Click For Output!</summary>

````console
$ javac Main045.java
Main045.java:5: error: type argument Boo045 is not within bounds of type-variable T
                var three = new Wrapper<Boo045>();
                                        ^
  where T is a type-variable:
    T extends Foo045 declared in class Wrapper
1 error
$

````
</details>


## Main046

````java
import java.util.*;

public class Main046 {
	public static void main(String... args) {
		List<Character> foo = new ArrayList<>();
		foo.add('a');
		foo.add('b');
		foo.add('c');

		foo.clear();
		foo.remove(0);

		System.out.println(foo.isEmpty());	
		System.out.println(foo.length());
	}
}

````
<details>
<summary>Click For Output!</summary>

````console
$ javac Main046.java
Main046.java:14: error: cannot find symbol
		System.out.println(foo.length());
		                      ^
  symbol:   method length()
  location: variable foo of type List<Character>
1 error
$

````
</details>


## Main047

````java
import java.util.*;

public class Main047 {
	public static void main(String... args)	{
		var foo = new ArrayList<String>();
		add(foo, "AA");
		add(foo, "BB");
		add(foo, "CC");

		System.out.println(foo);
	}

	public static U add(T list, U element) {
		list.add(element);
		return element;
	}
} 

````
<details>
<summary>Click For Output!</summary>

````console
$ javac Main047.java
Main047.java:13: error: cannot find symbol
	public static U add(T list, U element) {
	                    ^
  symbol:   class T
  location: class Main047
Main047.java:13: error: cannot find symbol
	public static U add(T list, U element) {
	                            ^
  symbol:   class U
  location: class Main047
Main047.java:13: error: cannot find symbol
	public static U add(T list, U element) {
	              ^
  symbol:   class U
  location: class Main047
3 errors
$

````
</details>


## Main048

````java
import java.util.*;

public class Main048 {
	public static void main(String... args)	{
		var foo = new ArrayList<String>();
		add(foo, "AA");
		add(foo, "BB");
		add(foo, "CC");

		System.out.println(foo);
	}

	public static <T,U> U add(T list, U element) {
		list.add(element);
		return element;
	}
} 

````
<details>
<summary>Click For Output!</summary>

````console
$ javac Main048.java
Main048.java:14: error: cannot find symbol
		list.add(element);
		    ^
  symbol:   method add(U)
  location: variable list of type T
  where U,T are type-variables:
    U extends Object declared in method <T,U>add(T,U)
    T extends Object declared in method <T,U>add(T,U)
1 error
$

````
</details>


## Main049

````java
import java.util.*;

public class Main049 {
	public static void main(String... args)	{
		var foo = new ArrayList<String>();
		add(foo, "AA");
		add(foo, "BB");
		add(foo, "CC");

		System.out.println(foo);
	}

	public static <T implements List<U>, U> U add(T list, U element) {
		list.add(element);
		return element;
	}
} 

````
<details>
<summary>Click For Output!</summary>

````console
$ javac Main049.java
Main049.java:13: error: > expected
	public static <T implements List<U>, U> U add(T list, U element) {
	                ^
Main049.java:13: error: illegal start of type
	public static <T implements List<U>, U> U add(T list, U element) {
	                 ^
Main049.java:13: error: <identifier> expected
	public static <T implements List<U>, U> U add(T list, U element) {
	                                   ^
Main049.java:13: error: ';' expected
	public static <T implements List<U>, U> U add(T list, U element) {
	                                      ^
4 errors
$

````
</details>


## Main050

````java
import java.util.*;

public class Main050 {
	public static void main(String... args)	{
		var foo = new ArrayList<String>();
		add(foo, "AA");
		add(foo, "BB");
		add(foo, "CC");

		System.out.println(foo);
	}

	public static <T extends ArrayList<U>, U> U add(T list, U element) {
		list.add(element);
		return element;
	}
} 

````
<details>
<summary>Click For Output!</summary>

````console
$ javac Main050.java
$ java Main050
[AA, BB, CC]
$

````
</details>


## Main051

````java
import java.util.*;

public class Main051 {
	public static void main(String... args)	{
		var foo = new ArrayList<String>();
		add(foo, "AA");
		add(foo, "BB");
		add(foo, "CC");

		System.out.println(foo);
	}

	public static <T extends Collection<U>, U> U add(T list, U element) {
		list.add(element);
		return element;
	}
} 

````
<details>
<summary>Click For Output!</summary>

````console
$ javac Main051.java
$ java Main051
[AA, BB, CC]
$

````
</details>


## Main052

````java
public class Main052 {
	public static void main(String... args) {
		char[] foo[] = new char[3][3];
		foo[1][3] = 'A';
		foo[2][2] = 'B';
		foo[3][1] = 'C';

		System.out.println(foo.length);
	}
}

````
<details>
<summary>Click For Output!</summary>

````console
$ javac Main052.java
$ java Main052
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
	at Main052.main(Main052.java:4)
$

````
</details>


## Main053

````java
import java.util.*;

public class Main053 {
	public static void main(String... args) {
		var set = new TreeSet<String>();
		set.add("A");
		set.add("a");
		set.add("a");
		
		System.out.println(set.iterator().next());
	}
}

````
<details>
<summary>Click For Output!</summary>

````console
$ javac Main053.java
$ java Main053
A
$

````
</details>


## Main054

````java
public class Main054 {
	public static void main(String... args) {
		var foo = new String[][] {
			{ "A1" },
			{ "B1", "B2" }
		};

		System.out.println(foo.length + ", " + foo[0].length);
	}
}

````
<details>
<summary>Click For Output!</summary>

````console
$ javac Main054.java
$ java Main054
2, 1
$

````
</details>


## Main055

````java
import java.util.*;

public class Main055 {
	public static void main(String... args) {
		var numbers = Arrays.asList(1, null, 3);
		int one = numbers.get(1);
		int last = numbers.get(3);
		System.out.println(one + ", " + last);
	}
}

````
<details>
<summary>Click For Output!</summary>

````console
$ java Main055
Exception in thread "main" java.lang.NullPointerException
	at Main055.main(Main055.java:6)
$ javac Main055.java
$

````
</details>


## Main056

````java
import java.util.*;

public class Main056 {
	public static void main(String... args) {
		var list = Arrays.asList("AAA", "aAA", "bbb", "BBB", "bB");
		Collections.sort(list, getComparator());
		System.out.println(list.get(0));
	}

	public static Comparator getComparator() {
		return Comparator.comparing(String::length)
			.thenComparing(s -> s.charAt(0))
			.reversed();
	}
}

````
<details>
<summary>Click For Output!</summary>

````console
$ java Main056
bbb
$ javac Main056.java
Note: Main056.java uses unchecked or unsafe operations.
Note: Recompile with -Xlint:unchecked for details.
$

````
</details>


## Main057

````java
public class Main057 {
	public static void main(String... args) {
		var foo = new ArrayList<>();
		foo.add(1);
		foo.add(2);
		foo.add(Integer.valueOf(3));
		foo.add(Integer.valueOf(4));

		foo.remove(2);
		foo.remove(Integer.valueOf(1));

		System.out.println(foo);
	}
}

````
<details>
<summary>Click For Output!</summary>

````console
$ javac Main057.java
Main057.java:3: error: cannot find symbol
		var foo = new ArrayList<>();
		              ^
  symbol:   class ArrayList
  location: class Main057
1 error
$

````
</details>


## Main058

````java
import java.util.*;

public class Main058 {
	public static void main(String... args) {
		Set<String> set = new HashSet<>();
		set.add("AA");
		set.add("B");
		set.add("CC");
		set.add("D");

		for(String value: set)
			if (value.length() > 1)
				set.remove(value);
		System.out.println(set);
	}
}

````
<details>
<summary>Click For Output!</summary>

````console
$ java Main058
Exception in thread "main" java.util.ConcurrentModificationException
	at java.base/java.util.HashMap$HashIterator.nextNode(HashMap.java:1511)
	at java.base/java.util.HashMap$KeyIterator.next(HashMap.java:1534)
	at Main058.main(Main058.java:11)
$ javac Main058.java
$

````
</details>



