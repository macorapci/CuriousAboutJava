public class Main035 {
	public static void main(String... args) {
		var value = Animal035.CAT.makeSound();
		System.out.println(value);
	}
}

enum Animal035 {
	CAT {
		public String makeSound() {
			return "MEOW!";
		}
	},
	DOG {
		public String makeSound() {
			return "WOOF!";
		}
	};

	public abstract String makeSound();
}
