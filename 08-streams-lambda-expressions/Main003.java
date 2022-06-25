import java.util.*;

public class Main003 {
	public static void main(String... args) {
		List.of(0, 1, 2, 3, 4).stream()
			.forEach(System.out::println);

		List.of(10, 11, 12, 13, 14).parallelStream()
			.forEach(System.out::println);

		List.of(20, 21, 22, 23, 24).parallelStream()
                        .forEachOrdered(System.out::println);
	}
}
