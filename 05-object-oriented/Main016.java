public class Main016 {
	public static void main(String... args) {
		var child = new Child016();
		System.out.println(child.getValue());
	}
}

class Parent016 {
	public int value = 20;
}

class Child016 extends Parent016 {
	public int getValue() {
		return this.value;
	}
}
