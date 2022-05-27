import java.util.*;

public class Main025 {
	/* static int 
	 * mismatch(Object[] a, Object[] b)
	 * Finds and returns the index of the first mismatch between two Object arrays, otherwise return -1 if no mismatch is found.
	 */
	public static void main(String... args) {
		var arrayA = new String[] {"A", "B", "C"};
		var arrayB = new String[] {"A", "C", "D"};

		var searchA = Arrays.binarySearch(arrayA, "A");
		var searchD = Arrays.binarySearch(arrayA, "D");

		System.out.println("searchA= " + searchA);
		System.out.println("searchD= " + searchD);

		var mismatchSameArray = Arrays.mismatch(arrayA, arrayA);
		var mismatch = Arrays.mismatch(arrayA, arrayB);
 
		var arrayC = new String[] {"A", "B", "C", "D", "E", "F"};
		var mismatchLongArray = Arrays.mismatch(arrayA, arrayC);

		System.out.println("mismatchSameArray= " + mismatchSameArray);
		System.out.println("mismatch= " + mismatch);
		System.out.println("mismatchLongArray= " + mismatchLongArray);

	}
}
