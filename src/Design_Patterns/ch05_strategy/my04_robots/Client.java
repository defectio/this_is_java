package Design_Patterns.ch05_strategy.my04_robots;

import Design_Patterns.ch05_strategy.my04_robots.attack.Missile;
import Design_Patterns.ch05_strategy.my04_robots.attack.Punch;
import Design_Patterns.ch05_strategy.my04_robots.move.Flying;
import Design_Patterns.ch05_strategy.my04_robots.move.Walking;

public class Client {

	public static void main(String[] args) {
		Robot taekwonV = new TaekwonV("TaekwonV");
		Robot atom = new Atom("Atom");
		
		/**
		 * Robot의 자식객체에 movingStrategy, attackStrategy 전략을 설정한다.
		 */
		taekwonV.setMovingStrategy(new Walking());
		taekwonV.setAttackStrategy(new Missile());
		
		atom.setMovingStrategy(new Flying());
		atom.setAttackStrategy(new Punch());
		
		System.out.println("My name is : " + taekwonV.getName());
		taekwonV.move();
		taekwonV.attack();
		
		System.out.println();

		System.out.println("My name is : " + atom.getName());
		atom.move();
		atom.attack();
	}
	
	/**
	 * [Strategy  패턴에서의 역할]
	 *   - Strategy : 인터페이스나 추상클래스로 외부에서 동일한 방식으로 알고리즘을 호출하는 방법을 명시한다.
	 *   - ConcreteStrategy : Strategy  패턴에서 명시한 알고리즘을 실제로 구현한 클래스이다.
	 *   - Context : Strategy  패턴을 이용하는 역할을 수행한다. 필요에 따라 구체적인 전략을 바꿀 수 있도록 setter 메소드를 제공한다.
	 */
	
}
