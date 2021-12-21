public class Main5 {
	public static void main(String... args){
		Main5 main = new Main5();
		String[] arr = ["aa", "bb", "cc"];
		System.out.println(main.bar(arr));
	}

	public int bar(String[] strings) {
		return 0;
	}

	public int bar(Integer[] numbers) {
		return 1;
	}
}
