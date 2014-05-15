public class LinePrinter {
	private String string;

	public LinePrinter(String string) {
		this.string = string;
	}

	public String getString() {
		return string;
	}
	
	public void multiPrint(int num) {
		for(int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
						System.out.print(string);
			}
			System.out.println();
		}
	}
}
