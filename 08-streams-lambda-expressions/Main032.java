import java.util.stream.*;
import java.util.function.*;

public class Main032 {
	public static void main(String... args) {
		Stream<Foo032> stream = Stream.of(
			new Foo032("AAA", 10),
			new Foo032("BBB", 10),
			new Foo032("CCC", 10),
			new Foo032("AAA", 10),
			new Foo032("BBB", null),
			new Foo032("FFF", 10),
			new Foo032(null, 10)		
		);

		var map = stream
			.filter(x -> x != null)
			.filter(x -> x.getStrValue() != null)
			.filter(x -> x.getIntValue() != null)
			.collect(
				Collectors.groupingBy(Foo032::getStrValue,
					Collectors.summingInt(Foo032::getIntValue))		
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

class Foo032 {
	private String strValue;
	private Integer intValue;

	public Foo032 (String strValue, Integer intValue) {
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
