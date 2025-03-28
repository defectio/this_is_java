package chapter07_Inheritance.sec07_Polymorphism.part02_Field_Polymorphism;

public class KumhoTire extends Tire {

	/**
	 * 생성자 - super() 로 부모 생성자 호출
	 * @param location
	 * @param maxRotation
	 */
	public KumhoTire(String location, int maxRotation) {
		super(location, maxRotation);
	}	
	
	/**
	 * Tire의 roll() 메소드 재정의
	 */
	@Override
	public boolean roll() {
		++accumulatedRotation;		
		if(accumulatedRotation<maxRotation) {
			System.out.println(location + " KumhoTire 수명: " + (maxRotation - accumulatedRotation) + "회");
			return true;
		} else {
			System.out.println("*** " + location + " KumhoTire 펑크 ***");
			return false;
		}
	}
	
}
