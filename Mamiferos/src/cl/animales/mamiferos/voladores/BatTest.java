package cl.animales.mamiferos.voladores;

public class BatTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bat bat = new Bat();

		// String msg = "";
		int displayEnergy = 0;
		
		int tofly = -50;
		int toeat = 25;
		int toattack = -100;

		// 
		displayEnergy = bat.getDisplayEnergy();
		System.out.println(displayEnergy);

		
		System.out.println(bat.attackTown(toattack));
		System.out.println(bat.attackTown(toattack));
		System.out.println(bat.attackTown(toattack));
		
		System.out.println(bat.eatHumans(toeat));
		System.out.println(bat.eatHumans(toeat));
		
		System.out.println(bat.fly(tofly));
		System.out.println(bat.fly(tofly));
		
		// 
		displayEnergy = bat.getDisplayEnergy();
		System.out.println(displayEnergy);

	}

}
