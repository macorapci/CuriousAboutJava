public class Main002 {
	public static void main(String... args) {
		Generic002<String> foo = new Generic002<>("Hello");
		System.out.println(foo.getItem());
	}
}

class Generic002<T> {
	private T item;

	Generic002(T item) {
		this.item = item;
	}

	public T getItem() {
		return item;
	}
}	
