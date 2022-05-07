public class Main020 {
	public static void main(String... args) {
		System.out.println("How many exception is valid?");

		class Error extends Exception {};
		class _XD extends Exception {};
		class GenericException<Integer> extends Exception {};
		interface InterfaceException extends Exception {};
	}
}
