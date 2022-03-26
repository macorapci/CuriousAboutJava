public class Main014 {
	public static void main(String... s) {
		var child = new Child014();
		System.out.println(child.getNumber());
	}
}

class Parent014 {
	private int number = 10;
}

class Child014 extends Parent014 {
	public int getNumber() {
		return super.number;
	}
}
