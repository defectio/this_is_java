package Design_Patterns.ch05_strategy.my03_robots;

/**
 * (2) 새로운 로봇을 만들어 기존의 공격 또는 이동방법 추가하거나 수정하려면?
 *       예를들어, 새로운 로봇으로 지구용사 선가드를 만들어 태권V의 공격 기능을 추가하려면?
 */
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
