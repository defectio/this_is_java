package Design_Patterns.ch05_strategy.my04_robots.move;

public class Walking implements MovingStrategy{

	@Override
	public void move() {
		System.out.println("I can only walk.");
	}

	
}
