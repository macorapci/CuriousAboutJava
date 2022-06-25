import java.util.stream.*;

public class Main015 {
	public static void main(String... args) {
		DoubleStream stream = DoubleStream.iterate(1.0, x -> x + 1)
			.limit(10);
	
		System.out.println(stream.average());
		System.out.println(stream.count());
		System.out.println(stream.max());
		System.out.println(stream.sum());
	}
}
