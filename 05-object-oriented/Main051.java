public class Main051 {
	public static void main(String... args) {
		var foo = new Foo051();
		foo.bar();
		foo.bar();
		foo.bar();
		System.out.println(foo.value);
	}
}

class Foo051 {
	static int value = 5;
	
	public boolean bar() {
		if (value < 4) {
			value--;
			return false;
		} else if (value >= 4) {
			value++;
			return true;
		}
	}
}
