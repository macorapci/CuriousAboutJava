public class Main016 {
	public static void main(String... args) {
		try {
			if (!"foo".equals("bar")) {
				new MyException016(); 
			}
		} catch (MyException016 | RuntimeException ex) {
			System.out.println("1");
		} catch (Exception ex) {
			System.out.println("2");
		} finally {
			System.out.println("3");
		}
	}
}

class MyException016 extends Exception { }
