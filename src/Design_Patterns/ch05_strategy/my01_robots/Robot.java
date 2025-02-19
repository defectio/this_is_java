package Design_Patterns.ch05_strategy.my01_robots;

public abstract class Robot {
	
	private String name;
	
	public Robot(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public abstract void attack();
	
	public abstract void move();
}
