package Design_Patterns.ch05_strategy.my01_robots;

public class Client {

	public static void main(String[] args) {
		Robot taekwonV = new TaekwonV("TaekwonV");
		Robot atom = new Atom("Atom");
		
		System.out.println("My name is : " + taekwonV.getName());
		taekwonV.move();
		taekwonV.attack();
		
		System.out.println();

		System.out.println("My name is : " + atom.getName());
		atom.move();
		atom.attack();
	}
	
	/**
	 * (1) 기존 로봇의 공격 또는 이동 방법을 수정하려면 어떻게 코드를 수정해야할까?
	 *      예를들어, 아톰이 날수는 없고 오직 걷게만 만들고 싶다면? 또는 태권V를 날게 하려면?
	 * (2) 새로운 로봇을 만들어 기존의 공격 또는 이동방법을 추가하거나 수정하려면?
	 *       예를들어, 새로운 로봇으로  지구용사 선가드를 만들어 태권V의 공격 기능을 추가하려면?
	 */
	
}
