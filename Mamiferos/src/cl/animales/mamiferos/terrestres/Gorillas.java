package cl.animales.mamiferos.terrestres;

import cl.animales.mamiferos.Mammal;

public class Gorillas extends Mammal {
	
	/* Crear una clase a parte Gorilla que puede throwSomething(), eatBananas() y climb().
	Para el m�todo throwSomething(), hacer que imprima un mensaje en pantalla indicando que el gorila ha 
	lanzado algo, al mismo tiempo que disminuye su nivel de energ�a en 5.
	Para el m�todo eatBananas(), hacer que imprima un mensaje en pantalla indicando la satisfacci�n del gorila e 
	incrementar su nivel de energ�a en 10.
	Para el m�todo climb(), hacer que muestre un mensaje en pantalla indicando que el gorila ha trepado a la cima de un �rbol y 
	disminuir su nivel de energ�a en 10.*/
	
	public Gorillas() {
		this.setDisplayEnergy(100);
	}
	
	public String throwSomething(int energy) {
		this.processEnergy(energy);
		return "El gorila lanz� una piedra. ";
	}

	public String eatBananas(int energy) {
		this.processEnergy(energy);
		return "El gorilla come bananas. Y est� Feliz!!!";
	}
	
	public String climb(int energy) {
		this.processEnergy(energy);
		return "El gorilla subi� a un �rbol. Ahora esta cansado";
	}
}
	