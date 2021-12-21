public class Main1 {
	public static void main(String... args){
		Main1 main = new Main1();
		main.strings("1", "2", "3");
	}

	public void strings(String... foo) {
		System.out.println("A");
	}

	public void strings(String[] foo) {
		System.out.println("B");
	}
}
