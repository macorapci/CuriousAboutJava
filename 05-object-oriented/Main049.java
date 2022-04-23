public class Main049 {
        public static final void main(String... args) {
                System.out.println(new Bar049().getValue());
        }
}


class Foo049 {
        private final String getValue() {
                return "Foo";
        }
}

class Bar049 extends Foo049 {
        protected String getValue() {
                return "Bar";
        }
}

