public class Main017 {
        public static void main(String... args) {
                try {
                        if (!"foo".equals("bar")) {
                                new MyException017();
                        }
                } catch (MyException017 ex) {
                        System.out.println("1");
                } catch (Exception ex) {
                        System.out.println("2");
                } finally {
                        System.out.println("3");
                }
        }
}

class MyException017 extends RuntimeException { }

