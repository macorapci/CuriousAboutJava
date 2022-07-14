import java.util.stream.*;

public class Main033 {
	public static void main(String... args) {
		Stream.of("AAA", "BBB", "CCC")
			.map(s -> s.length())
			.forEach(System.out::println);
	}
}
