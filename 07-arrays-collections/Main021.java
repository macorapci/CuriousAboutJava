import java.util.*;

public class Main021 {
	public static void main(String... args) {
		List<Foo021> list = List.of(new Foo021("AAA"), new Foo021("BBB"), new Foo021("CCC"), new Foo021("AAA"));

		System.out.println("Before= " + list);
		Collections.sort(list);
		System.out.println("After = " + list);
	}
}

class Foo021 implements Comparable<Foo021> {
	public String value;

	public Foo021(String value) {
		this.value = value;
	}

	public int compareTo(Foo021 foo) {
		return 20;
	}
	
	@Override
	public String toString() {
		return "Foo{value= "+ this.value + " }";
	}
}
