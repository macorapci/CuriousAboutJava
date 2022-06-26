import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main019 {
	public static void main(String... args) {
		List<String> g = Arrays.asList("AAA", "BBB", "CCC", "AAA");
 
        	Map<String, Long> result= g.stream().collect(
                	Collectors.groupingBy(
                    		Function.identity(),
                    		Collectors.counting())
		);
 
        	System.out.println(result);
	}
}
