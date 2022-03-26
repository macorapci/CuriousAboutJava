public class Main027 {
	public static void main(String... args){
		System.out.println(new Parent027().getValue());
	}
}

class Parent027 {
	private boolean booleanValue;
	private int intValue = 0;

	public Parent027() {
		this(20);
		booleanValue = true;
	}

	public Parent027(int value) {
		this.intValue = booleanValue ? value : value + 1;
	}

	public int getValue() {
		return this.intValue;
	}
}


