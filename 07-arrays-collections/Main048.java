import java.util.*;

public class Main048 {
	public static void main(String... args)	{
		var foo = new ArrayList<String>();
		add(foo, "AA");
		add(foo, "BB");
		add(foo, "CC");

		System.out.println(foo);
	}

	public static <T,U> U add(T list, U element) {
		list.add(element);
		return element;
	}
} 
