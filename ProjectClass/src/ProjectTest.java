
public class ProjectTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Almacen de proyectos
		Portfolio portfolio = new Portfolio();

		// Creo un proyecto nuevo Vacío
		Project proyecto1 = new Project();
		// Guardo el proyecto como project en portfolio
		portfolio.setProyectos(proyecto1);

		// Creo un proyecto solo con su nombre
		Project proyecto2 = new Project("Proyecto 123");
		portfolio.setProyectos(proyecto2);

		// Creo un nuevo proyecto con nombre ,descripción y costo
		Project proyecto3 = new Project("Proyecto ABC",
				"Lorem Ipsum is simply dummy text of the printing and typesetting "
						+ "industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer "
						+ "took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, "
						+ "but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s "
						+ "with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software "
						+ "like Aldus PageMaker including versions of Lorem Ipsum.",
				10000000.0);
		portfolio.setProyectos(proyecto3);

		// Busco el proyecto proyecto1
		// String proyecto = portfolio.getProyectos(proyecto1);
		// System.out.println(proyecto);

		String todosProyectos = portfolio.showPortfolio();
		System.out.println(todosProyectos);

		// Proyecto 1
		System.out.println("Set Proyecto 1");

		proyecto1.setNombre("Proyecto Relojes");
		proyecto1.setDescripcion("Lorem Ipsum aqwedswqasw asa as a s as a s as  qww qw a s a ");
		proyecto1.setInitialCost(10000000.0);

		System.out.println("Fin Set Proyecto 1");

		// Muestra Todos los Proyectos
		todosProyectos = portfolio.showPortfolio();
		System.out.println(todosProyectos);

		// Proyecto 3
		System.out.println("Get Proyecto 3 Breve Descripción");
		System.out.println("Nombre: " + proyecto3.getNombre());
		System.out.println("Breve descripción: " + proyecto3.breveDescription());

		// Costo total de proyectos
		Double CostoTotal = portfolio.getPortfolioCost();
		System.out.println("Valorización de Todos los Proyectos: " + CostoTotal);

		// Proyecto 2
		System.out.println("Set Proyecto 2");
		proyecto2.setDescripcion("Lorem Ipsum aqwedswqasw ");
		proyecto2.setInitialCost(5000000.0);
		System.out.println("Fin Set Proyecto 2");

		// Costo total de proyectos
		CostoTotal = portfolio.getPortfolioCost();
		System.out.println("Valorización de Todos los Proyectos: " + CostoTotal);

		// Muestra Todos los Proyectos
		todosProyectos = portfolio.showPortfolio();
		System.out.println(todosProyectos);

	}

}
