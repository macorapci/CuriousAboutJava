public class Main011 {
	public static void main(String... args) {
		System.out.println("Compiled!");
	}
}

class MyException011 extends Exception {
	public MyException011() {
		super("This is my exception!");
	}

	public MyException011(String msg) {
		super(new MyException011());
	}

	public MyException011(Exception ex) {

	}
}
