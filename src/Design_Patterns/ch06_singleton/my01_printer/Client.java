package Design_Patterns.ch06_singleton.my01_printer;

public class Client {

	private static final int USER_NUM = 5;
	
	public static void main(String[] args) {
		User[] user = new User[USER_NUM];
		
		/**
		 * 프린트 객체를 사용자마다 생성해서 print()를 한다면?
		 *   - 5개의 Printer 인스턴스가 생성된다.
		 *   -> 여러명이 동일한 Printer 인스턴스를 사용(공유)하도록 하여 자원을 제한한다. 
		 */
		for (int i = 0; i < USER_NUM; i++) {
			user[i] = new User((i+1) + "-user");
			user[i].print();
		}
	}
	
}
