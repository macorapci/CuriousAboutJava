public class Main01 {
	public static void main(String... args){
		Main01 main = new Main01();
		main.strings("1", "2", "3");
	}

	public void strings(String... foo) {
		System.out.println("A");
	}

	public void strings(String[] foo) {
		System.out.println("B");
	}
}
