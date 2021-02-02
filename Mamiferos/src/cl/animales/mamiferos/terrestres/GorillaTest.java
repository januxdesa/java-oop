package cl.animales.mamiferos.terrestres;

public class GorillaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gorillas gorilla = new Gorillas();
		String msg = "";
		int displayEnergy = 0;
		int doSomething = -5;
		int eatSomething = 10;
		int toClimb = -10;
		
		displayEnergy =  gorilla.getDisplayEnergy();
		System.out.println(displayEnergy);
		
		msg = gorilla.throwSomething(doSomething);
		System.out.println(msg);
		msg = gorilla.throwSomething(doSomething);
		System.out.println(msg);		
		msg = gorilla.throwSomething(doSomething);
		System.out.println(msg);
		//
		msg = gorilla.eatBananas(eatSomething);
		System.out.println(msg);
		msg = gorilla.eatBananas(eatSomething);
		System.out.println(msg);
		//
		msg = gorilla.climb(toClimb);
		System.out.println(msg);
		//
		displayEnergy =  gorilla.getDisplayEnergy();
		System.out.println(displayEnergy);
		//
		
		
	}

}
