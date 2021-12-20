public class Main3 {
	public static void main(String... args) {
		C3 c = new C3();
	}
}


class A3 {
	public A3() {
		System.out.print("A-");
	}
}


class B3 extends A3 {
	public B3(int deneme) {
		System.out.print("B-");
	}	
}

class C3 extends B3 {
	public C3() {
		super(1);
		System.out.print("C-");
	}
}
