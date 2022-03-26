# Object Oriented

 ````console
macorapci@monster:~/CuriousAboutCoding$ java --version
openjdk 11.0.14 2022-01-18
OpenJDK Runtime Environment (build 11.0.14+9-Ubuntu-0ubuntu2.20.04)
OpenJDK 64-Bit Server VM (build 11.0.14+9-Ubuntu-0ubuntu2.20.04, mixed mode, sharing) 
````

## Main001

````java
public class Main001 {
	public static final void main(String... args) {
		Imp001 imp = new Imp001();
		imp.print();	
	}
}

interface Interface001 {
	public final default void print() {
		System.out.println("Default method");
	}
}

class Imp001 implements Interface001 {
	public void print() {
		System.out.println("Override method");
	}
}

````
<details>
<summary>Click For Output!</summary>

````console
$ javac Main001.java
Main001.java:9: error: modifier final not allowed here
	public final default void print() {
	                          ^
1 error
$

````
</details>


## Main002

````java
public class Main002 {
	public static final void main(String... args) {
		Imp002 imp = new Imp002();
		imp.print();	
	}
}

interface Interface002 {
	default void print() {
		System.out.println("Default method");
	}
}

class Imp002 implements Interface002 {
	void print() {
		System.out.println("Override method");
	}
}

````
<details>
<summary>Click For Output!</summary>

````console
$ javac Main002.java
Main002.java:15: error: print() in Imp002 cannot implement print() in Interface002
	void print() {
	     ^
  attempting to assign weaker access privileges; was public
1 error
$

````
</details>


## Main003

````java
public class Main003 {
	public static final void main(String... args) {
		Imp003 imp = new Imp003();
		imp.print();	
	}
}

interface Interface003 {
	default void print() {
		System.out.println("Default method");
	}
}

class Imp003 implements Interface003 {
	public void print() {
		System.out.println("Override method");
	}
}

````
<details>
<summary>Click For Output!</summary>

````console
$ javac Main003.java
$ java Main003
Override method
$

````
</details>


## Main004

````java
public class Main004 {
	public static void main(String... amIHave2WriteThisOverAndOverAgain) {
		final var tool = new Tool004();
		System.out.println(tool.getToolSize());
		
		Tool004.changeToolSize(tool, 20);
		System.out.println(tool.getToolSize());
	}
}

class Tool004 {
	private int toolSize;

	public static void changeToolSize(Tool004 tool, int size) {
		tool = new Tool004();
		tool.toolSize = size;
	}

	public int getToolSize() {
		return this.toolSize;
	}
}

````
<details>
<summary>Click For Output!</summary>

````console
$ java Main004
0
0
$ javac Main004.java
$

````
</details>


## Main005

````java
public class Main005 {
	public static void main(String[] yes) {
		var cat = new Cat005();
		cat.new Tiger005();
	}
}

class Cat005 {
	class Tiger005 extends Cat005 {}

	public void roar() {
		System.out.println("Meow!");
	}
}

````
<details>
<summary>Click For Output!</summary>

````console
$ javac Main005.java
$ java Main005
$

````
</details>


## Main006

````java
public class Main006 {
        public static void main(String[] yes) {
                var cat = new Cat006();
                Cat006.new Tiger006();
        }
}       

class Cat006 {
        class Tiger006 extends Cat006 {}

        public void roar() {
                System.out.println("Meow!");
        }
} 

````
<details>
<summary>Click For Output!</summary>

````console
$ javac Main006.java
Main006.java:4: error: cannot find symbol
                Cat006.new Tiger006();
                ^
  symbol:   variable Cat006
  location: class Main006
1 error
$

````
</details>


## Main007

````java
public class Main007 {
        public static void main(String[] orNot) {
                var cat = new Cat007();
                new Cat007().Tiger007();
        }
}       

class Cat007 {
        class Tiger007 extends Cat007 {}

        public void roar() {
                System.out.println("Meow!");
        }
} 

````
<details>
<summary>Click For Output!</summary>

````console
$ javac Main007.java
Main007.java:4: error: cannot find symbol
                new Cat007().Tiger007();
                            ^
  symbol:   method Tiger007()
  location: class Cat007
1 error
$

````
</details>


## Main008

````java
public class Main008 {
        public static void main(String[] yes) {
                var cat = new Cat008();
                new Cat008.Tiger008();
        }
}       

class Cat008 {
        class Tiger008 extends Cat008 {}

        public void roar() {
                System.out.println("Meow!");
        }
} 

````
<details>
<summary>Click For Output!</summary>

````console
$ javac Main008.java
Main008.java:4: error: an enclosing instance that contains Cat008.Tiger008 is required
                new Cat008.Tiger008();
                ^
1 error
$

````
</details>


## Main009

````java
public class Main009 {
	public void print(int number) {
		System.out.println("1" + number.toString());
	}

	public void print(Integer number) {
		System.out.println("2" + number.toString());
	}

	public void print(Object number) {
		System.out.println("3" + number.toString());
	}

	public static void main(String... aaaaaaaa) {
		print((short)1);
	}
}

````
<details>
<summary>Click For Output!</summary>

````console
$ javac Main009.java
Main009.java:3: error: int cannot be dereferenced
		System.out.println("1" + number.toString());
		                               ^
Main009.java:15: error: reference to print is ambiguous
		print((short)1);
		^
  both method print(int) in Main009 and method print(Object) in Main009 match
2 errors
$

````
</details>


## Main010

````java
public class Main010 {
	public static void main(String[] strings) {
		new Imp010().get();
	}
}

abstract class UselessAfterEleven010 {
	public final void get() {
		System.out.println("Why we need abstact class after Interface default Methods");
	}
}

class Imp010 extends UselessAfterEleven010 {
	public final void get() {
		System.out.println("I don't know.");
	}
}

````
<details>
<summary>Click For Output!</summary>

````console
$ javac Main010.java
Main010.java:14: error: get() in Imp010 cannot override get() in UselessAfterEleven010
	public final void get() {
	                  ^
  overridden method is final
1 error
$

````
</details>


## Main011

````java
public class Main011 {
	public static void main(String... strings) {
		var day = Day011.MONDAY;
		switch (day) {
			case Day011.MONDAY:
				System.out.println("1");
			case Day011.TUESDAY:
				System.out.println("2");
			default:
				System.out.println("3");	
		}	
	}
}

enum Day011 {
	MONDAY, 
	TUESDAY, 
	FRIDAY, 
	SATURDAY, 
	SUNDAY
}

````
<details>
<summary>Click For Output!</summary>

````console
$ javac Main011.java
Main011.java:5: error: an enum switch case label must be the unqualified name of an enumeration constant
			case Day011.MONDAY:
			           ^
Main011.java:7: error: an enum switch case label must be the unqualified name of an enumeration constant
			case Day011.TUESDAY:
			           ^
2 errors
$

````
</details>


## Main012

````java
public class Main012 {
	public static void main(String... strings) {
		var day = Day012.MONDAY;
		switch (day) {
			case MONDAY:
				System.out.println("1");
			case TUESDAY:
				System.out.println("2");
			default:
				System.out.println("3");	
		}	
	}
}

enum Day012 {
	MONDAY, 
	TUESDAY, 
	FRIDAY, 
	SATURDAY, 
	SUNDAY
}

````
<details>
<summary>Click For Output!</summary>

````console
$ java Main012
1
2
3
$ javac Main012.java
$

````
</details>


## Main013

````java
public class Main013 {
	public static void main(String... strings) {
		var day = Day013.MONDAY;
		switch (day) {
			default:
                                System.out.println("0");	
			case MONDAY:
				System.out.println("1");
			case TUESDAY:
				System.out.println("2");	
		}	
	}
}

enum Day013 {
	MONDAY, 
	TUESDAY, 
	FRIDAY, 
	SATURDAY, 
	SUNDAY
}

````
<details>
<summary>Click For Output!</summary>

````console
$ java Main013
1
2
$ javac Main013.java
$

````
</details>


## Main014

````java
public class Main014 {
	public static void main(String... s) {
		var child = new Child014();
		System.out.println(child.getNumber());
	}
}

class Parent014 {
	private int number = 10;
}

class Child014 extends Parent014 {
	public int getNumber() {
		return super.number;
	}
}

````
<details>
<summary>Click For Output!</summary>

````console
$ javac Main014.java
Main014.java:14: error: number has private access in Parent014
		return super.number;
		            ^
1 error
$

````
</details>


## Main015

````java
public class Main015 {
	public static void main() {
		Parent parent = new Parent();
		parent.print();
	}
}


class Parent extends Child {
	public static void print() {
		System.out.println(super.getNumber());
	}
}

class Child {
	public static int getNumber() {
		return 10;
	}
}

````
<details>
<summary>Click For Output!</summary>

````console
$ javac Main015.java
Main015.java:11: error: non-static variable super cannot be referenced from a static context
		System.out.println(super.getNumber());
		                   ^
1 error
$

````
</details>


## Main016

````java
public class Main016 {
	public static void main(String... args) {
		var child = new Child016();
		System.out.println(child.getValue());
	}
}

class Parent016 {
	public int value = 20;
}

class Child016 extends Parent016 {
	public int getValue() {
		return this.value;
	}
}

````
<details>
<summary>Click For Output!</summary>

````console
$ java Main016
20
$ javac Main016.java
$

````
</details>


## Main017

````java
public class Main017 {
	public static void main(String... args) {
		var impl = new Impl017();
        	System.out.println(impl.getValue(20));
	}
}

interface FuncInterfaceOne017 {
	public default int getValue() {
		return 10;
	}
}

interface FuncInterfaceTwo017 {
	public default int getValue() {
		return 20;
	}
}

class Impl017 implements FuncInterfaceOne017, FuncInterfaceTwo017 {
	public int getValue(int value) {
		return value;
	}
}

````
<details>
<summary>Click For Output!</summary>

````console
$ javac Main017.java
Main017.java:20: error: types FuncInterfaceOne017 and FuncInterfaceTwo017 are incompatible;
class Impl017 implements FuncInterfaceOne017, FuncInterfaceTwo017 {
^
  class Impl017 inherits unrelated defaults for getValue() from types FuncInterfaceOne017 and FuncInterfaceTwo017
1 error
$

````
</details>


## Main018

````java
public class Main018 {
	public static void main(String... args) {
		var impl = new Impl018();
        	System.out.println(impl.getValue());
	}
}       

interface FuncInterfaceOne018 {
        public default int getValue() {
                return 10;
        }
}       

interface FuncInterfaceTwo018 {
        public default int getValue() {
                return 20;
        }
}       

class Impl018 implements FuncInterfaceOne018, FuncInterfaceTwo018 {
        public int getValue() {
                return 30;
        }
}

````
<details>
<summary>Click For Output!</summary>

````console
$ javac Main018.java
$ java Main018
30
$

````
</details>


## Main019

````java
public class Main019 {
	public static void main(String... args) {
		var impl = new Impl019();
        	System.out.println(impl.getValue());
	}
}       

interface FuncInterfaceOne019 {
        public default int getValue() {
                return 10;
        }
}       

interface FuncInterfaceTwo019 {
        public default int getValue() {
                return 20;
        }
}       

class Impl019 implements FuncInterfaceOne019, FuncInterfaceTwo019 {
        public int getValue() {
                return super.FuncInterfaceOne019.getValue();
        }
}

````
<details>
<summary>Click For Output!</summary>

````console
$ javac Main019.java
Main019.java:22: error: cannot find symbol
                return super.FuncInterfaceOne019.getValue();
                            ^
  symbol: variable FuncInterfaceOne019
1 error
$

````
</details>


## Main020

````java
public class Main020 {
        public static void main(String... args) {
                var impl = new Impl020();
                System.out.println(impl.getValue());
        }
}

interface FuncInterfaceOne020 {
        public default int getValue() {
                return 10;
        }
}

interface FuncInterfaceTwo020 {
        public default int getValue() {
                return 20;
        }
}

class Impl020 implements FuncInterfaceOne020, FuncInterfaceTwo020 {
        public int getValue() {
                return FuncInterfaceOne020.super.getValue();
        }
}

````
<details>
<summary>Click For Output!</summary>

````console
$ javac Main020.java
$ java Main020
10
$

````
</details>


## Main021

````java
public class Main021 {
	public static void main(String... args) {
		ThrowOut021.throwWithoutInstance();
	}
}

interface ThrowOut021 {
	String WHO = "Abstract Class";
	
	public int getTimes();

	public static void throwWithoutInstance() {
		for (var k=0; k<getTimes(); k++) {
			throwNow(WHO);
		}
	}

	public static void throwNow(String who) {
		System.out.println(who + " throwed as aspected!");
	}	
}

class Impl021 {
	public int getTimes() {
		return 11;
	}
}

````
<details>
<summary>Click For Output!</summary>

````console
$ javac Main021.java
Main021.java:13: error: non-static method getTimes() cannot be referenced from a static context
		for (var k=0; k<getTimes(); k++) {
		                ^
1 error
$

````
</details>


## Main022

````java
public class Main022 {
	public static void main(String... args) {
		var impl = new Impl022();
		System.out.println(impl.getValue());
	}
}


interface Interface022 {
	protected abstract int getValue();
}

class Impl022 implements Interface022 {
	public int getValue() {
		return 20;
	}
}

````
<details>
<summary>Click For Output!</summary>

````console
$ javac Main022.java
Main022.java:10: error: modifier protected not allowed here
	protected abstract int getValue();
	                       ^
1 error
$

````
</details>


## Main023

````java
public class Main023 {
	public static void main(String... args) {
		Parent023 parent = new Child023();
		var child = new Child023();
		Parent023 anotherParent = child;
		
		System.out.println(parent.type + ", " + child.type + ", " + anotherParent.type);
	}
}

class Parent023 {
	public String type = "Parent";
}

class Child023 extends Parent023 {
	public String type = "Child";
}

````
<details>
<summary>Click For Output!</summary>

````console
$ javac Main023.java
$ java Main023
Parent, Child, Parent
$

````
</details>


## Main024

````java
public class Main024 {
	public static void main(String... args) {
		new Parent024().run();
	}
}

class Parent024 {
	public Parent024() {
		System.out.println("a");
	}

	public void Parent024() {
		System.out.println("b");
	}

	public void run() {
		new Parent024();
		Parent024();
	}
}

````
<details>
<summary>Click For Output!</summary>

````console
$ javac Main024.java
$ java Main024
a
a
b
$

````
</details>


## Main025

````java
public class Main025 {
	public static void main() {
		int intValue1 = 20, intValue2 = 30;
		var number = 10;
        	var value = "value", anotherValue = 20;
		System.out.println("done!");
	}
}

````
<details>
<summary>Click For Output!</summary>

````console
$ javac Main025.java
Main025.java:5: error: 'var' is not allowed in a compound declaration
        	var value = "value", anotherValue = 20;
        	                     ^
1 error
$

````
</details>


## Main026

````java
public class Main026 {
	public static void main(String... args) {
		System.out.println("I guess it compiled :)");
	}
}

@FunctionalInterface
interface FuncInterface026 {
	public static void method1() {}
	private static void method2() {}
	default void method3() {}
	void method4();
}

````
<details>
<summary>Click For Output!</summary>

````console
$ javac Main026.java
$ java Main026
I guess it compiled :)
$

````
</details>


## Main027

````java
public class Main027 {
	public static void main(String... args){
		System.out.println(new Parent027().getValue());
	}
}

class Parent027 {
	private boolean booleanValue;
	private int intValue = 0;

	public Parent027() {
		this(20);
		booleanValue = true;
	}

	public Parent027(int value) {
		this.intValue = booleanValue ? value : value + 1;
	}

	public int getValue() {
		return this.intValue;
	}
}



````
<details>
<summary>Click For Output!</summary>

````console
$ java Main027
21
$ javac Main027.java
$

````
</details>


## Main028

````java
public class Main028 {
	public static void main(String... args) {
		var impl = new Impl028();
		impl.getParent();
	}
}

interface Service028 {
	Parent028 getParent();
}

class Parent028 {}

class Child028 extends Parent028 {}

abstract class Impl028 implements Service028 {
	public Parent028 getParent() {
		return new Child028();
	}
}

````
<details>
<summary>Click For Output!</summary>

````console
$ javac Main028.java
Main028.java:3: error: Impl028 is abstract; cannot be instantiated
		var impl = new Impl028();
		           ^
1 error
$

````
</details>



