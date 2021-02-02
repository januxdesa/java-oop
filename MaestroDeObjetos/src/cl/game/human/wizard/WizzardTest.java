package cl.game.human.wizard;
import cl.game.human.Human;
import cl.game.human.ninja.Ninja;

public class WizzardTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Human human = new Human();
		Wizard wizard = new Wizard();
		Ninja ninja = new Ninja();
		
		wizard.FireBall(human);
		human.humanToAll();
		wizard.humanToAll();
		
		human.humanAttack(wizard);
		wizard.humanToAll();
	}

}
