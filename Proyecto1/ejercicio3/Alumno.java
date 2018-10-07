/**
*"Alumno" es una interfaz que comparte 3 de los métodos más comunes entre los estudiantes, copiar, estudiar y dormir,
* los cuales van cambiadno de acuerdo a la carrera, que para este caso es Filosofia, Ingenieria y Contaduria,
* las cuales se encuentran en una clase cada una. Estas tres clases implementan esta interfaz.
* @author Casillas Muñoz, Diego Armando
* @author Solana Mejía, Haydee Amairany
*/
//javadoc -d cartenahtlm archivo.java
public interface Alumno{
	/**
	*Método cabstracto: copiar, para cada alumno de las diferentes facultades será distinto.
	*/

	public void copiar(); // método abstracto
	/**
	*Método cabstracto: estudiar, para cada alumno de las diferentes facultades será distinto.
	*/ 
	public void estudiar(); //método abstracto 
	/**
	*Método cabstracto: dormir, para cada alumno de las diferentes facultades será distinto.
	*/
	public void dormir(); //método abtracto



}
