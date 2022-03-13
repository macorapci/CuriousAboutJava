public class Main03 {
	public static void main(String... args) {
		C03 c = new C03();
	}
}


class A03 {
	public A03() {
		System.out.print("A-");
	}
}


class B03 extends A03 {
	public B03(int deneme) {
		System.out.print("B-");
	}	
}

class C03 extends B03 {
	public C03() {
		super(1);
		System.out.print("C-");
	}
}
