package Design_Patterns.ch06_singleton.my01_printer;

public class User {

	private String name;
	
	public User(String name) {
		this.name  = name;
	}
	
	public void print() {
		Printer printer = new Printer();
		printer.print("user name : " + this.name  + ",  print using : " + printer);
	}
	
}
