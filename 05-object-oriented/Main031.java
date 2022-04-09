public class Main031 {
	public static void main(String... args) {
		System.out.println(new Foo031(30).bar);
	}
}

class Foo031 {
	public static int bar = 10;
	
	public void Foo031(int bar) {
		this.bar = bar;
	}
}

