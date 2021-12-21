public class Main6 {
	public static void main(String... args){
		Main6 main = new Main6();
		String[] arr = {"aa", "bb", "cc"};
		System.out.println(main.bar(arr));
	}

	public int bar(String[] strings) {
		return 0;
	}

	public int bar(Integer[] numbers) {
		return 1;
	}
}
