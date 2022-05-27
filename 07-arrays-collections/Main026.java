import java.util.*;

public class Main026 {
	public static void main(String... args) {
		String[] array = {"A", "B"};
		var foo = Arrays.asList(array);
		var bar = Arrays.asList("A, B");

		System.out.println(foo.size() + "," + bar.size());
	}
}
