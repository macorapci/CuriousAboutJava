import java.util.*;

public class Main020 {
	public static void main(String... args) {
		List<Foo020> list = List.of(new Foo020("AAA"), new Foo020("BBB"), new Foo020("CCC"), new Foo020("AAA"));

		System.out.println("Before= " + list);
		Collections.sort(list);
		System.out.println("After = " + list);
	}
}

class Foo020 {
	public String value;

	public Foo020(String value) {
		this.value = value;
	}

	public int compareTo(Foo020 foo) {
		return 20;
	}
	
	@Override
	public String toString() {
		return "Foo{value= "+ this.value + " }";
	}
}
