import java.util.*;

public class Main056 {
	public static void main(String... args) {
		var list = Arrays.asList("AAA", "aAA", "bbb", "BBB", "bB");
		Collections.sort(list, getComparator());
		System.out.println(list.get(0));
	}

	public static Comparator getComparator() {
		return Comparator.comparing(String::length)
			.thenComparing(s -> s.charAt(0))
			.reversed();
	}
}
