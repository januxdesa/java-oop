import java.util.ArrayList;

public class Portfolio {

	ArrayList<Project> proyectos = new ArrayList<Project>();

	public String getProyectos(Project project) {
		String msg;
		msg = "";
		for (Project proyecto : proyectos) {

			if (project.equals(proyecto)) {
				
				if (proyecto.getNombre().equals("")) {
					msg += " Nombre : AÚN SIN NOMBRE \r\n";	
				}
				else
				{
					msg += " Nombre : " + proyecto.getNombre() + "\r\n";
				}
				
				
				if (proyecto.getDescripcion().equals("")) {
					msg += " Nombre : AÚN SIN DESCRIPCIÓN \r\n";	
				}
				else
				{
					msg += " Descripción: " + proyecto.getDescripcion();
				}
				
				
				
			}
		}
		return msg;
	}

	public void setProyectos(Project project) {
		this.proyectos.add(project);
	}

	public String showPortfolio() {
		String msg;
		msg = "PORTFOLIO DE PROYECTOS \r\n";
		msg += "---------------\r\n";
		msg += "Id | nombre | Descripción \r\n";

		int c = 0;
		for (Project proyecto : proyectos) {

			msg += c + " |" +proyecto.getNombre() + "("+proyecto.getInitialCost()+")" + ":" + proyecto.getDescripcion();
			msg += "\r\n";
			c++;
		}
		
		msg += "Costo Total PortFolio: " + this.getPortfolioCost();
		return msg;
	}
	
	public double getPortfolioCost() {
		
		double costoTotal = 0.0;
		for (Project proyecto : proyectos) {

			costoTotal += proyecto.getInitialCost();
			
		}
		return costoTotal;
	}

}
