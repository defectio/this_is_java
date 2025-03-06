package Design_Patterns.ch06_singleton.my03_printer_problem;

public class Client {

	private static final int THREAD_NUM = 5;
	
	public static void main(String[] args) {
		UserThread[] user = new UserThread[THREAD_NUM];
		
		/**
		 * 5명이 동일한 Printer 인스턴스를 사용한다. 
		 */
		for (int i = 0; i < THREAD_NUM; i++) {
			user[i] = new UserThread((i+1) + "-thread");
			user[i].start();
		}
	}
	
	/**
	 *  각 스레드마다 각기 다른 Printer 인스턴스를 사용한다.(Printer 인스턴스가 1개 이상 생긴다 하더라도 이렇다할 문제는 없음)
	 * 
	 *  Printer 클래스가 상태를 유지해야 하는 경우에 문제가 발생한다. 인스턴스마다 counter 변수를 각각 만들어 유지하기 때문.
	 */
	
}
