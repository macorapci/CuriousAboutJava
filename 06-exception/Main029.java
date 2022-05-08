import java.io.Closeable;
import java.sql.SQLException;

public class Main029 {
        public static void main(String... args) {
                try(var y = new AutoCloseableImp029()) {
			System.out.println("1");
		} catch (Exception ex) {
			System.out.println("2");
                } finally {
                        System.out.println("3");
                }
        }
}

class AutoCloseableImp029 implements Closeable {
        public void close() throws SQLException {
                System.out.println("Closed!");
        }
}
