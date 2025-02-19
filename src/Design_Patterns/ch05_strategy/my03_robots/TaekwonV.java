package Design_Patterns.ch05_strategy.my03_robots;

public class TaekwonV extends Robot {

	public TaekwonV(String name) {
		super(name);
	}

	@Override
	public void attack() {
		System.out.println("I have Missile and can attack with it.");
	}

	@Override
	public void move() {
		System.out.println("I can only walk.");
	}
	
}
