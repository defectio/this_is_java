package Design_Patterns.ch05_strategy.my02_robots;

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
	 * 이렇게 변경하는 방식은 기존 코드를 수정하여 새로운 기능을 변경하기 때문에 OCP에 위배된다.
	 * 또한, Atom 클래스의 move 메서드와 TaekwonV 클래스의 move 메서드가 동일한 기능을 실행하므로 기능이 중복되는 상황이 발생한다.
	 * 
	 * 중복 상황은 많은 문제를 야기하는 원인이 된다.
	 * 걷는 방식에 문제가 있거나 새로운 방식으로 수정하려면 모든 중복된 코드를 일관성있게 변경해야만 한다.(TaekwonV, Atom의 move() 메소드 모두 수정해야함)
	 * 로봇의 종류가 많아질 수록 중복된 코드를 일정하게 유지 관리하는 일은 매우 힘들고 많은 집중력이 필요해진다.
	 */
	
}
