import java.util.function.*;

public class Main022 {
	public static void main(String... args) { 
		Predicate foo = s -> s.startsWith("-");
		System.out.println(foo.test("I-Am-The-One"));
	}
}
