import java.util.*;

public class Main049 {
	public static void main(String... args)	{
		var foo = new ArrayList<String>();
		add(foo, "AA");
		add(foo, "BB");
		add(foo, "CC");

		System.out.println(foo);
	}

	public static <T implements List<U>, U> U add(T list, U element) {
		list.add(element);
		return element;
	}
} 
