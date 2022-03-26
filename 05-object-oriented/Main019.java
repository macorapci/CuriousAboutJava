public class Main019 {
	public static void main(String... args) {
		var impl = new Impl019();
        	System.out.println(impl.getValue());
	}
}       

interface FuncInterfaceOne019 {
        public default int getValue() {
                return 10;
        }
}       

interface FuncInterfaceTwo019 {
        public default int getValue() {
                return 20;
        }
}       

class Impl019 implements FuncInterfaceOne019, FuncInterfaceTwo019 {
        public int getValue() {
                return super.FuncInterfaceOne019.getValue();
        }
}
