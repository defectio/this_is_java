package Design_Patterns.ch06_singleton.my04_printer_solution;

/**
 * 다중스레드 애플리케이션에서 발생하는 문제를 해결하는 방법
 *   (1) 정적 변수에 인스턴스를 만들어 바로 초기화하는 방법
 *   (2) 인스턴스를 만드는 메서드에 동기화하는 방법 
 */
public class Printer {

	// 정적 변수는 객체가 생성되기 전 클래스가 메모리에 로딩될 때 만들어져 초기화가 한 번만 실행된다.
	// 또한, 정적 변수는 프로그램이 시작될 때부터 종료될 때까지 없어지지 않고 메모리에 계속 상주하며 클래스에서 생성된 모든 객체에서 참조할 수 있다.
	private static Printer printer = new Printer();
	private int counter = 0;
	
	private Printer() {}
	
	/**
	 * 정적으로 생성된 Printer 객체를 돌려준다.
	 * @return
	 */
	public static Printer getPrinter() {
		return printer;
	}
	
	public void print(String str) {
		counter++;
		System.out.println(str + counter);
	}

}