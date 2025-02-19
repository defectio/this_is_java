package Design_Patterns.ch05_strategy.my04_robots.move;

public class Flying implements MovingStrategy {

	@Override
	public void move() {
		System.out.println("I can fly.");
	}

}
