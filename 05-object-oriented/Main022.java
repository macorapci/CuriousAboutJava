public class Main022 {
	public static void main(String... args) {
		var impl = new Impl022();
		System.out.println(impl.getValue());
	}
}


interface Interface022 {
	protected abstract int getValue();
}

class Impl022 implements Interface022 {
	public int getValue() {
		return 20;
	}
}
