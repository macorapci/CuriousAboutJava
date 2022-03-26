public class Main020 {
        public static void main(String... args) {
                var impl = new Impl020();
                System.out.println(impl.getValue());
        }
}

interface FuncInterfaceOne020 {
        public default int getValue() {
                return 10;
        }
}

interface FuncInterfaceTwo020 {
        public default int getValue() {
                return 20;
        }
}

class Impl020 implements FuncInterfaceOne020, FuncInterfaceTwo020 {
        public int getValue() {
                return FuncInterfaceOne020.super.getValue();
        }
}
