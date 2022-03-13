public class Main03 {
	public static void main(String... args) {
		Mehmet03 mehmet = new Mehmet03();
		System.out.println(mehmet.value);
		
		Mehmet03 mehmet2 = new Mehmet03();
		mehmet2.value++;

		System.out.println(mehmet.value);
	}

}

class Mehmet03 {
	public static int value;
}
