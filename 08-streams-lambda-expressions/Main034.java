import java.util.*;


public class Main034 {
	public static void main(String... args) {
		var one = List.of(1, 2, 3)
			.stream()
			.reduce(1, (a, b) -> a+b, (a, b) -> a+b);

		var two = List.of(1, 2, 3)
			.stream()
			.reduce(1, (a,b) -> a+b);

		System.out.println(one + ", " + two);

		var three = List.of(1, 2, 3)
                        .parallelStream()
                        .reduce(1, (a, b) -> a+b, (a, b) -> a+b);

                var four = List.of(1, 2, 3)
                        .parallelStream()
                        .reduce(1, (a,b) -> a+b);

		System.out.println(three + ", " + four);
	}
}
