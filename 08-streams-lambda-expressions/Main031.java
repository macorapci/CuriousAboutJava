import java.util.stream.*;
import java.util.function.*;

public class Main031 {
	public static void main(String... args) {
		Stream<Foo031> stream = Stream.of(
			new Foo031("AAA", 10),
			new Foo031("BBB", 10),
			new Foo031("CCC", 10),
			new Foo031("AAA", 10),
			new Foo031("BBB", null),
			new Foo031("FFF", 10),
			new Foo031(null, 10)		
		);

		var map = stream
			.filter(x -> x.getIntValue() != null)
			.collect(
				Collectors.groupingBy(Foo031::getStrValue,
					Collectors.summingInt(Foo031::getIntValue))		
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

class Foo031 {
	private String strValue;
	private Integer intValue;

	public Foo031 (String strValue, Integer intValue) {
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
