public class Main02 {
	public static void main(String... args){
		Main02 main = new Main02();
		System.out.println(main.bar(1));
		System.out.println(main.bar(new Integer(1)));
		System.out.println(main.bar(null));
	}

	public int bar(int number) {
		return 0;
	}

	public int bar(Integer number) {
		return 1;
	}
}
