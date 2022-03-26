public Main012 {
	public static void main(String... strings) {
		var day = Day012.MONDAY;
		switch (day) {
			case MONDAY:
				System.out.println("1");
			case TUESDAY:
				System.out.println("2");
			default:
				System.out.println("3");	
		}	
	}
}

enum Day012 {
	MONDAY, 
	TUESDAY, 
	FRIDAY, 
	SATURDAY, 
	SUNDAY
}
