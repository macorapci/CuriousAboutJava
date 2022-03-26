public class Main009 {
	public void print(int number) {
		System.out.println("1" + number.toString());
	}

	public void print(Integer number) {
		System.out.println("2" + number.toString());
	}

	public void print(Object number) {
		System.out.println("3" + number.toString());
	}

	public static void main(String... aaaaaaaa) {
		print((short)1);
	}
}
