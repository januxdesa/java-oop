package cl.animales.mamiferos.terrestres;

import cl.animales.mamiferos.Mammal;

public class Gorillas extends Mammal {
	
	/* Crear una clase a parte Gorilla que puede throwSomething(), eatBananas() y climb().
	Para el método throwSomething(), hacer que imprima un mensaje en pantalla indicando que el gorila ha 
	lanzado algo, al mismo tiempo que disminuye su nivel de energía en 5.
	Para el método eatBananas(), hacer que imprima un mensaje en pantalla indicando la satisfacción del gorila e 
	incrementar su nivel de energía en 10.
	Para el método climb(), hacer que muestre un mensaje en pantalla indicando que el gorila ha trepado a la cima de un árbol y 
	disminuir su nivel de energía en 10.*/
	
	public Gorillas() {
		this.setDisplayEnergy(100);
	}
	
	public String throwSomething(int energy) {
		this.processEnergy(energy);
		return "El gorila lanzó una piedra. ";
	}

	public String eatBananas(int energy) {
		this.processEnergy(energy);
		return "El gorilla come bananas. Y está Feliz!!!";
	}
	
	public String climb(int energy) {
		this.processEnergy(energy);
		return "El gorilla subió a un árbol. Ahora esta cansado";
	}
}
	