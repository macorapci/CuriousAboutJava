import java.util.stream.*;

public class Main010 {
	public static void main(String... args) {
		var stream = IntStream.of(0, 1, 2, 3, 4);

		System.out.println(stream.min().get());
	}
}
