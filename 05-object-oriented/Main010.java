public class Main010 {
	public static void main(String[] strings) {
		new Imp010().get();
	}
}

abstract class UselessAfterEleven010 {
	public final void get() {
		System.out.println("Why we need abstact class after Interface default Methods");
	}
}

class Imp010 extends UselessAfterEleven010 {
	public final void get() {
		System.out.println("I don't know.");
	}
}
