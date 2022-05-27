import java.util.*;

public class Main015 {
	public static void main(String... args) {
		List<Foo015> list = new ArrayList<Foo015>();
		
		list.add(new Foo015("AAA"));
		list.add(new Foo015("A"));
		list.add(new Foo015("AAAAAA"));

		Collections.sort(list);
		System.out.println(list);	
	}
}


class Foo015 implements Comparator<Foo015> {
	public String value;

	public Foo015(String value) {
		this.value = value;
	}

	@Override
	public int compareTo(Foo015 foo) {
		return this.value.length() - foo.value.length();
	}

	@Override
	public String toString() {
		return "Foo{value= "+ this.value + " }";
	}
}
