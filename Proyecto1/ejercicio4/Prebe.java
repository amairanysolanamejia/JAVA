/**
*La clase Prebe, hereda de Estudiante los atributos carrera, horasDeSuenio y nombre, así como el método abstracto hacerTarea, que tendrá que ser definido para esta clase.
*/
public class Prebe extends Estudiante{
	private int numeroPrebe;

/**
*El constructor de Prebe es un claro ejemplo de herencia. Recibe los mismos parámetros que el constructor de Estudiante y además añade el número de prebecario.
*/
	public Prebe(String carrera, int horasDeSuenio, String nombre,int numeroPrebe){
		super(carrera,horasDeSuenio,nombre);
		this.numeroPrebe = numeroPrebe;
	}

/**
*getNumPrebe es el getter del numero de prebecario de la clase Prebe.
*@return Numero de prebecario
*/
	public int getNumPrebe(){
		return numeroPrebe;
	}


/**
*Eĺ metodo hacer tarea es un ejemplo de polimorfismo,nos dice cómo se comporta un Prebe en este caso.
*/
	@Override
	public void hacerTarea(){
		System.out.println("Sufro, mi muñeca duele, paren el semestre, me quiero bajar!!!!");
	}
}