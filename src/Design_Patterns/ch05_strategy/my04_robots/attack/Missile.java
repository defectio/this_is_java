package Design_Patterns.ch05_strategy.my04_robots.attack;

public class Missile implements AttackStrategy {

	@Override
	public void attack() {
		System.out.println("I have missile and can attack with it.");
	}
	
}
