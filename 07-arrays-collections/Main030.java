import java.util.*;

public class Main030 {
	public static void main(String... args) {
		var setOf = Set.of("AA", "BB", "CC");
		var setCopyOf = Set.copyOf(setOf);
		System.out.println(setCopyOf);
	}
}


