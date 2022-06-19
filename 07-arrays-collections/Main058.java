import java.util.*;

public class Main058 {
	public static void main(String... args) {
		Set<String> set = new HashSet<>();
		set.add("AA");
		set.add("B");
		set.add("CC");
		set.add("D");

		for(String value: set)
			if (value.length() > 1)
				set.remove(value);
		System.out.println(set);
	}
}
