import java.util.*;

public class Main053 {
	public static void main(String... args) {
		var set = new TreeSet<String>();
		set.add("A");
		set.add("a");
		set.add("a");
		
		System.out.println(set.iterator().next());
	}
}
