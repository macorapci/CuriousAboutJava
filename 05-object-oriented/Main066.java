public class Main066 {
        public static void main(String... value) {
                var k = new Bar066();
		System.out.println(((Foo066)k).value);
                System.out.println(k.getValue());
        }
}

class Foo066 {
        protected final int value = 10;
}

class Bar066 extends Foo066 {
        private int value = 30;

        public int getValue() {
                return this.value;
        }
}
