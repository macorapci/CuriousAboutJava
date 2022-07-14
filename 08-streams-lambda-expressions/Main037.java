import java.util.stream.*;

public class Main037 {
	public static void main(String... args) {
		var value = IntStream.of(0, 1, 2, 3, 4, 5)
			.reduce(-5, (before, after) -> {
				System.out.println(before + ", " + after);
				return before + after;	
			});

		System.out.println("value: " + value);
	}
}
