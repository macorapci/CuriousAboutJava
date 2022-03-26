public class Main024 {
	public static void main(String... args) {
		new Parent024().run();
	}
}

class Parent024 {
	public Parent024() {
		System.out.println("a");
	}

	public void Parent024() {
		System.out.println("b");
	}

	public void run() {
		new Parent024();
		Parent024();
	}
}
