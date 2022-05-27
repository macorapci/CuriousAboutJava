import java.lang.reflect.*;

public class Main027 {
	public static void main(String... args) {
		var one = new Generic027<Integer>();	
		one.print(new Integer(1));

		var two = new Generic027<>();
		two.print(new Integer(2));

		Generic027 three = new Generic027();
		three.print(new Integer(3));

		Generic027 four = new Generic027<Integer>();
		four.print(new Integer(4));
		
		Generic027<Integer> five = new Generic027<Integer>();
		five.print(new Integer(5));
	}
}

class Generic027<T> {
	public void print(T item) {
		System.out.println(item);
	}
}
