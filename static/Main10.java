public class Main10 {
	public static void main(String[] args) {
		System.out.println(Mehmet10.value);

		Mehmet10 anil = new Mehmet10();
		System.out.println(anil.value);

		anil = null;
		System.out.println(anil.value);
	}
}

class Mehmet10 {
	static int value = 10;

	static {
		value = 20;
	}

	Mehmet10() {
		value = 30;
	}
}
