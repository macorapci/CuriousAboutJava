import java.util.ArrayDeque;

public class Main009 {
	public static void main(String... args) {
		var foo = new ArrayDeque<String>();

		foo.push("0");

		foo.offer("10");
		foo.offer("11");

		foo.push("20");
		foo.push("21");

		System.out.println(foo);
	}
}
