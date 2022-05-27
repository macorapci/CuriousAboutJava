import java.util.*;

public class Main022 {
	public static void main(String... args) {
		List<Foo022> list = new ArrayList<>();
		list.add(new Foo022("AAA"));
		list.add(new Foo022("BBB"));
		list.add(new Foo022("CCC"));
		list.add(new Foo022("AAA"));

		System.out.println("Before= " + list);
		Collections.sort(list);
		System.out.println("After = " + list);
	}
}

class Foo022 implements Comparable<Foo022> {
	public String value;

	public Foo022(String value) {
		this.value = value;
	}

	public int compareTo(Foo022 foo) {
		return 20;
	}

	@Override
	public String toString() {
		return "Foo{value= "+ this.value + " }";
	}
}
