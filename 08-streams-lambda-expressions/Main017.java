import java.util.stream.*;

public class Main017 {
	public static void main(String... args) {
		DoubleStream stream = DoubleStream.iterate(1.0, x -> x + 1)
			.limit(0);
		System.out.println(stream.average());

		stream = DoubleStream.iterate(1.0, x -> x + 1)
                        .limit(0);
		System.out.println(stream.count());

		stream = DoubleStream.iterate(1.0, x -> x + 1)
                        .limit(0);
		System.out.println(stream.max());

		stream = DoubleStream.iterate(1.0, x -> x + 1)
                        .limit(0);
		System.out.println(stream.sum());
	}
}
