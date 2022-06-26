import java.util.*;
import java.util.stream.*;

public class Main026 {
	public static void main(String... args) {
		var foo = new ArrayList<Foo026>();

		var one = new Foo026();
		one.bar = "AAA";
		one.voo = 1;

		var two = new Foo026();
		two.bar = "BBB";
		two.voo = 2;

		var three = new Foo026();
		three.bar = "CCC";
		three.voo = 1; 

		foo.add(one);
		foo.add(two);
		foo.add(three);

		var bar = foo.stream()
			.collect(
				Collectors.groupingByConcurrent(x -> x.voo)
			);
		
		System.out.println(bar);
	}
}

class Foo026 {
	public String bar;
	public int voo;

	@Override
	public String toString() {
		return this.bar;
	}
}
