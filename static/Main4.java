public class Main4 {
	public static void main(String... args) {
		Anil anil = new Anil();
		System.out.println(anil.value);
		
		anil = null;
		
		System.out.println(anil.value);
	}

}

class Anil {
	public static int value;
}
