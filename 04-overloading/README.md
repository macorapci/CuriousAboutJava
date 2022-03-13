# Overloading

 ````console
macorapci@monster:~/CuriousAboutCoding$ java --version
openjdk 11.0.14 2022-01-18
OpenJDK Runtime Environment (build 11.0.14+9-Ubuntu-0ubuntu2.20.04)
OpenJDK 64-Bit Server VM (build 11.0.14+9-Ubuntu-0ubuntu2.20.04, mixed mode, sharing) 
````
## Main01.java

````java
public class Main01 {
	public static void main(String... args){
		Main01 main = new Main01();
		main.strings("1", "2", "3");
	}

	public void strings(String... foo) {
		System.out.println("A");
	}

	public void strings(String[] foo) {
		System.out.println("B");
	}
}
````

<details>
<summary>Click For Output!</summary>

````console
macorapci@monster:~/CuriousAboutCoding/04-overloading$ javac Main01.java
Main01.java:11: error: cannot declare both strings(String[]) and strings(String...) in Main01
	public void strings(String[] foo) {
	            ^
1 error
macorapci@monster:~/CuriousAboutCoding/04-overloading$ 
````

</details>

## Main02.java

````java
public class Main02 {
	public static void main(String... args){
		Main02 main = new Main02();
		System.out.println(main.bar(1));
		System.out.println(main.bar(new Integer(1)));
		System.out.println(main.bar(null));
	}

	public int bar(int number) {
		return 0;
	}

	public int bar(Integer number) {
		return 1;
	}
}
````

<details>
<summary>Click For Output!</summary>

````console
macorapci@monster:~/CuriousAboutCoding/04-overloading$ javac Main02.java
Note: Main02.java uses or overrides a deprecated API.
Note: Recompile with -Xlint:deprecation for details.
macorapci@monster:~/CuriousAboutCoding/04-overloading$ java Main02
0
1
1
macorapci@monster:~/CuriousAboutCoding/04-overloading$ 
````

</details>

## Main03.java

````java
public class Main03 {
	public static void main(String... args){
		Main03 main = new Main03();
		System.out.println(main.bar(1));
		System.out.println(main.bar(new Integer(1)));
		System.out.println(main.bar(1L));
		System.out.println(main.bar("bar"));
	}

	public int bar(int number) {
		return 0;
	}

	public int bar(Object obj) {
		return 1;
	}
}
````

<details>
<summary>Click For Output!</summary>

````console
macorapci@monster:~/CuriousAboutCoding/04-overloading$ javac Main03.java
Note: Main03.java uses or overrides a deprecated API.
Note: Recompile with -Xlint:deprecation for details.
macorapci@monster:~/CuriousAboutCoding/04-overloading$ java Main03
0
1
1
1
macorapci@monster:~/CuriousAboutCoding/04-overloading$ 
````

</details>

## Main04.java

````java
import java.util.*;

public class Main04 {
	public static void main(String... args){
		Main04 main = new Main04();
		List<String> stringList = java.util.Arrays.of("1", "2", "3");
		System.out.println(main.bar(stringList));
	}

	public int bar(List<String> strings) {
		return 0;
	}

	public int bar(List<Integer> numbers) {
		return 1;
	}
}
````

<details>
<summary>Click For Output!</summary>

````console
macorapci@monster:~/CuriousAboutCoding/04-overloading$ javac Main04.java
Main04.java:14: error: name clash: bar(List<Integer>) and bar(List<String>) have the same erasure
	public int bar(List<Integer> numbers) {
	           ^
Main04.java:6: error: cannot find symbol
		List<String> stringList = java.util.Arrays.of("1", "2", "3");
		                                          ^
  symbol:   method of(String,String,String)
  location: class Arrays
2 errors
macorapci@monster:~/CuriousAboutCoding/04-overloading$ 
````

</details>

## Main05.java

````java
public class Main05 {
	public static void main(String... args){
		Main05 main = new Main05();
		String[] arr = ["aa", "bb", "cc"];
		System.out.println(main.bar(arr));
	}

	public int bar(String[] strings) {
		return 0;
	}

	public int bar(Integer[] numbers) {
		return 1;
	}
}
````

<details>
<summary>Click For Output!</summary>

````console
macorapci@monster:~/CuriousAboutCoding/04-overloading$ javac Main05.java
Main05.java:4: error: illegal start of expression
		String[] arr = ["aa", "bb", "cc"];
		               ^
1 error
macorapci@monster:~/CuriousAboutCoding/04-overloading$ 
````

</details>

## Main06.java

````java
public class Main06 {
	public static void main(String... args){
		Main06 main = new Main06();
		String[] arr = {"aa", "bb", "cc"};
		System.out.println(main.bar(arr));
	}

	public int bar(String[] strings) {
		return 0;
	}

	public int bar(Integer[] numbers) {
		return 1;
	}
}
````

<details>
<summary>Click For Output!</summary>

````console
macorapci@monster:~/CuriousAboutCoding/04-overloading$ javac Main06.java
macorapci@monster:~/CuriousAboutCoding/04-overloading$ java Main06
0
macorapci@monster:~/CuriousAboutCoding/04-overloading$ 
````

</details>

## Main07.java

````java
public class Main07 {
	public static void main(String... args){
		Main07 main = new Main07();
		String[] arr = {"aa", "bb", "cc"};
		System.out.println(main.bar(arr));
	}

	public int bar(String... strings) {
		return 0;
	}

	public int bar(Object obj) {
		return 1;
	}
}
````

<details>
<summary>Click For Output!</summary>

````console
macorapci@monster:~/CuriousAboutCoding/04-overloading$ javac Main07.java
macorapci@monster:~/CuriousAboutCoding/04-overloading$ java Main07
0
macorapci@monster:~/CuriousAboutCoding/04-overloading$ 
````

</details>
