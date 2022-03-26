# Declare Constructor

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
		C01 c = new C01();
	}
}


class A01 {
	public A01() {
		System.out.print("A-");
	}
}


class B01 extends A01 {
	public B01(int deneme) {
		System.out.print("B-");
	}	
}

class C01 extends B01 {
	public C01() {
		System.out.print("C-");
	}
}

````
<details>
<summary>Click For Output!</summary>

````console
$ javac Main01.java
Main01.java:22: error: constructor B01 in class B01 cannot be applied to given types;
	public C01() {
	             ^
  required: int
  found: no arguments
  reason: actual and formal argument lists differ in length
1 error
$

````
</details>


## Main02

````java
public class Main02 {
	public static void main(String... args) {
		C02 c = new C02();
	}
}


class A02 {
	public A02() {
		System.out.print("A-");
	}
}


class B02 extends A02 {
	public B02(int deneme) {
		System.out.print("B-");
	}	
}

class C02 extends B02 {
	public C02() {
		System.out.print("C-");
		super(1);
	}
}

````
<details>
<summary>Click For Output!</summary>

````console
$ javac Main02.java
Main02.java:22: error: constructor B02 in class B02 cannot be applied to given types;
	public C02() {
	             ^
  required: int
  found: no arguments
  reason: actual and formal argument lists differ in length
Main02.java:24: error: call to super must be first statement in constructor
		super(1);
		     ^
2 errors
$

````
</details>


## Main03

````java
public class Main03 {
	public static void main(String... args) {
		C03 c = new C03();
	}
}


class A03 {
	public A03() {
		System.out.print("A-");
	}
}


class B03 extends A03 {
	public B03(int deneme) {
		System.out.print("B-");
	}	
}

class C03 extends B03 {
	public C03() {
		super(1);
		System.out.print("C-");
	}
}

````
<details>
<summary>Click For Output!</summary>

````console
$ javac Main03.java
$ java Main03
A-B-C-
$

````
</details>


## Main04

````java
public class Main04 {
	private int value1;
	private static int value2;
	{System.out.println(value1);}
	{value2 = 10; System.out.println(value2);}
	static {
		value2= 20; System.out.println(value2);
	}

	public static void main(String... args) {
		value2 = 30;
		System.out.println(value2);
	}
}

````
<details>
<summary>Click For Output!</summary>

````console
$ java Main04
20
30
$ javac Main04.java
$

````
</details>


## Main05

````java
public class Main05 {
	private int value1;
	private static int value2;
	{System.out.println(value1);}
	{value2 = 10; System.out.println(value2);}
	static {
		value2= 20; System.out.println(value2);
	}

	public Main05() {
		value2 = 30;
                System.out.println(value2);
	}

	public static void main(String... args) {
		Main05 main = new Main05();
	}
}

````
<details>
<summary>Click For Output!</summary>

````console
$ javac Main05.java
$ java Main05
20
0
10
30
$

````
</details>


## Main06

````java
public class Main06 {
	public static void main(String... args) {
		B06 b = new B06();
	}
}


class A06 {
	static {
		System.out.println("A");
	}

	{
		System.out.println("B");
	}

	public A06() {
		System.out.println("C");
	}

	public A06(int a) {
		System.out.println("D");
	}
}


class B06 extends A06 {
	static {System.out.println("E");}
	{System.out.println("F");}

	public B06() {
		super(1);
		System.out.println("G");
	}
}


class C06 extends B06 {
	static {System.out.println("H");}
        {System.out.println("I");}

        public C06() {
                System.out.println("J");
        }

}

````
<details>
<summary>Click For Output!</summary>

````console
$ javac Main06.java
$ java Main06
A
E
B
D
F
G
$

````
</details>


## Main07

````java
public class Main07 {
	public static void main(String... args){
		A07 foo = new A07();
		System.out.println(foo.a);
		System.out.println(foo.b);
	}
}

class A07 {
	public int a;
	public int b;

	public A07() {
		this(20);
		a = 10;
	}

	public A07(int b) {
		this.b = b;
	}
}

````
<details>
<summary>Click For Output!</summary>

````console
$ javac Main07.java
$ java Main07
10
20
$

````
</details>


## Main08

````java
public class Main08 {
	public static void main(String... args){
		A08 foo = new A08();
		System.out.println(foo.a);
		System.out.println(foo.b);
	}
}

class A08 {
	public int a;
	public int b;

	public A08() {
		a = 10;
		this = this(20);
	}

	public A08(int b) {
		this.b = b;
	}
}

````
<details>
<summary>Click For Output!</summary>

````console
$ javac Main08.java
Main08.java:15: error: cannot assign to 'this'
		this = this(20);
		^
Main08.java:15: error: call to this must be first statement in constructor
		this = this(20);
		           ^
2 errors
$

````
</details>

