public class Main043 {
        public static void main(String... args) {
                int value = 20;

                final class Foo043 extends Bar043 {
                        public int getValue() {
                                return value;
                        }
                }

                System.out.println(new Foo043().getValue());
        }
}       

class Bar043 { }
