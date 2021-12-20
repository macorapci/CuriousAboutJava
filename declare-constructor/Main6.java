public class Main6 {
	public static void main(String... args) {
		B6 b = new B6();
	}
}


class A6 {
	static {
		System.out.println("A");
	}

	{
		System.out.println("B");
	}

	public A6() {
		System.out.println("C");
	}

	public A6(int a) {
		System.out.println("D");
	}
}


class B6 extends A6 {
	static {System.out.println("E");}
	{System.out.println("F");}

	public B6() {
		super(1);
		System.out.println("G");
	}
}


class C6 extends B6 {
	static {System.out.println("H");}
        {System.out.println("I");}

        public C6() {
                System.out.println("J");
        }

}
