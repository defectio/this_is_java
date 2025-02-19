package Design_Patterns.ch05_strategy.my03_robots;

public class Client {

	public static void main(String[] args) {
		Robot taekwonV = new TaekwonV("TaekwonV");
		Robot atom = new Atom("Atom");
		Robot sungard = new Sungard("Sungard");
		
		System.out.println("My name is : " + taekwonV.getName());
		taekwonV.move();
		taekwonV.attack();
		
		System.out.println();

		System.out.println("My name is : " + atom.getName());
		atom.move();
		atom.attack();
		
		System.out.println();
		
		System.out.println("My name is : " + sungard.getName());
		sungard.move();
		sungard.attack();
	}
	
	/**
	 * 로봇예제에서 변화되면서 문제를 발생시키는 요인은 로봇의 이동방식과 공격 방식의 변화이다.
	 * 즉, 새로운 방식식의 이동 및 공격이 계속해서 추가될 수 있으므로 기존의 로봇이나 새로운 로봇이 이러한 기능을 
	 *   (1) 별다른 코드 변경 없이 제공받거나,
	 *   (2) 기존의 공격이나 이동 방식을 다른 공격이나 이동 방식으로 쉽게 변경 할 수 있어야 한다.
	 *  
	 *   -> 무엇이 변화되었는지를 찾은 후이 이를 클래스로 캡슐화 한다.
	 *   -> 외부에서 구체적인 이동방식과 공격방식을 담은 구체적인 클래스들을 은닉해야 한다.
	 *   -> 공격과 이동을 위한 인터페이스를 각각 만들고 이들을 실제 실현한 클래스를 만들어야 한다.
	 */
	
}
