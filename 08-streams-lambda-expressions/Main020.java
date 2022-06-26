import java.util.*;
import java.util.stream.*;

public class Main020 {
	public static void main(String... args) {
		var list = new LinkedList<>();
		list.add("AAA");
		list.add("BBB");

		Stream s = list.stream();
		s.forEach(System.out::println);
		s.forEach(System.out::println);
	}
}
