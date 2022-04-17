public class Main037 {
	public static void main(String ... args) {
		Foo037.Bar037.Car037 value = new Foo037().new Bar037().new Car037();
		value.printValues(30);
	}
}

class Foo037 {
	private int level = 1;

	class Bar037 {
		private int level = 2;

		class Car037 {
			private int level = 3;

			public void printValues(int level) {
				System.out.println(level);
				System.out.println(Foo037.Bar037.this.level);
				System.out.println(Bar037.this.level);
			}
		}
	}
}
