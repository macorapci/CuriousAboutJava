public class Main018 {
	public static void main(String... args) {
		var impl = new Impl018();
        	System.out.println(impl.getValue());
	}
}       

interface FuncInterfaceOne018 {
        public default int getValue() {
                return 10;
        }
}       

interface FuncInterfaceTwo018 {
        public default int getValue() {
                return 20;
        }
}       

class Impl018 implements FuncInterfaceOne018, FuncInterfaceTwo018 {
        public int getValue() {
                return 30;
        }
}
