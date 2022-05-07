public class Main018 {
        public static void main(String... args) {
                try(var y = new AutoCloseableImp018(1)) {
			System.out.println("0");
			y.close();
                } finally {
                        System.out.println("final");
                }
        }
}

class AutoCloseableImp018 implements AutoCloseable {
        private int value;

        AutoCloseableImp018(int value) {
                this.value = value;
        }

        public void close() {
                System.out.println(value);
        }
}
