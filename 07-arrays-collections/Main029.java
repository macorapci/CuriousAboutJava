import java.util.*;

public class Main029 {
	public static void main(String... args) {
		List<Foo029> list = new ArrayList<>();
		list.add(new Foo029(5));
		list.add(new Foo029(2));
		list.add(new Foo029(-5));
		list.add(new Foo029(0));
		list.add(new Foo029(30));

		System.out.println("Before : " + list);
		Collections.sort(list);
		System.out.println("After  : " + list);
	}
}

class Foo029 implements Comparable<Foo029> {
	public int value;
	
	public Foo029(int value) {
		this.value = value;
	}

	@Override
	public int compareTo(Foo029 foo) {
		return this.value - foo.value;
	}

	@Override
	public String toString() {
		return "Foo { value= " + this.value + " }";
	}
}
