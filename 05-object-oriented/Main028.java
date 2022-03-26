public class Main028 {
	public static void main(String... args) {
		var impl = new Impl028();
		impl.getParent();
	}
}

interface Service028 {
	Parent028 getParent();
}

class Parent028 {}

class Child028 extends Parent028 {}

abstract class Impl028 implements Service028 {
	public Parent028 getParent() {
		return new Child028();
	}
}
