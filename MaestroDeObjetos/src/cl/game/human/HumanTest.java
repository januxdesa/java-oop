package cl.game.human;

import cl.game.human.ninja.Ninja;
import cl.game.human.samurai.Samurai;
import cl.game.human.wizard.Wizard;

public class HumanTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Human human = new Human();
		
		Ninja ninja = new Ninja();
		
		Wizard wizard = new Wizard();
		
		Samurai samurai = new Samurai();
		Samurai samurai2 = new Samurai();
		Samurai samurai3 = new Samurai();
	
		 human.humanAttack(ninja);
		 
	
		
		//System.out.println(human.humanToAll());
		System.out.println(ninja.displayHealth());
		System.out.println(wizard.displayHealth());
		System.out.println(samurai.displayHealth());
		
		human.humanAttack(ninja);
		ninja.humanAttack(human);
		
		System.out.println(human.displayHealth());
		System.out.println(ninja.displayHealth());
		System.out.println(wizard.displayHealth());
		System.out.println(samurai.displayHealth());
		//System.out.println(human2.displayHealth());
		
		int howmany = samurai.howMany();
		System.out.println("Samurai Creados: " + howmany);
	}

}
