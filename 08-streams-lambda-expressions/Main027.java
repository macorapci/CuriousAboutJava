import java.util.stream.*;
import java.util.function.*;

public class Main027 {
	public static void main(String... args) {
		var s = Stream.of("AAA", "BBBB", "CCC", "D", "EEEE");
		var map = s.collect(Collectors.toMap(String::length, k -> " !" + k, (a, b) -> a + " * " + b));
		System.out.println(map);
	}
}
