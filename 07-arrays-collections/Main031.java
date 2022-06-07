import java.util.*;

public class Main031 {
	public static void main(String... args) {
		var os = new String[] {"DD", "BB", "CC"};
		Arrays.sort(os);

		System.out.println(Arrays.binarySearch(os, "FF"));
		System.out.println(Arrays.binarySearch(os, "BB"));
	}
}
