public class Main017 {
	public static void main(String... args) {
		var impl = new Impl017();
        	System.out.println(impl.getValue(20));
	}
}

interface FuncInterfaceOne017 {
	public default int getValue() {
		return 10;
	}
}

interface FuncInterfaceTwo017 {
	public default int getValue() {
		return 20;
	}
}

class Impl017 implements FuncInterfaceOne017, FuncInterfaceTwo017 {
	public int getValue(int value) {
		return value;
	}
}
