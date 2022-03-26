public class Main005 {
	public static void main(String[] yes) {
		var cat = new Cat005();
		cat.new Tiger005();
	}
}

class Cat005 {
	class Tiger005 extends Cat005 {}

	public void roar() {
		System.out.println("Meow!");
	}
}
