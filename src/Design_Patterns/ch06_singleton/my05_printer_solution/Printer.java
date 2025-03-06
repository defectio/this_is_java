package Design_Patterns.ch06_singleton.my05_printer_solution;

/**
 * 다중스레드 애플리케이션에서 발생하는 문제를 해결하는 방법
 *   (1) 정적 변수에 인스턴스를 만들어 바로 초기화하는 방법
 *   (2) 인스턴스를 만드는 메서드에 동기화하는 방법 
 */
public class Printer {

	private static Printer printer = null;
	
	private Printer() {}
	
	/**
	 * 메서드 동기화 
	 *   - 다중 스레드 환경에서 동시에 여러 스레드가 getPrinter 메서드를 소유하는 객체에 접근하는 것을 막는다.
	 *   -> 결과적으로 오직 하나의 Printer 인스턴스가 생성됨
	 * @return
	 */
	public synchronized static Printer getPrinter() {
		if (printer == null) {
			printer = new Printer();
		}
		return printer;
	}
	
	public void print(String str) {
		System.out.println(str);
	}

}