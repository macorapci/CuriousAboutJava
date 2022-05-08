import java.io.IOException;

public class Main030 {
	public static void main(String... args) {
		try {
			throw new MyException030(new IOException());
		} catch (RuntimeException ex) {
			System.out.println(ex.getCause());
		}
	}
}

class MyException030 extends RuntimeException {
	public MyException030(Exception ex) {
		super(ex);
	}
}
