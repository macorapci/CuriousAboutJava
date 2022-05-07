public class Main012 {
	public static void main(String... args) {
		try {
			System.out.println("A");
			var value = args[1000];
		} catch (RuntimeException ex) {
			System.out.println("B");
			throw ex;
		} catch (Exception ex) {
			System.out.println("C");
		} finally {
			System.out.println("D");
		}
	}	
}
