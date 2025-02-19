package Design_Patterns.ch05_strategy.my04_robots;

public class Atom extends Robot {

	public Atom(String name) {
		super(name);
	}
	
	/**
	 * Robot의 추상메소드를 재정의 할 필요가 없어짐.(atom 객체에서 전략을 정하지 않아도 됨)
	 */
	
//	@Override
//	public void attack() {
//		System.out.println("I have strong punch and can attack with it.");
//	}
	
//	@Override
//	public void move() {
//		System.out.println("I can fly.");
//	}

	
}
