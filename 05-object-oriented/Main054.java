public class Main054 {
        public static void main(String... args) {
                abstract class AbstractFoo054 { };

                class Foo054 extends AbstractFoo054 {
                        private String value = "10";

                        public String getValue() {
                                return value;
                        }
                };

                var foo = new Foo054() {
                        public String getValue() {
                                return "20";
                        }
                };

                System.out.println(foo.getValue());
        }
} 
