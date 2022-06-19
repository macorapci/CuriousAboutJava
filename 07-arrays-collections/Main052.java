public class Main052 {
	public static void main(String... args) {
		char[] foo[] = new char[3][3];
		foo[1][3] = 'A';
		foo[2][2] = 'B';
		foo[3][1] = 'C';

		System.out.println(foo.length);
	}
}
