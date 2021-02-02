package cl.animales.mamiferos;

public class Mammal {

private int displayEnergy;
	

	public int getDisplayEnergy() {
		return displayEnergy;
	}

	public void setDisplayEnergy(int displayEnergy) {
		this.displayEnergy = displayEnergy;
	}
	
	public void processEnergy(int energy) {
		int level = this.getDisplayEnergy();
		level = energy + level;
		this.setDisplayEnergy(level);
		//System.out.println(level);
	}
}
