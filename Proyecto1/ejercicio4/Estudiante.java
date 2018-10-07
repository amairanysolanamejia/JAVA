/**
*La clase Estudiante representa un estudiante. Estudia cierta carrera, duerme determinado numero de horas, tiene nombre y a veces es prebecario del PROTECO.
*La abstracción está presente aquí al describir al estudiante mediante sus características.
*También, al hacer inaccesibles para el exterior sus atributos, la clase implementa el encapsulamiento.
*/
public abstract class Estudiante{
	private String carrera;
	private int horasDeSuenio;
	private String nombre;

/**
*El constructor de Estudiante recibe como parámetros: (String carrera,int horasdesuenio, String nombre)
*/
	public Estudiante(String carrera, int horasDeSuenio, String nombre){
		this.carrera = carrera;
		this.horasDeSuenio = horasDeSuenio;
		this.nombre = nombre;
	}

/**
*El polimorfismo se ve expresado con el metodo abstracto hacerTarea(), que describe la manera en que cada estudiante hace tarea.
*/
	public abstract void hacerTarea();

	public String toString(){
		return "Soy "+nombre+", estudio "+carrera+" y duermo "+horasDeSuenio+" horas.";
	}
}