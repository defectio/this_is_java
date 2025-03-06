package Design_Patterns.ch06_singleton.my04_printer_solution;

public class Client {

	private static final int USER_NUM = 5;
	
	public static void main(String[] args) {
		User[] user = new User[USER_NUM];
		
		/**
		 * 5명이 동일한 Printer 인스턴스(static)를 사용한다. 
		 */
		for (int i = 0; i < USER_NUM; i++) {
			user[i] = new User((i+1) + "-user");
			user[i].print();
		}
		
		/**
		 * 오직 한 개의 Printer 객체가 생성된다.
		 * user name : 1-user,  print using : Design_Patterns.ch06_singleton.my04_print_sol_1.Printer@6f75e7211
		 * user name : 2-user,  print using : Design_Patterns.ch06_singleton.my04_print_sol_1.Printer@6f75e7212
		 * user name : 3-user,  print using : Design_Patterns.ch06_singleton.my04_print_sol_1.Printer@6f75e7213
		 * user name : 4-user,  print using : Design_Patterns.ch06_singleton.my04_print_sol_1.Printer@6f75e7214
		 * user name : 5-user,  print using : Design_Patterns.ch06_singleton.my04_print_sol_1.Printer@6f75e7215
		 */
	}
	
}