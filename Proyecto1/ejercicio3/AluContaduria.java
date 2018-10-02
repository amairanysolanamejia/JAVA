/**
*"Alumno" es una interfaz que comparte 3 de los métodos más comunes entre los estudiantes, copiar, estudiar y dormir,
* los cuales van cambiadno de acuerdo a la carrera, que para este caso es Filosofia, Ingenieria y Contaduria,
* las cuales se encuentran en una clase cada una. Estas tres clases implementan esta interfaz.
* @author Casillas Muñoz, Diego Armando
* @author Solana Mejía, Haydee Amairany
*/
/**
*"AluContaduria" es una clase que implementa la interfaz Alumno, para sobreescribir los métodos de esta.
*/

public class AluContaduria implements Alumno{
	String name;

	public void nombre(String name){
		System.out.println("Mi nombre es: " + name + ", estudio Contaduría, te cuento un poco sobre mi:");

	}
	public void copiar(){
		System.out.println("Yo sí copio, porque me la paso jugando ping pong. 7u7");
	}
	public void estudiar(){
		System.out.println("Yo no estudio porque me la paso en el gimnasio. ¬u¬");
	}
	public void dormir(){
		System.out.println("Yo no duermo, porque me la paso subiendo fotos a FB. :D");
	}


}