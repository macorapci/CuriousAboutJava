# Static

 ````console
macorapci@monster:~/CuriousAboutCoding$ java --version
openjdk 11.0.14 2022-01-18
OpenJDK Runtime Environment (build 11.0.14+9-Ubuntu-0ubuntu2.20.04)
OpenJDK 64-Bit Server VM (build 11.0.14+9-Ubuntu-0ubuntu2.20.04, mixed mode, sharing) 
````
## Main01.java

````java
public class Main01 {
	private static String name = "String";
	public void staticPrint() {
		System.out.println(name);
	}

	public static void main(String... texts) {
		staticPrint();
	}
}
````

<details>
<summary>Click For Output!</summary>

````console
macorapci@monster:~/CuriousAboutCoding/02-static$ javac Main01.java 
Main01.java:8: error: non-static method staticPrint() cannot be referenced from a static context
		staticPrint();
		^
1 error
macorapci@monster:~/CuriousAboutCoding/02-static$ 
````

</details>

## Main02.java

````java
public class Main02 {
	private String name = "String";
	public static void staticPrint() {
		System.out.println(name);
	}

	public static void main(String... texts) {
		staticPrint();
	}
}
````

<details>
<summary>Click For Output!</summary>

````console
macorapci@monster:~/CuriousAboutCoding/02-static$ javac Main02.java 
Main02.java:4: error: non-static variable name cannot be referenced from a static context
		System.out.println(name);
		                   ^
1 error
macorapci@monster:~/CuriousAboutCoding/02-static$ 
````

</details>

## Main03.java

````java
public class Main03 {
	public static void main(String... args) {
		Mehmet03 mehmet = new Mehmet03();
		System.out.println(mehmet.value);
		
		Mehmet03 mehmet2 = new Mehmet03();
		mehmet2.value++;

		System.out.println(mehmet.value);
	}

}

class Mehmet03 {
	public static int value;
}
````

<details>
<summary>Click For Output!</summary>

````console
macorapci@monster:~/CuriousAboutCoding/02-static$ javac Main03.java 
macorapci@monster:~/CuriousAboutCoding/02-static$ java Main03
0
1
macorapci@monster:~/CuriousAboutCoding/02-static$ 
````

</details>

## Main04java

````java
public class Main04 {
	public static void main(String... args) {
		Anil04 anil = new Anil04();
		System.out.println(anil.value);
		
		anil = null;
		
		System.out.println(anil.value);
	}

}

class Anil04 {
	public static int value;
}
````

<details>
<summary>Click For Output!</summary>

````console
macorapci@monster:~/CuriousAboutCoding/02-static$ javac Main04.java 
macorapci@monster:~/CuriousAboutCoding/02-static$ java Main04
0
0
macorapci@monster:~/CuriousAboutCoding/02-static$ 
````

</details>

## Main05java

````java
public class Main05 {
	public static void main(String... args) {
		Anil05 anil;
		System.out.println(anil.value);
	}

}

class Anil05 {
	public static int value;
}
````

<details>
<summary>Click For Output!</summary>

````console
macorapci@monster:~/CuriousAboutCoding/02-static$ javac Main05.java 
Main05.java:4: error: variable anil might not have been initialized
		System.out.println(anil.value);
		                   ^
1 error
macorapci@monster:~/CuriousAboutCoding/02-static$ 
````

</details>

## Main06.java

````java
public class Main06 {
	private static int value;

	static {
		value = 10;
	}

	public static void main(String... mehmets) {
		System.out.println(value);
	}
}
````

<details>
<summary>Click For Output!</summary>

````console
macorapci@monster:~/CuriousAboutCoding/02-static$ javac Main06.java 
macorapci@monster:~/CuriousAboutCoding/02-static$ java Main06
10
macorapci@monster:~/CuriousAboutCoding/02-static$ 
````

</details>

## Main07.java

````java
public class Main07 {
	private final static int value;

	static {
		value = 10;
	}

	public static void main(String... mehmets) {
		System.out.println(value);
	}
}
````

<details>
<summary>Click For Output!</summary>

````console
macorapci@monster:~/CuriousAboutCoding/02-static$ javac Main07.java 
macorapci@monster:~/CuriousAboutCoding/02-static$ java Main07
10
macorapci@monster:~/CuriousAboutCoding/02-static$ 
````

</details>

## Main08.java

````java
public class Main08 {
	private final static int value = 20;

	static {
		value = 10;
	}

	public static void main(String... mehmets) {
		System.out.println(value);
	}
}
````

<details>
<summary>Click For Output!</summary>

````console
macorapci@monster:~/CuriousAboutCoding/02-static$ javac Main08.java 
Main08.java:5: error: cannot assign a value to final variable value
		value = 10;
		^
1 error
macorapci@monster:~/CuriousAboutCoding/02-static$ 
````

</details>

## Main09.java

````java
public class Main09 {
	private static int value = 20;

	static {
		value = 10;
	}

	public static void main(String... mehmets) {
		System.out.println(value);
	}
}
````

<details>
<summary>Click For Output!</summary>

````console
macorapci@monster:~/CuriousAboutCoding/02-static$ javac Main09.java 
macorapci@monster:~/CuriousAboutCoding/02-static$ java Main09 
10
macorapci@monster:~/CuriousAboutCoding/02-static$ 
````

</details>

## Main10.java

````java
public class Main10 {
	public static void main(String[] args) {
		System.out.println(Mehmet10.value);

		Mehmet10 anil = new Mehmet10();
		System.out.println(anil.value);

		anil = null;
		System.out.println(anil.value);
	}
}

class Mehmet10 {
	static int value = 10;

	static {
		value = 20;
	}

	Mehmet10() {
		value = 30;
	}
}
````

<details>
<summary>Click For Output!</summary>

````console
macorapci@monster:~/CuriousAboutCoding/02-static$ javac Main10.java 
macorapci@monster:~/CuriousAboutCoding/02-static$ java Main10
20
30
30
macorapci@monster:~/CuriousAboutCoding/02-static$ 
````

</details>
