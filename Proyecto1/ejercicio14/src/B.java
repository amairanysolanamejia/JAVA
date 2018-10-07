package a;
/**
* Clase B, heredera de A
*/
public class B extends A {

/**
*Para probar el acceso a los atributos, se intentó acceder uno por uno. EN el código fuente se encuentran los resultados, así como en la tabla en formato PDF hallada en la carpeta "ejercicio14"
*/
	public static void main(String[] args) {
		B pruebaB = new B();
		//System.out.println(pruebaB.att1); //prueba fallida, no hay acceso
		//System.out.println(pruebaB.att2); //prueba exitosa, es visible
		//System.out.println(pruebaB.att3); //prueba exitosa, se puede acceder
		//System.out.println(pruebaB.att4); //prueba exitosa, se puede acceder
	}
}