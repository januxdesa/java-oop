package cl.game.human.wizard;

import cl.game.human.Human;

public class Wizard extends Human {

/* 		Wizard: Establecer un valor predeterminado de healt en 50.
		Wizard: Establecer un valor predeterminado de intelligence en 8.
		Wizard: Agregar un método heal(Human) que aumentará la salud del otro Human en los puntos de intelligence que tenga el Wizard.
		Wizard: Agregar un método fireBall(Human) que disminuye la salud del otro Human en los puntos de intelligence * 3 que tenga el Wizard.
*/
	
	
	public Wizard() {
		super();
		this.setHealth(50);
		this.setIntelligence(8);
	}
	
	
	public void Heal(Human human) {
		human.setHealth(human.getHealth() + this.getIntelligence());
	}
	
	public void FireBall(Human human) {
		human.setHealth(human.getHealth() - (this.getIntelligence()*3));
	}
}
