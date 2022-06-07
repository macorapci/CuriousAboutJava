import java.util.*;

public class Main034 {
	public static void main(String... args) {
		var q = new ArrayDeque<String>();
		q.offerFirst("AA");
		q.offer("BB");
		q.offerLast("CC");
	
		System.out.println(q);
		System.out.println(q.poll());
		System.out.println(q.removeFirst());
		System.out.println(q.size());
	}
}
