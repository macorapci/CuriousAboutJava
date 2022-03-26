public class Main013 {
	public static void main(String... strings) {
		var day = Day013.MONDAY;
		switch (day) {
			default:
                                System.out.println("0");	
			case MONDAY:
				System.out.println("1");
			case TUESDAY:
				System.out.println("2");	
		}	
	}
}

enum Day013 {
	MONDAY, 
	TUESDAY, 
	FRIDAY, 
	SATURDAY, 
	SUNDAY
}
