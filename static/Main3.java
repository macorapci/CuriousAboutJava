public class Main3 {
	public static void main(String... args) {
		Mehmet mehmet = new Mehmet();
		System.out.println(mehmet.value);
		
		Mehmet mehmet2 = new Mehmet();
		mehmet2.value++;

		System.out.println(mehmet.value);
	}

}

class Mehmet {
	public static int value;
}
