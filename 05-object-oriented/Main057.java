public class Main057 {
	public static void main(String... args) {
		System.out.println(new Bar057().getValue());
	}
}

interface Foo057 {
	Integer interfaceValue;
	String getValue();

	public default Integer getInterfaceValue() {
                return interfaceValue;
        }
}

class Bar057 implements Foo057 {
	public String getValue() throws RuntimeException {
		System.out.println(getInterfaceValue());
		return "20";
	}
}

