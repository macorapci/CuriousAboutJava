public class Main007 {
        public static void main(String... args) throws Exception {
                System.out.println(foo());
        }

        public static int foo() throws Exception {
                try {
                        throw new Exception();
                } catch(Exception ex) {
			return 1;	
		} finally {
                        return 2;
                }
        }
}

