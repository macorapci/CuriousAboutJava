public class Main015 {
        public static void main(String... args) {
                var x = new AutoCloseableImp015(1);
		x = new AutoCloseableImp015(4);

                try(x;
                        var y = new AutoCloseableImp015(2);
                        var z = new AutoCloseableImp015(3)) {

			System.out.println("0");
                } finally {
                        System.out.println("final");
                }
        }
}

class AutoCloseableImp015 implements AutoCloseable {
        private int value;

        AutoCloseableImp015(int value) {
                this.value = value;
        }

        public void close() {
                System.out.println(value);
        }
}
