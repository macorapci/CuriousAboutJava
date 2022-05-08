import java.io.IOException;

public class Main024 {
        public static void main(String... args) {
                try(var y = new AutoCloseableImp024(0)) {
			System.out.println("1");
		} catch(IOException exception) {
			System.out.println("2");
		} finally {
                        System.out.println("3");
                }
        }
}

class AutoCloseableImp024 implements AutoCloseable {
        private int value;

        AutoCloseableImp024(int value) {
                this.value = value;
        }

        public void close() throws IOException {
                System.out.println(value);
        }
}
