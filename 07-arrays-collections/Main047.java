import java.util.*;

public class Main047 {
	public static void main(String... args)	{
		var foo = new ArrayList<String>();
		add(foo, "AA");
		add(foo, "BB");
		add(foo, "CC");

		System.out.println(foo);
	}

	public static U add(T list, U element) {
		list.add(element);
		return element;
	}
} 
