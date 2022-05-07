public class Main019 {
        public static void main(String... args) {
		var y = new AutoCloseableImp019(0);
                try(y) {
			System.out.println("1");
		} catch (Exception ex) {
			System.out.println("2");
                } finally {
                        System.out.println("3");
			y.close();
                }
        }
}

class AutoCloseableImp019 implements AutoCloseable {
        private int value;

        AutoCloseableImp019(int value) {
                this.value = value;
        }

        public void close() {
                System.out.println(value);
        }
}
