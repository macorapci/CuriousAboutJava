public class Main057 {
	public static void main(String... args) {
		var foo = new ArrayList<>();
		foo.add(1);
		foo.add(2);
		foo.add(Integer.valueOf(3));
		foo.add(Integer.valueOf(4));

		foo.remove(2);
		foo.remove(Integer.valueOf(1));

		System.out.println(foo);
	}
}
