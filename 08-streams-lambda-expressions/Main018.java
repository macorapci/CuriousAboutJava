import java.util.stream.*;

public class Main018 {
	public static void main(String... args) {
		for (var k = 0; k < 10; k++) {
			var findAny = DoubleStream.iterate(0.0, x -> x + 1)
                        .limit(1000)
                        .parallel()
                        .findAny();

	                System.out.println("findAny: " + findAny.getAsDouble());

		}
		
		for (var k = 0; k < 10; k++) {
                        var findFirst = DoubleStream.iterate(0.0, x -> x + 1)
                        .limit(1000)
                        .parallel()
                        .findFirst();

                        System.out.println("findFirst: " + findFirst.getAsDouble());
                }
	}
}
