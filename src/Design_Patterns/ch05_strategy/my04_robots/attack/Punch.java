package Design_Patterns.ch05_strategy.my04_robots.attack;

public class Punch implements AttackStrategy {

	@Override
	public void attack() {
		System.out.println("I have strong punch and can attack with it.");
	}
	
}
