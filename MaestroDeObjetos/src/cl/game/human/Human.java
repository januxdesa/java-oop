package cl.game.human;

public class Human {

	private int strength;
	private int stealth;
	private int intelligence;
	private int health;
	public static int humanoscreados = 0;

	public Human() {
		this.setIntelligence(3);
		this.setStealth(3);
		this.setStrength(3);
		this.setHealth(100);
		humanoscreados++;
	}
	
	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	public int getStealth() {
		return stealth;
	}

	public void setStealth(int stealth) {
		this.stealth = stealth;
	}

	public int getIntelligence() {
		return intelligence;
	}

	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}

	

	public int displayHealth() {
		return this.getHealth();

	}

	/*
	 * Agregar el método attack(Human) y reducir el atributo health del humano
	 * atacado por los puntos de strength del humano atacante.
	 */

	public void humanAttack(Human human) {
		int newHealth = human.getHealth() - this.getStrength();
		human.setHealth(newHealth);
	}

	/* Muestra todos los atributos del objeto */ 
	public void humanToAll() {

		String all = "";
		System.out.println("| Health | Intelligence  | Stealth | Strength|");
		System.out.println("| " + this.getHealth() + "\t | " + this.getIntelligence() + "\t\t | " + this.getStealth() + "\t   | " + this.getStrength());

	}

}
