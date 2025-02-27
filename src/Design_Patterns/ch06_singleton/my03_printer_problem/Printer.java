package Design_Patterns.ch06_singleton.my03_printer_problem;

public class Printer {

	/**
	 * Printer 인스턴스를 한번만 생성하도록 제한하려면
	 *   (1) 외부에서 Printer 생성자를 호출하지 못하게 막고 -> 생성자를 private 제한자로 선언
	 *   (2) getter 메소드를 통해서, 내부에서 생성된 Printer 객체를 리턴한다. -> Printer 객체의 생성자를 호출하지 않고 Printer 인스턴스를 획득해야 하므로 static 으로 선언 
	 */
	private static Printer printer = null;
	private int counter = 0;
	
	private Printer() {}
	
	/**
	 * Printer 인스턴스를 1개만 만들어야 하므로, 이미 생성된 Printer 인스턴스가 있는지 확인이 필요함. 
	 * @return
	 */
	public static Printer getPrinter() {
		if (printer ==	 null) {
			try {
				Thread.sleep(1);  // 스레드 실행을 고의적으로 1ms 정지
			} catch (InterruptedException e) {
				//
			}
			printer = new Printer();  // Printer 인스턴스 생
		}
		
		return printer;
	}
	
	public void print(String str) {
		counter++;
		System.out.println(str + counter);
	}

}