public class Main014 {
        public static void main(String... args) {
                var x = new AutoCloseableImp014(1);

                try(x;
                        var y = new AutoCloseableImp014(2);
                        var z = new AutoCloseableImp014(3)) {

			System.out.println("0");
                } finally {
                        System.out.println("final");
                }
        }
}

class AutoCloseableImp014 implements AutoCloseable {
        private int value;

        AutoCloseableImp014(int value) {
                this.value = value;
        }

        public void close() {
                System.out.println(value);
        }
}
