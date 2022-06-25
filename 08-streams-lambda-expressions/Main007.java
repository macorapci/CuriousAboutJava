import java.util.*;
import java.util.function.*;

public class Main007 {
	public static void main(String... args) {
		ToIntFunction<Integer> toInt = x -> x * 2;
		var foo = List.of(0, 1, 2, 3)
			.stream()
			.mapToInt(toInt)
			.sum();
	
		System.out.println(foo);
	}
}
