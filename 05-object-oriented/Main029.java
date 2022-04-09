public class Main029 {
	public static void main(String... args) {
		var impl = new Impl029();
		impl.getParent();
	}
}

interface Service029 {
	Parent029 getParent();
}

class Parent029 {}

class Child029 extends Parent029 {}

class Impl029 implements Service029 {
	public Parent029 getParent() {
		return new Child029();
	}
}
