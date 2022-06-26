import java.util.function.*;

public class Main021 {
	public static void main(String... args) {
		IntUnaryOperator add = a -> a + 1;
		System.out.println(add.applyAsInt(10));
	}
}
