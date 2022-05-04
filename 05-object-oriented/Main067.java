public class Main067 {
        public static void main(String... value) {
                var k = new Bar067();
		System.out.println(k.value);
                System.out.println(k.getValue());
        }
}

class Foo067 {
        protected final int value = 10;
}

class Bar067 extends Foo067 {
        private int value = 30;

        public int getValue() {
                return this.value;
        }
}
