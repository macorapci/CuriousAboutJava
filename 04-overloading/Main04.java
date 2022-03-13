import java.util.*;

public class Main04 {
	public static void main(String... args){
		Main04 main = new Main04();
		List<String> stringList = java.util.Arrays.of("1", "2", "3");
		System.out.println(main.bar(stringList));
	}

	public int bar(List<String> strings) {
		return 0;
	}

	public int bar(List<Integer> numbers) {
		return 1;
	}
}
