public class Main064 {
	public static void main(String... foo) {
		var bar = new Bar064();
		bar.fValue = 10;
		bar.sValue = "Value";
		bar.print();
	}
}

class Bar064 {
	float fValue;
	String sValue;
	
	void print() {
		System.out.println(fValue + " - " + sValue);
	}
}
