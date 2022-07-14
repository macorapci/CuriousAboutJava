import java.util.stream.*;
import java.util.*;

public class Main035 {
	public static void main(String... args) {
		Stream<Integer> s = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
  
        	Map<Boolean, List<Integer> > map = s.collect(
                	Collectors.partitioningBy(num -> num > 3));
  
        	System.out.println(map);
	}
}
