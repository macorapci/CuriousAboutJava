public class Main045 {
        public static void main(String... args) {
                var one = new Wrapper<Foo045>();
                var two = new Wrapper<Bar045>();
                var three = new Wrapper<Boo045>();
        }
}

class Foo045 {}
class Bar045 extends Foo045 {}
class Boo045 {}
class Wrapper<T extends Foo045> {}
