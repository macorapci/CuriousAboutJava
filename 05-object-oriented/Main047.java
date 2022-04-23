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
