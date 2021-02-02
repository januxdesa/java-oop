package cl.game.human.samurai;

import cl.game.human.Human;

public class SamuraiTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Samurai samurai = new Samurai();
		Human human= new Human();
		
		
		samurai.humanToAll();
		System.out.println(samurai.howMany());
		
	}

}
