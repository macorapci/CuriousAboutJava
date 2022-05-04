public class Main062 {
	public static void main(String... values) {
		Foo062.ONE.print();
	}
}

enum Foo062 {
	ONE(1) {
		public void print() {
			System.out.println("ONE");
		}	
	},
	TWO(2) {
		protected void print() {
                        System.out.println("TWO");
                }
	},
	THREE(3) {
		void print() {
                        System.out.println("THREE");
                }
	},
	FOUR(4) {
                private void print() {
                        System.out.println("FOUR");
                }
        };

	public int value;

	Foo062(int value) {
		this.value = value;
	}

	public int getValue() {
		return this.value;
	}

	protected abstract void print();
}
