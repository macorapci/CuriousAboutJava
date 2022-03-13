public class Main01 {
	public static void main(String... args) {
		C01 c = new C01();
	}
}


class A01 {
	public A01() {
		System.out.print("A-");
	}
}


class B01 extends A01 {
	public B01(int deneme) {
		System.out.print("B-");
	}	
}

class C01 extends B01 {
	public C01() {
		System.out.print("C-");
	}
}
