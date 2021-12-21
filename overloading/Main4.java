import java.util.*;

public class Main4 {
	public static void main(String... args){
		Main4 main = new Main4();
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
