import java.util.stream.*;

public class Main014 {
	public static void main(String... args) {
		DoubleStream stream = Stream.of(1.0, 2.0, 3.0, 4.0);
	
		System.out.println(stream.avarage());
		System.out.println(stream.count());
		System.out.println(stream.max());
		System.out.println(stream.sum());
	}
}
