public class Main044 {
	public static void main(String... args) {
		var one = new Wrapper<Foo044>();
		var two = new Wrapper<Bar044>();
		var three = new Wrapper<Boo044>();	
	}
}

class Foo044 {}
class Bar044 extends Foo044 {}
class Boo044 {}
class Wrapper<? extends Foo044> {}
