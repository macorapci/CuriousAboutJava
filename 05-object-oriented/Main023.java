public class Main023 {
	public static void main(String... args) {
		Parent023 parent = new Child023();
		var child = new Child023();
		Parent023 anotherParent = child;
		
		System.out.println(parent.type + ", " + child.type + ", " + anotherParent.type);
	}
}

class Parent023 {
	public String type = "Parent";
}

class Child023 extends Parent023 {
	public String type = "Child";
}
