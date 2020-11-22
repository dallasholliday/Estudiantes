
	public class Estudiante extends Persona{
	String nombre;
	int edad;
	int numeroAsignaturas;
	
	public Estudiante(String numeroDeTelefono) {
		super(numeroDeTelefono);
	}
	
	public void printInformacionPersonal() {
		System.out.println("Nombre: "+nombre);
		System.out.println("Edad: "+edad);
		System.out.println("Teléfono: "+numeroDeTelefono);
	}
	
	public void printTodaLaInformacion() {
		this.printInformacionPersonal();
		System.out.println(numeroAsignaturas);
	}
}


