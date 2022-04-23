public class Main045 {
	public static void main(String... args) {
		class Foo045 {
			public int foo = 10;
		}

		class Bar045 extends Foo045{
			public int bar = 20;
		}

		System.out.println(new Bar045().foo);
	}
}
