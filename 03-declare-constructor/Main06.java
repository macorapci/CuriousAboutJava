public class Main06 {
	public static void main(String... args) {
		B06 b = new B06();
	}
}


class A06 {
	static {
		System.out.println("A");
	}

	{
		System.out.println("B");
	}

	public A06() {
		System.out.println("C");
	}

	public A06(int a) {
		System.out.println("D");
	}
}


class B06 extends A06 {
	static {System.out.println("E");}
	{System.out.println("F");}

	public B06() {
		super(1);
		System.out.println("G");
	}
}


class C06 extends B06 {
	static {System.out.println("H");}
        {System.out.println("I");}

        public C06() {
                System.out.println("J");
        }

}
