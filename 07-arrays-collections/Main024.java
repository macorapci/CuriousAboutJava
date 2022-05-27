import java.util.*;

public class Main024 {
	public static void main(String... main) {
		/* public class LinkedList<E>
		 * extends AbstractSequentialList<E>
		 * implements List<E>, Deque<E>, Cloneable, Serializable
		 */
		var foo = new LinkedList<Integer>();
		
		foo.offer(1);
		foo.offer(2);
		foo.offer(3);

		foo.push(4);

		System.out.println("Before= " + foo);
		System.out.println(foo.poll());
		System.out.println(foo.poll());	
		System.out.println("After = " + foo);
	}
}
