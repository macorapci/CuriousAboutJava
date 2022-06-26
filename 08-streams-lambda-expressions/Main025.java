import java.util.function.*;
import java.util.stream.*;

public class Main025 {
        public static void main(String... args) {
        	var ints = IntStream.of(6, 10);
		var longs = ints.mapToLong(x -> x);
		var first = longs.average().getAsDouble();

		var moreLongs = LongStream.of(6, 10);
		var stats = moreLongs.summaryStatistics();
		var second = stats.getAverage();

		System.out.println(first + ", " + second);
	}
}
