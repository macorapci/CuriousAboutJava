public class Main3 {
	public static void main(String... args){
		Main3 main = new Main3();
		System.out.println(main.bar(1));
		System.out.println(main.bar(new Integer(1)));
		System.out.println(main.bar(1L));
		System.out.println(main.bar("bar"));
	}

	public int bar(int number) {
		return 0;
	}

	public int bar(Object obj) {
		return 1;
	}
}
