import java.util.stream.*;

public class Main009 {
	public static void main(String... args) {
		Stream<Integer> stream = Stream.of(0, 1, 2, 3, 4);

		System.out.println(stream.min().get());
	}
}
