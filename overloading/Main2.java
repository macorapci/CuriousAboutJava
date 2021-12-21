public class Main2 {
	public static void main(String... args){
		Main2 main = new Main2();
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
