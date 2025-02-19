package Design_Patterns.ch05_strategy.my03_robots;

/**
 * 캡슐화 다누이에 따라 새로운 로봇을 추가하는 것은 매우 쉽다.
 * 하지만, 선가드가 태권V의 미사일 공격 기능을 사용하려고 하면 attack 메서드가 중복 사용된다.
 * @author defec
 *
 */
public class Sungard extends Robot {
	
	public Sungard(String name) {
		super(name);
	}
	
	// 태권V와 attack() 메소드가 중복됨
	@Override
	public void attack() {
		System.out.println("I have Missile and can attack with it.");
	}

	@Override
	public void move() {
		
	}

}
