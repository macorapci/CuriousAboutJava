public class Main003 {
	public static void main(String... args) {
		var foo = new Generic003<String>("Hello");
		System.out.println(foo.getItem());
	}
}

class Generic003<Bar> {
	private Bar item;

	Generic003(Bar item) {
		this.item = item;
	}

	public Bar getItem() {
		return item;
	}
}	
