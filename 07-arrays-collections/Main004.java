public class Main004 {
	public static void main(String... args) {
		var foo = new Generic004<String>("Hello");
		System.out.println(foo.getItem());
	}
}

class Generic004<Generic004> {
	private Generic004 item;

	Generic004(Generic004 item) {
		this.item = item;
	}

	public Generic004 getItem() {
		return item;
	}
}	
