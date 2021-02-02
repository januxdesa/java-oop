package cl.animales.mamiferos.voladores;

import cl.animales.mamiferos.Mammal;

public class Bat extends Mammal {

	public Bat() {
		this.setDisplayEnergy(300);
	}
	
	/* Crear una clase Bat que tenga un método fly(), eatHumans() y attackTown() y que tenga un nivel predeterminado de energía de 300.
	Para el método fly(), mostrar el sonido que hace el Bat al despegar y disminuir su nivel de energía en 50.
	Para el método eatHumans(), Imprimir “bueno, no importa” e incrementar su nivel de energía en 25.
	Para el método attackTown(), mostar en pantalla el sonido de la ciudad en llamas y disminuir su nivel de energía en 100.
	Crear la clase BatTest para instanciar a Bat y hacer que ataque la ciudad tres veces, como dos humanos y vuele dos veces. */
	
	
	public String fly(int energy) {
		//java.awt.Toolkit.getDefaultToolkit().beep(); 
		//System.out.println("\007");
		this.processEnergy(energy);
		return "Beep Beep ";
	}
	
	public String eatHumans(int energy) {
		this.processEnergy(energy);
		return "bueno, no importa";
	}
	
	public String attackTown(int energy) {
		this.processEnergy(energy);
		return "Sonido ciudad en llamas";
	}
	
}
