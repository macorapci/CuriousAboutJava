public class Main04 {
	public static void main(String... args) {
		Anil04 anil = new Anil04();
		System.out.println(anil.value);
		
		anil = null;
		
		System.out.println(anil.value);
	}

}

class Anil04 {
	public static int value;
}
