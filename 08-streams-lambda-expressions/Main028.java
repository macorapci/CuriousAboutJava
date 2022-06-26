import java.util.stream.*;

public class Main028 {
	public static void main(String... args) {
		var s = Stream.iterate(1, i -> i + 1);
		var a = s.anyMatch(i -> i > 5);
		System.out.println(a);
	
		s = Stream.iterate(1, i -> i + 1);	
		var b = s.peek(System.out::println)
			.allMatch(i -> i > 5);
                System.out.println(b);

		s = Stream.iterate(1, i -> i + 1);
		var c = s.peek(System.out::println)
			.noneMatch(i -> i > 5);
                System.out.println(c);
	}
}
