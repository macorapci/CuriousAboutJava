import java.util.*;

public class Main019 {
	public static void main(String... args) {
		var set = new TreeSet<Integer>();
		set.add(10);
		set.add(2);
		set.add(30);
		set.add(30);
		set.add(-5);

		System.out.println(set.size());
		System.out.println(set.iterator().next());
		System.out.println(set.iterator().next());
	}
}
