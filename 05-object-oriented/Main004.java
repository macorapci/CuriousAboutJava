public class Main004 {
	public static void main(String... amIHave2WriteThisOverAndOverAgain) {
		final var tool = new Tool004();
		System.out.println(tool.getToolSize());
		
		Tool004.changeToolSize(tool, 20);
		System.out.println(tool.getToolSize());
	}
}

class Tool004 {
	private int toolSize;

	public static void changeToolSize(Tool004 tool, int size) {
		tool = new Tool004();
		tool.toolSize = size;
	}

	public int getToolSize() {
		return this.toolSize;
	}
}
