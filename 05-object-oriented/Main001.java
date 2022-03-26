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
