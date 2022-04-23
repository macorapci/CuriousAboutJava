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
$ java Main003
Override method
$ javac Main003.java
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
$ javac Main004.java
$ java Main004
0
0
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
$ java Main005
$ javac Main005.java
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
$ javac Main012.java
$ java Main012
1
2
3
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
$ javac Main016.java
$ java Main016
20
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
$ java Main018
30
$ javac Main018.java
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
$ java Main020
10
$ javac Main020.java
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
$ java Main023
Parent, Child, Parent
$ javac Main023.java
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
$ javac Main027.java
$ java Main027
21
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


## Main029

````java
public class Main029 {
	public static void main(String... args) {
		var impl = new Impl029();
		impl.getParent();
	}
}

interface Service029 {
	Parent029 getParent();
}

class Parent029 {}

class Child029 extends Parent029 {}

class Impl029 implements Service029 {
	public Parent029 getParent() {
		return new Child029();
	}
}

````
<details>
<summary>Click For Output!</summary>

````console
$ java Main029
$ javac Main029.java
$

````
</details>


## Main030

````java
public class Main030 {
	public static void main(String... args) {
		var foo = new Foo030();
		var value = foo.getBar();
		System.out.println(value);
	}
}


class Foo030 {
	int bar = 20;

	default int getBar() {
		print();
		return bar;
	}

	static void print() {
		System.out.println("Good word");
	}
}

````
<details>
<summary>Click For Output!</summary>

````console
$ javac Main030.java
Main030.java:13: error: modifier default not allowed here
	default int getBar() {
	            ^
1 error
$

````
</details>


## Main031

````java
public class Main031 {
	public static void main(String... args) {
		System.out.println(new Foo031(30).bar);
	}
}

class Foo031 {
	public static int bar = 10;
	
	public void Foo031(int bar) {
		this.bar = bar;
	}
}


````
<details>
<summary>Click For Output!</summary>

````console
$ javac Main031.java
Main031.java:3: error: constructor Foo031 in class Foo031 cannot be applied to given types;
		System.out.println(new Foo031(30).bar);
		                   ^
  required: no arguments
  found: int
  reason: actual and formal argument lists differ in length
1 error
$

````
</details>


## Main032

````java
public class Main032 {
	static interface Foo032 { }
	static class Bar032 implements Foo032 { }

	private static void print(Foo032 foo) {
		System.out.println("10");
	}

	private static void print(Bar032 bar) {
		System.out.println("20");
	}

	public static void main(String... args) {
		Foo032 foo = new Bar032();
		Bar032 bar = new Bar032();

		print(foo);
		print(bar);
	}
}



````
<details>
<summary>Click For Output!</summary>

````console
$ java Main032
10
20
$ javac Main032.java
$

````
</details>


## Main033

````java
public class Main033 {
	public static void main(String... args) {
		var bar = new Bar033();
        	bar.printValue();
	}
}

interface Foo033 {
	public default void printValue() {
		System.out.println(getValue());
	}

	private static String getValue() {
		return "Value";
	}
}

class Bar033 implements Foo033 {
	public void printValue() {
		System.out.println(getValue() + "Value");
	}
}

````
<details>
<summary>Click For Output!</summary>

````console
$ javac Main033.java
Main033.java:20: error: cannot find symbol
		System.out.println(getValue() + "Value");
		                   ^
  symbol:   method getValue()
  location: class Bar033
1 error
$

````
</details>


## Main034

````java
public class Main034 {
	public static void main(String... args) {
		var child = new Child034();
		System.out.println(child.foo);
	}
}

class Parent034 {
	public int foo;

	Parent034(int foo) {
		this.foo = foo;
	}
}

class Child034 extends Parent034 {
	Child034(int value) {
		super(value + 1);
	}

	Child034() {
		this(20);
	}
}

````
<details>
<summary>Click For Output!</summary>

````console
$ javac Main034.java
$ java Main034
21
$

````
</details>


## Main035

````java
public class Main035 {
	public static void main(String... args) {
		var value = Animal035.CAT.makeSound();
		System.out.println(value);
	}
}

enum Animal035 {
	CAT {
		public String makeSound() {
			return "MEOW!";
		}
	},
	DOG {
		public String makeSound() {
			return "WOOF!";
		}
	};

	public abstract String makeSound();
}

````
<details>
<summary>Click For Output!</summary>

````console
$ java Main035
MEOW!
$ javac Main035.java
$

````
</details>


## Main036

````java
public class Main036 {
	public static void main(String... args) {
		var var = new Foo036();
		System.out.println(var.value);	
	}
}

class Foo036 { 
	public int value;
}

````
<details>
<summary>Click For Output!</summary>

````console
$ java Main036
0
$ javac Main036.java
$

````
</details>


## Main037

````java
public class Main037 {
	public static void main(String ... args) {
		Foo037.Bar037.Car037 value = new Foo037().new Bar037().new Car037();
		value.printValues(30);
	}
}

class Foo037 {
	private int level = 1;

	class Bar037 {
		private int level = 2;

		class Car037 {
			private int level = 3;

			public void printValues(int level) {
				System.out.println(level);
				System.out.println(Foo037.Bar037.this.level);
				System.out.println(Bar037.this.level);
			}
		}
	}
}

````
<details>
<summary>Click For Output!</summary>

````console
$ java Main037
30
2
2
$ javac Main037.java
$

````
</details>


## Main038

````java
public class Main038 {
	public static void main(String... args) {
		Foo038 foo = () -> System.out.println("overriden");
		foo.method2();
	}
}

interface Foo038 {
	void method1() {
		method2();
	}

	default void method2() {
		System.out.println("interface method");
	}
}

````
<details>
<summary>Click For Output!</summary>

````console
$ javac Main038.java
Main038.java:9: error: interface abstract methods cannot have body
	void method1() {
	               ^
1 error
$

````
</details>


## Main039

````java
public class Main038 {
	public static void main(String... args) {
		var foo = Foo038.BAR;
		foo.setValue(30);

		System.out.println(foo.getValue());
		System.out.println(Foo038.BAR.getValue());
		System.out.println(Foo038.VAR.getValue());
	}
}

enum Foo038 {
	BAR(10), VAR(20);

	private int value;

	private Foo038(int value) {
		this.value = value;
	}

	public int getValue() {
		return this.value;
	}

	public void setValue(int value) {
		this.value = value;
	}
}

````
<details>
<summary>Click For Output!</summary>

````console
$ javac Main039.java
Main039.java:1: error: class Main038 is public, should be declared in a file named Main038.java
public class Main038 {
       ^
1 error
$

````
</details>


## Main040

````java
public class Main040 {
	public static void main(String... args) {
		var foo = new Foo040();
		foo.bar();
	}
}

class Foo040 {
	public void bar() {
		System.out.println("barBAR");
	}

	public int bar(int value) {
		System.out.println("BARbar");
		return 10;
	}

	public int bar(int value, boolean var) {
		System.out.println("barbar");
		return 20;
	}
}

````
<details>
<summary>Click For Output!</summary>

````console
$ javac Main040.java
$ java Main040
barBAR
$

````
</details>


## Main041

````java
public class Main041 {
	public static void main(String... args) {
		System.out.println("Compiled!");
	}
}

interface Foo041 {
	public static int bar() {
		return bar();
	}

	public abstract int anotherBar() {
		return anotherBar();
	}

	public default int defaultBar() {
		return defaultBar();
	}
}

````
<details>
<summary>Click For Output!</summary>

````console
$ javac Main041.java
Main041.java:12: error: interface abstract methods cannot have body
	public abstract int anotherBar() {
	                                 ^
1 error
$

````
</details>


## Main042

````java
public class Main042 {
	public static void main(String... args) {
		int value = 20;

		final class Foo042 extends Bar042 {
			public int getValue() {
				return value;
			}
		}

		System.out.println(new Foo042().getValue());
		value = 10;
	}
}

class Bar042 { }

````
<details>
<summary>Click For Output!</summary>

````console
$ javac Main042.java
Main042.java:7: error: local variables referenced from an inner class must be final or effectively final
				return value;
				       ^
1 error
$

````
</details>


## Main043

````java
public class Main043 {
        public static void main(String... args) {
                int value = 20;

                final class Foo043 extends Bar043 {
                        public int getValue() {
                                return value;
                        }
                }

                System.out.println(new Foo043().getValue());
        }
}       

class Bar043 { }

````
<details>
<summary>Click For Output!</summary>

````console
$ java Main043
20
$ javac Main043.java
$

````
</details>


## Main044

````java
public class Main044 {
	public static void main(String... args) {
		System.out.println(Foo044.bar(2f));
	}
}

class Foo044 {
	public static int bar(int value) {
		return 10;
	}

	public static int bar(double value) {
		return 20;
	}

	public static int bar(Float value) {
		return 30;
	}
}

````
<details>
<summary>Click For Output!</summary>

````console
$ java Main044
20
$ javac Main044.java
$

````
</details>


## Main045

````java
public class Main045 {
	public static void main(String... args) {
		class Foo045 {
			public int foo = 10;
		}

		class Bar045 extends Foo045{
			public int bar = 20;
		}

		System.out.println(new Bar045().foo);
	}
}

````
<details>
<summary>Click For Output!</summary>

````console
$ javac Main045.java
$ java Main045
10
$

````
</details>


## Main046

````java
public class Main046 {
	public static void main(String... args) {
		System.out.println("XD");
	}
}

class _ {}

class Str3@m {}

class CallBack$ {}

class _Value_ {}

class foo_ {}

class Bar50 {}

class 50Bar {}

````
<details>
<summary>Click For Output!</summary>

````console
$ javac Main046.java
Main046.java:7: error: as of release 9, '_' is a keyword, and may not be used as an identifier
class _ {}
      ^
Main046.java:9: error: '{' expected
class Str3@m {}
          ^
Main046.java:9: error: illegal start of type
class Str3@m {}
             ^
Main046.java:19: error: <identifier> expected
class 50Bar {}
     ^
Main046.java:19: error: reached end of file while parsing
class 50Bar {}
              ^
5 errors
$

````
</details>


## Main047

````java
public class Main047 {
	public static void main(String... args) {
		A047 foo = new C047();
		System.out.println(foo.bar);
	}
}

class A047 {
	public final int bar = 10; 
}

class B047 extends A047 {
	public final int bar = 20;
}

class C047 extends B047 {
	public final int bar = 30;
}

````
<details>
<summary>Click For Output!</summary>

````console
$ javac Main047.java
$ java Main047
10
$

````
</details>


## Main048

````java
public class Main048 {
	public static final void main(String... args) {
		System.out.println(new Bar048().getValue());
	}	
}


class Foo048 {
	private final String getValue() {
		return "Foo";
	}
}

class Bar048 extends Foo048 {
	public String getValue() {
		return "Bar";
	}
}

````
<details>
<summary>Click For Output!</summary>

````console
$ javac Main048.java
$ java Main048
Bar
$

````
</details>


## Main049

````java
public class Main049 {
        public static final void main(String... args) {
                System.out.println(new Bar049().getValue());
        }
}


class Foo049 {
        private final String getValue() {
                return "Foo";
        }
}

class Bar049 extends Foo049 {
        protected String getValue() {
                return "Bar";
        }
}


````
<details>
<summary>Click For Output!</summary>

````console
$ javac Main049.java
$ java Main049
Bar
$

````
</details>


## Main050

````java
public class Main050 {
	public static void main() {
		System.out.println(new Foo050().value);	
	}
}

class Foo050 {
	public final String value;

	public Foo050() {
		this("Bar");
		value = "new bar";
	}

	public Foo050(String value) {
		this.value = value;	
	}
}

````
<details>
<summary>Click For Output!</summary>

````console
$ javac Main050.java
Main050.java:12: error: variable value might already have been assigned
		value = "new bar";
		^
1 error
$

````
</details>


## Main051

````java
public class Main051 {
	public static void main(String... args) {
		var foo = new Foo051();
		foo.bar();
		foo.bar();
		foo.bar();
		System.out.println(foo.value);
	}
}

class Foo051 {
	static int value = 5;
	
	public boolean bar() {
		if (value < 4) {
			value--;
			return false;
		} else if (value >= 4) {
			value++;
			return true;
		}
	}
}

````
<details>
<summary>Click For Output!</summary>

````console
$ javac Main051.java
Main051.java:22: error: missing return statement
	}
	^
1 error
$

````
</details>



