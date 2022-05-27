import java.util.ArrayDeque;

public class Main011 {
	public static void main(String... args) {
		var foo = new ArrayDeque<String>();

		foo.offer("10");
		foo.offer("11");

		foo.push("20");
		foo.push("21");

		System.out.println(foo.getLast());
		System.out.println(foo.size());
	}
}
