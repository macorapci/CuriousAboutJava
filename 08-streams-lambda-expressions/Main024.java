import java.util.function.*;

public class Main024 {
        public static void main(String... args) {
                var list = new ArrayList<>();
		list.add("AAA");
		list.add("BBB");
		list.add("CCC");

		list.stream()
			.filter(String::isNotEmpty)
			.forEach(System.out::println);
        }
}
