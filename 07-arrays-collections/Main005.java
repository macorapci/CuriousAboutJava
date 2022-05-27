import java.util.ArrayList;
import java.util.List;

public class Main005 {
	public static void main(String... args) {
		List<String> foo = new ArrayList<?>();
		foo.add("String");
		foo.add(null);

		System.out.println(foo.size());
	}
}
