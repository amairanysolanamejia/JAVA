/**
*"Alumno" es una interfaz que comparte 3 de los métodos más comunes entre los estudiantes, copiar, estudiar y dormir,
* los cuales van cambiadno de acuerdo a la carrera, que para este caso es Filosofia, Ingenieria y Contaduria,
* las cuales se encuentran en una clase cada una. Estas tres clases implementan esta interfaz.
* @author Casillas Muñoz, Diego Armando
* @author Solana Mejía, Haydee Amairany
*/
/**
*"Main" es la clase de prueba, donde se crean tres personas con diferentes nombres, las cuales implementan los métodos de cada clase a la que
* pertenecen.
*/

public class Main {
	public static void main(String[] args) {
		/**
		*Creación de objetos de las tres diferentes clases.
		*/
		AluFilosofia Teporocho = new AluFilosofia();
		AluIngenieria Friki = new AluIngenieria();
		AluContaduria Flojo = new AluContaduria();


		Teporocho.nombre("Teporocho");
		Teporocho.copiar();
		Teporocho.estudiar();
		Teporocho.dormir();
		System.out.println("/////////////////////////////////////////////////////////////////");
		System.out.println("");

		Friki.nombre("Friki");
		Friki.copiar();
		Friki.estudiar();
		Friki.dormir();
		System.out.println("/////////////////////////////////////////////////////////////////");
		System.out.println("");

		Flojo.nombre("Flojo");
		Flojo.copiar();
		Flojo.estudiar();
		Flojo.dormir();
		System.out.println("/////////////////////////////////////////////////////////////////");
	}
}