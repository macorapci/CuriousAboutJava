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
