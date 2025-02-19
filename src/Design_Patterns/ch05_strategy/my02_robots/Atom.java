package Design_Patterns.ch05_strategy.my02_robots;

public class Atom extends Robot {

	public Atom(String name) {
		super(name);
	}
	
	@Override
	public void attack() {
		System.out.println("I have strong punch and can attack with it.");
	}
	
	@Override
	public void move() {
//		System.out.println("I can fly.");
		System.out.println("I can only walk.");
	}

	
}
