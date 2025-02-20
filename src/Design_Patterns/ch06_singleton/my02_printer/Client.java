package Design_Patterns.ch06_singleton.my02_printer;

public class Client {

	private static final int USER_NUM = 5;
	
	public static void main(String[] args) {
		User[] user = new User[USER_NUM];
		
		/**
		 * 5명이 동일한 Printer 인스턴스를 사용한다. 
		 */
		for (int i = 0; i < USER_NUM; i++) {
			user[i] = new User((i+1) + "-user");
			user[i].print();
		}
	}
	
	/**
	 * 만약, 다중스레드에서 Printer 클래스를 이용할때도 인스턴스가 1개만 생성된다고 보장할 수 있을까?
	 */
	
}
