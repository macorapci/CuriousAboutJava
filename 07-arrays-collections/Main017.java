import java.util.*;

public class Main017 {
	public static void main(String... args) {
		String[] array = {"C", "F", "A"};
		var theChoosenOne = array[0];
		
		Arrays.sort(array);
		
		// Arrays.binarySearch(array, element). Searchs for element in array. If finds returns its index. Otherwise returns -1. 
		var result = Arrays.binarySearch(array, theChoosenOne);
		
		System.out.println(result);
	}
}
