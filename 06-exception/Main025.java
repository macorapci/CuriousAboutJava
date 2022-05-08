public class Main025 {
	public static void main(String... args) throws Exception {
		try {
			throw new Exception();
		} catch (Exception e) {
			try {
				throw new Exception(); 
			} catch (Exception e) {
				throw new Exception();
			}	
		} finally {
			System.out.println("Pls don't be mad at me");
		}
	}
}
