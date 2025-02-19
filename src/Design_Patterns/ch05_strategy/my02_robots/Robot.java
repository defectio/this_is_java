package Design_Patterns.ch05_strategy.my02_robots;

/**
 * (1) 기존 로봇의 공격 또는 이동 방법을 수정하려면 어떻게 코드를 수정해야할까?
 *      예를들어, 아톰이 날수는 없고 오직 걷게만 만들고 싶다면? 또는 태권V를 날게 하려면?
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
