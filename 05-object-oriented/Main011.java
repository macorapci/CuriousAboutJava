public class Main011 {
	public static void main(String... strings) {
		var day = Day011.MONDAY;
		switch (day) {
			case Day011.MONDAY:
				System.out.println("1");
			case Day011.TUESDAY:
				System.out.println("2");
			default:
				System.out.println("3");	
		}	
	}
}

enum Day011 {
	MONDAY, 
	TUESDAY, 
	FRIDAY, 
	SATURDAY, 
	SUNDAY
}
