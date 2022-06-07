import java.util.*;

public class Main042 {
	public static void main(String... args) {
		var foo = List.of("AA", "BBB", "CC", "DDDD");
		Collections.sort(foo, Comparator.comparing(String::length));
		System.out.println(foo.get(0));
	}
}
