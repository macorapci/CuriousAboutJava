public class Main053 {
	public static void main(String... args) {
		abstract class AbstractFoo053 { };

		class Foo053 extends AbstractFoo053 {
			private String value = "10";

			public String getValue() {
				return value;
			}
		}

		var foo = new Foo053() {
			public String getValue() {
				return "20";
			}
		};

		System.out.println(foo.getValue() + ", " + value);		
	}
}
