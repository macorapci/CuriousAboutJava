import java.util.*;

public class Main006 {
	public static void main(String... args) {
		Comparator<String> comp = (s1, s2) -> 007;
		System.out.println(comp.compare("100", "200"));
		System.out.println(comp.compare("AAb", "AAA"));
	}
}
