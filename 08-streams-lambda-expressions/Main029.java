import java.util.*;
  
public class Main029 {
        public static void main(String... args) {
        	List.of(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
			.parallelStream()
			.parallel()
			.parallel()
			.parallel()
			.forEach(System.out::println);
        }
}
