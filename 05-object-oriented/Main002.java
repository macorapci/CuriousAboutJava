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
