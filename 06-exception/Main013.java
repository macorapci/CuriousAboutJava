public class Main013 {
	public static void main(String... args) {
		var x = new AutoCloseableImp013(1);

		try(x;
			var y = new AutoCloseableImp013(2);
			var z = new AutoCloseableImp013(3)) {
			
		} finally {
			System.out.println("final");
		}
	}
}

class AutoCloseableImp013 implements AutoCloseable {
	private int value;

	AutoCloseableImp013(int value) {
		this.value = value; 
	}

	public void close() throws Exception {
		System.out.println(value);
	}
}
