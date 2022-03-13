public class Main02 {
	public static void main(String... args) {
		C02 c = new C02();
	}
}


class A02 {
	public A02() {
		System.out.print("A-");
	}
}


class B02 extends A02 {
	public B02(int deneme) {
		System.out.print("B-");
	}	
}

class C02 extends B02 {
	public C02() {
		System.out.print("C-");
		super(1);
	}
}
