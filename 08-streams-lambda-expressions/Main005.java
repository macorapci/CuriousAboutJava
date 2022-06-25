import java.util.function.UnaryOperator;

public class Main005 {
	public static void main(String... args) {
		// UnaryOperator<T> extends Function<T, T>
		UnaryOperator<Double> operator = x -> x * 2;
		System.out.println(operator.apply(3.0));
	}
}
