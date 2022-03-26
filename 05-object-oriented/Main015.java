public class Main015 {
	public static void main() {
		Parent parent = new Parent();
		parent.print();
	}
}


class Parent extends Child {
	public static void print() {
		System.out.println(super.getNumber());
	}
}

class Child {
	public static int getNumber() {
		return 10;
	}
}
