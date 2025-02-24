package Design_Patterns.ch06_singleton.my03_printer_problem;

public class UserThread extends Thread {
	
	public UserThread(String name) {
		super(name);
	}
	
	public void run() {
		Printer printer = Printer.getPrinter();
		printer.print("user name : " + Thread.currentThread().getName()  + ",  print using : " + printer + ".");
	}

}
