public class Main061 {
	public static void main(String... values) {
		Foo061.ONE.print();
	}
}

enum Foo061 {
	ONE(1) {
		public void print() {
			System.out.println("ONE");
		}	
	},
	TWO(2) {
		public void print() {
                        System.out.println("TWO");
                }
	},
	THREE(3) {
		public void print() {
                        System.out.println("THREE");
                }
	};

	public int value;

	Foo061(int value) {
		this.value = value;
	}

	public int getValue() {
		return this.value;
	}

	protected abstract void print();
}
