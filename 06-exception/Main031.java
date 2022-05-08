import java.io.IOException;

public class Main031 {
	public static void main(String... args) throws Exception {
		try(var x = new AutoCloseableImp031()) {
			throw new RuntimeException();
		} catch (Throwable t) {
			System.out.println(t);
		}
	}
}

class AutoCloseableImp031 implements AutoCloseable {
        public void close() throws Exception {
                throw new IOException();
        }
}
