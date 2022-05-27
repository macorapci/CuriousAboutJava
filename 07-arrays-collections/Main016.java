import java.util.*;

public class Main016 {
	public static void main(String... args) {
		List<Foo016> list = new ArrayList<Foo016>();
		
		list.add(new Foo016("AAA"));
		list.add(new Foo016("A"));
		list.add(new Foo016("AAAAAA"));

		Collections.sort(list);
		System.out.println(list);	
	}
}


class Foo016 implements Comparable<Foo016> {
	public String value;

	public Foo016(String value) {
		this.value = value;
	}

	@Override
	public int compareTo(Foo016 foo) {
		return this.value.length() - foo.value.length();
	}

	@Override
	public String toString() {
		return "Foo{value= "+ this.value + " }";
	}
}
