package Design_Patterns.ch05_strategy.my04_robots;

import Design_Patterns.ch05_strategy.my04_robots.attack.AttackStrategy;
import Design_Patterns.ch05_strategy.my04_robots.move.MovingStrategy;

public abstract class Robot {
	
	private String name;
	private MovingStrategy movingStrategy;
	private AttackStrategy attackStrategy;
	
	public Robot(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public MovingStrategy getMovingStrategy() {
		return movingStrategy;
	}

	public void setMovingStrategy(MovingStrategy movingStrategy) {
		this.movingStrategy = movingStrategy;
	}

	public AttackStrategy getAttackStrategy() {
		return attackStrategy;
	}

	public void setAttackStrategy(AttackStrategy attackStrategy) {
		this.attackStrategy = attackStrategy;
	}
	
	/**
	 * Robot을 상속받은 taekwonV, atom에서 attack(), move() 메소드를 재정의 하는 것에서
	 * Strategy 인터페이스에서 재정의한 메소드를 사용하도록 변경
	 *   -> 전략을 쉽게 바꿀 수 있게 해준다.
	 */
//	public abstract void attack();
	public void attack() {
		attackStrategy.attack();
	};
	
//	public abstarct void move();
	public void move() {
		movingStrategy.move();
	};
	
}
