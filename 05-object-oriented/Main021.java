public class Main021 {
	public static void main(String... args) {
		ThrowOut021.throwWithoutInstance();
	}
}

interface ThrowOut021 {
	String WHO = "Abstract Class";
	
	public int getTimes();

	public static void throwWithoutInstance() {
		for (var k=0; k<getTimes(); k++) {
			throwNow(WHO);
		}
	}

	public static void throwNow(String who) {
		System.out.println(who + " throwed as aspected!");
	}	
}

class Impl021 {
	public int getTimes() {
		return 11;
	}
}
