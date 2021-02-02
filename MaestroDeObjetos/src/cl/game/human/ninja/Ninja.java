package cl.game.human.ninja;

import cl.game.human.Human;

public class Ninja extends Human {

	/* 	Ninja: Establecer un valor predeterminado de stealth en 10.
		Ninja: Agregar un método steal(Human) que roba la cantidad de puntos que tenga el Ninja en stealth de la salud del otro Human y 
		los agrega a la health del Ninja.
		Ninja: Agregar un método runAway() que reduce su salud en 10.*/
	
	public static int countNinja = 0; 
	
	public Ninja() {
		super();
		this.setStealth(10);
		countNinja++;
	}
	
	public void steal(Human human){
		
		
		int health = human.getHealth();
		
		int ninjaStealth = human.getStealth();
		
		int newpoint = this.getHealth() + human.getStealth();
		
		this.setHealth(newpoint);
		
	}
	
	
	public void runAway() {
		this.setHealth(this.getHealth() - 10);
	}

	
	
}
