import java.io.IOException;

public class Main023 {
        public static void main(String... args) {
                try(var y = new AutoCloseableImp023(0)) {
			System.out.println("1");
		} finally {
                        System.out.println("2");
                }
        }
}

class AutoCloseableImp023 implements AutoCloseable {
        private int value;

        AutoCloseableImp023(int value) {
                this.value = value;
        }

        public void close() throws IOException {
                System.out.println(value);
        }
}
