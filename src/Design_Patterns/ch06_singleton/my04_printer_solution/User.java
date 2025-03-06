package Design_Patterns.ch06_singleton.my04_printer_solution;

public class User {

	private String name;
	
	public User(String name) {
		this.name  = name;
	}
	
	public void print() {
		Printer printer = Printer.getPrinter();
		printer.print("user name : " + this.name  + ",  print using : " + printer);
	}
	
}