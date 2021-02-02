
public class Project {
	private String nombre;
	private String descripcion;
	private Double initialCost = 0.0;
	
	//Constructor
	public Project() {
		this.nombre = "";
		this.descripcion= "";
		this.initialCost = 0.0;
	}
	
	public Project(String name) { 
		this.nombre = name;
		this.descripcion = "";
		this.initialCost = 0.0;
	}
	
	public Project(String name, String description, Double costo) {
		this.nombre = name;
		this.descripcion = description;
		this.initialCost = costo;
	}

	
	//Getters y Setters 
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Double getInitialCost() {
		return initialCost;
	}
	
	public void setInitialCost(Double initialCost) {
		this.initialCost = initialCost;
	}
	
	
	// Método  breve descripción deun proyecto
	public String breveDescription(){
		
		
		String descripcion = this.getDescripcion();
		descripcion  = descripcion.substring(0, descripcion.length()/8);
		String msg = descripcion + "\r\n";
		msg += this.elevatorPitch();
		return  msg;
	 }
	
	// Método ElevatorPitch  
	public String  elevatorPitch() {
		
		String nombre = this.nombre;
		String descripcion = this.descripcion;
		double costo = this.initialCost;
		
		return  nombre + "(" + costo + "):" + descripcion;
	}
	
}
