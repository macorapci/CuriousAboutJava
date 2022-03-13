# Declare And Initialize

 ````console
macorapci@monster:~/CuriousAboutCoding$ java --version
openjdk 11.0.14 2022-01-18
OpenJDK Runtime Environment (build 11.0.14+9-Ubuntu-0ubuntu2.20.04)
OpenJDK 64-Bit Server VM (build 11.0.14+9-Ubuntu-0ubuntu2.20.04, mixed mode, sharing) 
````
## Main01.java

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
macorapci@monster:~/CuriousAboutCoding/01-declare-and-initialize$ javac Main01.java
macorapci@monster:~/CuriousAboutCoding/01-declare-and-initialize$ java Main01 
macorapci@monster:~/CuriousAboutCoding/01-declare-and-initialize$ 
````

</details>

## Main02.java

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
macorapci@monster:~/CuriousAboutCoding/01-declare-and-initialize$ javac Main02.java
Main02.java:4: error: variable a might not have been initialized
		System.out.println(a);
		                   ^
1 error
macorapci@monster:~/CuriousAboutCoding/01-declare-and-initialize$ 

````

</details>

## Main03.java

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
macorapci@monster:~/CuriousAboutCoding/01-declare-and-initialize$ javac Main03.java
macorapci@monster:~/CuriousAboutCoding/01-declare-and-initialize$ java Main03
0
macorapci@monster:~/CuriousAboutCoding/01-declare-and-initialize$ 
````

</details>

## Main04java

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
macorapci@monster:~/CuriousAboutCoding/01-declare-and-initialize$ javac Main04.java
Main04.java:10: error: variable b might not have been initialized
		System.out.println(b);
		                   ^
1 error
macorapci@monster:~/CuriousAboutCoding/01-declare-and-initialize$ 
````

</details>

## Main05java

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
macorapci@monster:~/CuriousAboutCoding/01-declare-and-initialize$ javac Main05.java
macorapci@monster:~/CuriousAboutCoding/01-declare-and-initialize$ java Main05
10
macorapci@monster:~/CuriousAboutCoding/01-declare-and-initialize$ 
````

</details>

## Main06.java

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
macorapci@monster:~/CuriousAboutCoding/01-declare-and-initialize$ javac Main06.java
macorapci@monster:~/CuriousAboutCoding/01-declare-and-initialize$ java Main06
10
macorapci@monster:~/CuriousAboutCoding/01-declare-and-initialize$ 
````

</details>

## Main07.java

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
macorapci@monster:~/CuriousAboutCoding/01-declare-and-initialize$ javac Main07.java
macorapci@monster:~/CuriousAboutCoding/01-declare-and-initialize$ java Main07
10
macorapci@monster:~/CuriousAboutCoding/01-declare-and-initialize$ 
````

</details>
