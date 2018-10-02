/**
*"Alumno" es una interfaz que comparte 3 de los métodos más comunes entre los estudiantes, copiar, estudiar y dormir,
* los cuales van cambiadno de acuerdo a la carrera, que para este caso es Filosofia, Ingenieria y Contaduria,
* las cuales se encuentran en una clase cada una. Estas tres clases implementan esta interfaz.
* @author Casillas Muñoz, Diego Armando
* @author Solana Mejía, Haydee Amairany
*/

/**
*"AluIngenieria" es una clase que implementa la interfaz Alumno, para sobreescribir los métodos de esta.
*/

public class AluIngenieria implements Alumno{
	String name;

	public void nombre(String name){
		System.out.println("Mi nombre es: " + name + ", estudio Filosofía, te cuento un poco sobre mi:");

	}

	public void copiar(){
		System.out.println("Yo sí copio, a veces, la mayoría de las veces. :(");
	}
	public void estudiar(){
		System.out.println("Yo sí estudio, mucho, pero aún así repruebo. ¬¬");
	}
	public void dormir(){
		System.out.println("No duermo, ¿No ves mis ojeras de mapache?. 0.0");
	}


}