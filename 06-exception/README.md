# Exception

 ````console
macorapci@monster:~/CuriousAboutCoding$ java --version
openjdk 11.0.14 2022-01-18
OpenJDK Runtime Environment (build 11.0.14+9-Ubuntu-0ubuntu2.20.04)
OpenJDK 64-Bit Server VM (build 11.0.14+9-Ubuntu-0ubuntu2.20.04, mixed mode, sharing) 
````

## Main001

````java
public class Main001 {
	public static void main(String... args) throws Exception {
		foo();
	}

	public static void foo() {
		try {
			throw Exception();
		} catch (RuntimeException ex) {

		}
	}
}

````
<details>
<summary>Click For Output!</summary>

````console
$ javac Main001.java
Main001.java:8: error: cannot find symbol
			throw Exception();
			      ^
  symbol:   method Exception()
  location: class Main001
1 error
$

````
</details>


## Main002

````java
public class Main002 {
	public static void main(String... args) throws Exception {
		foo();
	}

	public static void foo() {
		try {
			throw new Exception();
		} catch (RuntimeException ex) {

		}
	}
}

````
<details>
<summary>Click For Output!</summary>

````console
$ javac Main002.java
Main002.java:8: error: unreported exception Exception; must be caught or declared to be thrown
			throw new Exception();
			^
1 error
$

````
</details>


## Main003

````java
public class Main003 {
	public static void main(String... args) throws Exception {
		foo();
	}

	public static void foo() throws Exception {
		try {
			throw new Exception();
		} catch (RuntimeException ex) {}
	}
}

````
<details>
<summary>Click For Output!</summary>

````console
$ javac Main003.java
$ java Main003
Exception in thread "main" java.lang.Exception
	at Main003.foo(Main003.java:8)
	at Main003.main(Main003.java:3)
$

````
</details>


## Main004

````java
public class Main004 {
	public static void main(String... args) throws Exception {
		foo();
	}

	public static void foo() throws Exception {
		try {
			throw new Exception();
		} finally {
			System.out.println("Finally");
		}
	}
}

````
<details>
<summary>Click For Output!</summary>

````console
$ java Main004
Finally
$ javac Main004.java
$

````
</details>


## Main005

````java
public class Main005 {
	public static void main(String... args) throws Exception {
		foo();
	}

	public static void foo() throws Exception {
		try {
			throw new Exception();
		}
	}
}

````
<details>
<summary>Click For Output!</summary>

````console
$ javac Main005.java
Main005.java:7: error: 'try' without 'catch', 'finally' or resource declarations
		try {
		^
1 error
$

````
</details>


## Main006

````java
public class Main006 {
	public static void main(String... args) throws Exception {
		System.out.println(foo());
	}

	public static int foo() throws Exception {
		try {
			return 1;
		} finally {
			return 2;
		}
	}
}

````
<details>
<summary>Click For Output!</summary>

````console
$ java Main006
2
$ javac Main006.java
$

````
</details>


## Main007

````java
public class Main007 {
        public static void main(String... args) throws Exception {
                System.out.println(foo());
        }

        public static int foo() throws Exception {
                try {
                        throw new Exception();
                } catch(Exception ex) {
			return 1;	
		} finally {
                        return 2;
                }
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
import java.util.Scanner;

public class Main008 {
	public static void main(String... args) {
		try (Scanner s = new Scanner(System.in)) {
			System.out.println("try with resource without catch and finally blocks");
		}
	}
}

````
<details>
<summary>Click For Output!</summary>

````console
$ javac Main008.java
$ java Main008
try with resource without catch and finally blocks
$

````
</details>


## Main009

````java
import java.util.Scanner;

public class Main009 {
        public static void main(String... args) {
                try (Scanner s = new Scanner(System.in)) {
                        s = null;
                }
        }
}


````
<details>
<summary>Click For Output!</summary>

````console
$ javac Main009.java
Main009.java:6: error: auto-closeable resource s may not be assigned
                        s = null;
                        ^
1 error
$

````
</details>


## Main010

````java
import java.util.Scanner;

public class Main010 {
        public static void main(String... args) {
		Scanner s = null;
                try (s = new Scanner(System.in)) {
                        s = null;
                }
        }
}


````
<details>
<summary>Click For Output!</summary>

````console
$ javac Main010.java
Main010.java:6: error: the try-with-resources resource must either be a variable declaration or an expression denoting a reference to a final or effectively final variable
                try (s = new Scanner(System.in)) {
                       ^
1 error
$

````
</details>


## Main011

````java
public class Main011 {
	public static void main(String... args) {
		System.out.println("Compiled!");
	}
}

class MyException011 extends Exception {
	public MyException011() {
		super("This is my exception!");
	}

	public MyException011(String msg) {
		super(new MyException011());
	}

	public MyException011(Exception ex) {

	}
}

````
<details>
<summary>Click For Output!</summary>

````console
$ javac Main011.java
$ java Main011
Compiled!
$

````
</details>


## Main012

````java
public class Main012 {
	public static void main(String... args) {
		try {
			System.out.println("A");
			var value = args[1000];
		} catch (RuntimeException ex) {
			System.out.println("B");
			throw ex;
		} catch (Exception ex) {
			System.out.println("C");
		} finally {
			System.out.println("D");
		}
	}	
}

````
<details>
<summary>Click For Output!</summary>

````console
$ java Main012
A
B
D
$ javac Main012.java
$

````
</details>


## Main013

````java
public class Main013 {
	public static void main(String... args) {
		var x = new AutoCloseableImp013(1);

		try(x;
			var y = new AutoCloseableImp013(2);
			var z = new AutoCloseableImp013(3)) {
			
		} finally {
			System.out.println("final");
		}
	}
}

class AutoCloseableImp013 implements AutoCloseable {
	private int value;

	AutoCloseableImp013(int value) {
		this.value = value; 
	}

	public void close() throws Exception {
		System.out.println(value);
	}
}

````
<details>
<summary>Click For Output!</summary>

````console
$ javac Main013.java
Main013.java:5: error: unreported exception Exception; must be caught or declared to be thrown
		try(x;
		    ^
Main013.java:6: error: unreported exception Exception; must be caught or declared to be thrown
			var y = new AutoCloseableImp013(2);
			    ^
  exception thrown from implicit call to close() on resource variable 'y'
Main013.java:7: error: unreported exception Exception; must be caught or declared to be thrown
			var z = new AutoCloseableImp013(3)) {
			    ^
  exception thrown from implicit call to close() on resource variable 'z'
3 errors
$

````
</details>


## Main014

````java
public class Main014 {
        public static void main(String... args) {
                var x = new AutoCloseableImp014(1);

                try(x;
                        var y = new AutoCloseableImp014(2);
                        var z = new AutoCloseableImp014(3)) {

			System.out.println("0");
                } finally {
                        System.out.println("final");
                }
        }
}

class AutoCloseableImp014 implements AutoCloseable {
        private int value;

        AutoCloseableImp014(int value) {
                this.value = value;
        }

        public void close() {
                System.out.println(value);
        }
}

````
<details>
<summary>Click For Output!</summary>

````console
$ javac Main014.java
$ java Main014
0
3
2
1
final
$

````
</details>


## Main015

````java
public class Main015 {
        public static void main(String... args) {
                var x = new AutoCloseableImp015(1);
		x = new AutoCloseableImp015(4);

                try(x;
                        var y = new AutoCloseableImp015(2);
                        var z = new AutoCloseableImp015(3)) {

			System.out.println("0");
                } finally {
                        System.out.println("final");
                }
        }
}

class AutoCloseableImp015 implements AutoCloseable {
        private int value;

        AutoCloseableImp015(int value) {
                this.value = value;
        }

        public void close() {
                System.out.println(value);
        }
}

````
<details>
<summary>Click For Output!</summary>

````console
$ javac Main015.java
Main015.java:6: error: variable x used as a try-with-resources resource neither final nor effectively final
                try(x;
                    ^
1 error
$

````
</details>


## Main016

````java
public class Main016 {
	public static void main(String... args) {
		try {
			if (!"foo".equals("bar")) {
				new MyException016(); 
			}
		} catch (MyException016 | RuntimeException ex) {
			System.out.println("1");
		} catch (Exception ex) {
			System.out.println("2");
		} finally {
			System.out.println("3");
		}
	}
}

class MyException016 extends Exception { }

````
<details>
<summary>Click For Output!</summary>

````console
$ javac Main016.java
Main016.java:7: error: exception MyException016 is never thrown in body of corresponding try statement
		} catch (MyException016 | RuntimeException ex) {
		  ^
1 error
$

````
</details>


## Main017

````java
public class Main017 {
        public static void main(String... args) {
                try {
                        if (!"foo".equals("bar")) {
                                new MyException017();
                        }
                } catch (MyException017 ex) {
                        System.out.println("1");
                } catch (Exception ex) {
                        System.out.println("2");
                } finally {
                        System.out.println("3");
                }
        }
}

class MyException017 extends RuntimeException { }


````
<details>
<summary>Click For Output!</summary>

````console
$ javac Main017.java
$ java Main017
3
$

````
</details>


## Main018

````java
public class Main018 {
        public static void main(String... args) {
                try(var y = new AutoCloseableImp018(1)) {
			System.out.println("0");
			y.close();
                } finally {
                        System.out.println("final");
                }
        }
}

class AutoCloseableImp018 implements AutoCloseable {
        private int value;

        AutoCloseableImp018(int value) {
                this.value = value;
        }

        public void close() {
                System.out.println(value);
        }
}

````
<details>
<summary>Click For Output!</summary>

````console
$ javac Main018.java
$ java Main018
0
1
1
final
$

````
</details>


## Main019

````java
public class Main019 {
        public static void main(String... args) {
		var y = new AutoCloseableImp019(0);
                try(y) {
			System.out.println("1");
		} catch (Exception ex) {
			System.out.println("2");
                } finally {
                        System.out.println("3");
			y.close();
                }
        }
}

class AutoCloseableImp019 implements AutoCloseable {
        private int value;

        AutoCloseableImp019(int value) {
                this.value = value;
        }

        public void close() {
                System.out.println(value);
        }
}

````
<details>
<summary>Click For Output!</summary>

````console
$ java Main019
1
0
3
0
$ javac Main019.java
$

````
</details>


## Main020

````java
public class Main020 {
	public static void main(String... args) {
		System.out.println("How many exception is valid?");

		class Error extends Exception {};
		class _XD extends Exception {};
		class GenericException<Integer> extends Exception {};
		interface InterfaceException extends Exception {};
	}
}

````
<details>
<summary>Click For Output!</summary>

````console
$ javac Main020.java
Main020.java:7: error: a generic class may not extend java.lang.Throwable
		class GenericException<Integer> extends Exception {};
		                                        ^
Main020.java:8: error: interface not allowed here
		interface InterfaceException extends Exception {};
		^
Main020.java:8: error: interface expected here
		interface InterfaceException extends Exception {};
		                                     ^
3 errors
$

````
</details>


## Main021

````java
import java.util.Scanner;

public class Main021 {
	public static void main(String... args) {
		try (var s = new Scanner(System.in)) {
			print();
		}
	}

	public static void print() throws Exception {
		System.out.println("Printed!");
	}
}

````
<details>
<summary>Click For Output!</summary>

````console
$ javac Main021.java
Main021.java:6: error: unreported exception Exception; must be caught or declared to be thrown
			print();
			     ^
1 error
$

````
</details>


## Main022

````java
public class Main022 {
	public static void main(String... args) throws Exception {
		System.out.println("0");
		try {
			System.out.println("1");
			throw new Exception();
		} catch (Exception ex) {
			System.out.println("2");
			try {
				System.out.println("3");
				throw new Exception();
			} finally {
				System.out.println("4");
			}
		} finally {
			System.out.println("5");
		}
	}
}

````
<details>
<summary>Click For Output!</summary>

````console
$ java Main022
0
1
2
3
4
5
$ javac Main022.java
$

````
</details>


## Main023

````java
import java.io.IOException;

public class Main023 {
        public static void main(String... args) {
                try(var y = new AutoCloseableImp023(0)) {
			System.out.println("1");
		} finally {
                        System.out.println("2");
                }
        }
}

class AutoCloseableImp023 implements AutoCloseable {
        private int value;

        AutoCloseableImp023(int value) {
                this.value = value;
        }

        public void close() throws IOException {
                System.out.println(value);
        }
}

````
<details>
<summary>Click For Output!</summary>

````console
$ javac Main023.java
Main023.java:5: error: unreported exception IOException; must be caught or declared to be thrown
                try(var y = new AutoCloseableImp023(0)) {
                        ^
  exception thrown from implicit call to close() on resource variable 'y'
1 error
$

````
</details>


## Main024

````java
import java.io.IOException;

public class Main024 {
        public static void main(String... args) {
                try(var y = new AutoCloseableImp024(0)) {
			System.out.println("1");
		} catch(IOException exception) {
			System.out.println("2");
		} finally {
                        System.out.println("3");
                }
        }
}

class AutoCloseableImp024 implements AutoCloseable {
        private int value;

        AutoCloseableImp024(int value) {
                this.value = value;
        }

        public void close() throws IOException {
                System.out.println(value);
        }
}

````
<details>
<summary>Click For Output!</summary>

````console
$ javac Main024.java
$ java Main024
1
0
3
$

````
</details>


## Main025

````java
public class Main025 {
	public static void main(String... args) throws Exception {
		try {
			throw new Exception();
		} catch (Exception e) {
			try {
				throw new Exception(); 
			} catch (Exception e) {
				throw new Exception();
			}	
		} finally {
			System.out.println("Pls don't be mad at me");
		}
	}
}

````
<details>
<summary>Click For Output!</summary>

````console
$ javac Main025.java
Main025.java:8: error: variable e is already defined in method main(String...)
			} catch (Exception e) {
			                   ^
1 error
$

````
</details>


## Main026

````java
public class Main026 {
	public static void main(String... args) {
		System.out.println("What's gonna be output?");

		try {
			new Foo026().print();
		} catch (RuntimeException ex) {
			throw new RuntimeException("B");
		} finally {
			throw new RuntimeException("C");
		}
	}
}

class Foo026 {
	void print() throws RuntimeException {
		throw new RuntimeException("A");
	}
}

````
<details>
<summary>Click For Output!</summary>

````console
$ java Main026
What's gonna be output?
$ javac Main026.java
$

````
</details>


## Main027

````java
public class Main026 {
	public static void main(String... args) {
		System.out.println("What's gonna be output?");

		try {
			new Foo026().print();
		} catch (MyException ex) {
			throw new RuntimeException("B");
		} finally {
			throw new RuntimeException("C");
		}
	}
}

class Foo026 {
	void print() throws RuntimeException {
		throw new RuntimeException("A");
	}
}

class MyException extends Exception {}

````
<details>
<summary>Click For Output!</summary>

````console
$ javac Main027.java
Main027.java:1: error: class Main026 is public, should be declared in a file named Main026.java
public class Main026 {
       ^
1 error
$

````
</details>


## Main028

````java
public class Main028 {
	public static void main(String... args) {
		print();
	}

	public static void print() throws IllegalArgumentException {
		System.out.println("Printed!");
		throw new RuntimeException();
	}
}

````
<details>
<summary>Click For Output!</summary>

````console
$ javac Main028.java
$ java Main028
Printed!
$

````
</details>


## Main029

````java
import java.io.Closeable;
import java.sql.SQLException;

public class Main029 {
        public static void main(String... args) {
                try(var y = new AutoCloseableImp029()) {
			System.out.println("1");
		} catch (Exception ex) {
			System.out.println("2");
                } finally {
                        System.out.println("3");
                }
        }
}

class AutoCloseableImp029 implements Closeable {
        public void close() throws SQLException {
                System.out.println("Closed!");
        }
}

````
<details>
<summary>Click For Output!</summary>

````console
$ javac Main029.java
Main029.java:17: error: close() in AutoCloseableImp029 cannot implement close() in Closeable
        public void close() throws SQLException {
                    ^
  overridden method does not throw SQLException
1 error
$

````
</details>


## Main030

````java
import java.io.IOException;

public class Main030 {
	public static void main(String... args) {
		try {
			throw new MyException030(new IOException());
		} catch (RuntimeException ex) {
			System.out.println(ex.getCause());
		}
	}
}

class MyException030 extends RuntimeException {
	public MyException030(Exception ex) {
		super(ex);
	}
}

````
<details>
<summary>Click For Output!</summary>

````console
$ javac Main030.java
$ java Main030
java.io.IOException
$

````
</details>


## Main031

````java
import java.io.IOException;

public class Main031 {
	public static void main(String... args) throws Exception {
		try(var x = new AutoCloseableImp031()) {
			throw new RuntimeException();
		} catch (Throwable t) {
			System.out.println(t);
		}
	}
}

class AutoCloseableImp031 implements AutoCloseable {
        public void close() throws Exception {
                throw new IOException();
        }
}

````
<details>
<summary>Click For Output!</summary>

````console
$ java Main031
java.lang.RuntimeException
$ javac Main031.java
$

````
</details>



