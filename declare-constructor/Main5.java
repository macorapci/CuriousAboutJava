public class Main5 {
	private int value1;
	private static int value2;
	{System.out.println(value1);}
	{value2 = 10; System.out.println(value2);}
	static {
		value2= 20; System.out.println(value2);
	}

	public Main5() {
		value2 = 30;
                System.out.println(value2);
	}

	public static void main(String... args) {
		Main5 main = new Main5();
	}
}
