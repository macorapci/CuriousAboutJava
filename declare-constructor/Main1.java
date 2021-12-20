public class Main1 {
	public static void main(String... args) {
		C1 c = new C1();
	}
}


class A1 {
	public A1() {
		System.out.print("A-");
	}
}


class B1 extends A1 {
	public B1(int deneme) {
		System.out.print("B-");
	}	
}

class C1 extends B1 {
	public C1() {
		System.out.print("C-");
	}
}
