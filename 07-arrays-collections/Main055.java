import java.util.*;

public class Main055 {
	public static void main(String... args) {
		var numbers = Arrays.asList(1, null, 3);
		int one = numbers.get(1);
		int last = numbers.get(3);
		System.out.println(one + ", " + last);
	}
}
