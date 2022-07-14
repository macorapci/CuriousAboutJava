import java.util.stream.*;
import java.util.function.*;

public class Main030 {
	public static void main(String... args) {
		Stream<Foo030> stream = Stream.of(
			new Foo030("AAA", 10),
			new Foo030("BBB", 10),
			new Foo030("CCC", 10),
			new Foo030("AAA", 10),
			new Foo030("BBB", null),
			new Foo030("FFF", 10),
			new Foo030(null, 10)		
		);

		var map = stream.collect(
			Collectors.groupingBy(Foo030::getStrValue,
				Collectors.summingInt(Foo030::getIntValue))		
		);
		
		System.out.println("***********");
		System.out.println("map.get(\"AAA\")");
		System.out.println(map.get("AAA"));
		System.out.println("***********");
		System.out.println("***********");
                System.out.println("map.get(\"BBB\")");
                System.out.println(map.get("BBB"));
                System.out.println("***********");
		System.out.println("***********");
                System.out.println("map.get(null)");
                System.out.println(map.get(null));
                System.out.println("***********");
		System.out.println("***********");
                System.out.println("map");
                System.out.println(map);
                System.out.println("***********");
	}
}

class Foo030 {
	private String strValue;
	private Integer intValue;

	public Foo030 (String strValue, Integer intValue) {
		this.strValue = strValue;
		this.intValue = intValue;
	}

	public String getStrValue() {
		return this.strValue;
	}

	public Integer getIntValue() {
		return this.intValue;
	}
}
