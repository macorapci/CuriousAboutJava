public class Main023 {
	public static void main(String... args) {
		var one = new Generic023(new Foo023());
		var two = new Generic023(new Bar023());
		var three = new Generic023(new Boo023());
	}
}

class Foo023 {}
class Bar023 extends Foo023 {}
class Boo023 {}

class Generic023<GIT extends Foo023> {
	public GIT item;

	public Generic023(GIT item) {
		this.item = item;
	}
}
