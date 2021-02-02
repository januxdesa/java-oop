package cl.game.human.samurai;

import cl.game.human.Human;

public class Samurai extends Human {

	 /* Samurai: Establecer un valor predeterminado de health en 200.
		Samurai: Agregar un método deathBlow(Human) que asesina al otro Human y reduce la health del Samurai a la mitad.
		Samurai: Agregar un método meditate() que curará al Samurai en la mitad de puntos que tenga de health.
		Samurai: Agregar un método howMany() que devuelve el número actual del Samurai.
		*/
	
	public static int countSamurai = 0;
	
	public static int getCountSamurai() {
		return countSamurai;
	}

	public static void setCountSamurai(int countSamurai) {
		Samurai.countSamurai = countSamurai;
	}

	public Samurai() {
		super();
		this.setHealth(200);
		countSamurai++;
	}
	
	public void deathBlow(Human human) {
		this.setHealth(this.getHealth()/2);
	}
	
	public void meditate() {
		this.setHealth(this.getHealth() + this.getHealth()/2);
	}
	
	public int howMany() {
		return Samurai.getCountSamurai();
	}
}
