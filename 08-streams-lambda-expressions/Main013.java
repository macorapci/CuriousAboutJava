import java.util.function.*;

public class Main013 {
	public static void main(String... args) {
		ToDoubleBiFunction<Integer, Double> func = (Integer a, Double b) -> {
			int c;
			return b;
		};


		System.out.println(func.applyAsDouble(10, 20.0));
		System.out.println(func.applyAsDouble(10, null));
	}
}
