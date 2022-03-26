# Declare And Initialize

 ````console
macorapci@monster:~/CuriousAboutCoding$ java --version
openjdk 11.0.14 2022-01-18
OpenJDK Runtime Environment (build 11.0.14+9-Ubuntu-0ubuntu2.20.04)
OpenJDK 64-Bit Server VM (build 11.0.14+9-Ubuntu-0ubuntu2.20.04, mixed mode, sharing) 
````

## Main01

````java
public class Main01 {
	public static void main(String... args) {
		int a;
	}
}

````
<details>
<summary>Click For Output!</summary>

````console
$ javac Main01.java
$ java Main01
$

````
</details>


## Main02

````java
public class Main02 {
	public static void main(String[] args) {
		int a;
		System.out.println(a);
	}
}

````
<details>
<summary>Click For Output!</summary>

````console
$ javac Main02.java
Main02.java:4: error: variable a might not have been initialized
		System.out.println(a);
		                   ^
1 error
$

````
</details>


## Main03

````java
public class Main03 {
	static int a;
	public static void main(String... args) {
		System.out.println(a);
	}
}

````
<details>
<summary>Click For Output!</summary>

````console
$ java Main03
0
$ javac Main03.java
$

````
</details>


## Main04

````java
public class Main04 {
	static int a;
	public final static void main(String... args) {
		int b;

		if (a == 0) {
			b = 10;
		}

		System.out.println(b);
	}
}

````
<details>
<summary>Click For Output!</summary>

````console
$ javac Main04.java
Main04.java:10: error: variable b might not have been initialized
		System.out.println(b);
		                   ^
1 error
$

````
</details>


## Main05

````java
public class Main05 {
	static int a;
	public static void main(String... args) {
		int b;

		if (a == 0) {
			b = 10;
		} else {
			b = 20;
		}

		System.out.println(b);
	}
}

````
<details>
<summary>Click For Output!</summary>

````console
$ javac Main05.java
$ java Main05
10
$

````
</details>


## Main06

````java
public class Main06 {
	static int a;

	public final static void main (String[] strings) {
		int b = 0;

		if (a == 0) {
			b = 10;
		}

		if (a != 0) {
			b = 20;
		}

		System.out.println(b);
	}
}

````
<details>
<summary>Click For Output!</summary>

````console
$ javac Main06.java
$ java Main06
10
$

````
</details>


## Main07

````java
public class Main07 {
	static final int a = 0;

	public final static void main (String[] strings) {
		int b = 0;

		if (a == 0) {
			b = 10;
		}

		if (a != 0) {
			b = 20;
		}

		System.out.println(b);
	}
}

````
<details>
<summary>Click For Output!</summary>

````console
$ javac Main07.java
$ java Main07
10
$

````
</details>


## Main08

````java
public class Main08 {
	static final int a = 0;

	public final static void main (String[] strings) {
		int b = 0;

		if (a == 0) {
			b = 10;
		}

		System.out.println(b);
	}
}

````
<details>
<summary>Click For Output!</summary>

````console
$ java Main08
10
$ javac Main08.java
$

````
</details>



