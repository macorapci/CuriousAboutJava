public class Main7 {
	public static void main(String... args){
		Main7 main = new Main7();
		String[] arr = {"aa", "bb", "cc"};
		System.out.println(main.bar(arr));
	}

	public int bar(String... strings) {
		return 0;
	}

	public int bar(Object obj) {
		return 1;
	}
}
