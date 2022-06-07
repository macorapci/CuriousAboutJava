import java.util.*;

public class Main046 {
	public static void main(String... args) {
		List<Character> foo = new ArrayList<>();
		foo.add('a');
		foo.add('b');
		foo.add('c');

		foo.clear();
		foo.remove(0);

		System.out.println(foo.isEmpty());	
		System.out.println(foo.length());
	}
}
