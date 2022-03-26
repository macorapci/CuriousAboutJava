public class Main006 {
        public static void main(String[] yes) {
                var cat = new Cat006();
                Cat006.new Tiger006();
        }
}       

class Cat006 {
        class Tiger006 extends Cat006 {}

        public void roar() {
                System.out.println("Meow!");
        }
} 
