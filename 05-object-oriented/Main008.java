public class Main008 {
        public static void main(String[] yes) {
                var cat = new Cat008();
                new Cat008.Tiger008();
        }
}       

class Cat008 {
        class Tiger008 extends Cat008 {}

        public void roar() {
                System.out.println("Meow!");
        }
} 
