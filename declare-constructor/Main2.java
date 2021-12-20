public class Main2 {
	public static void main(String... args) {
		C2 c = new C2();
	}
}


class A2 {
	public A2() {
		System.out.print("A-");
	}
}


class B2 extends A2 {
	public B2(int deneme) {
		System.out.print("B-");
	}	
}

class C2 extends B2 {
	public C2() {
		System.out.print("C-");
		super(1);
	}
}
