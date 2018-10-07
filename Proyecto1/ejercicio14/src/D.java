package b;
import a.A;

/**
*Clase D que hereda de A, pero además está en un paquete distinto del de A, por ello se debe importar a.A, d elo contrario no reconocerá la clase A.
*/
public class D extends A{

	/**
*Para probar el acceso a los atributos, se intentó acceder uno por uno. EN el código fuente se encuentran los resultados, así como en la tabla en formato PDF hallada en la carpeta "ejercicio14"
*/
	public static void main(String[] args) {
		D pruebaD = new D();
		//System.out.println(pruebaD.att1); //prueba fallida, no hay acceso
		//System.out.println(pruebaD.att2); //prueba exitosa, es visible
		//System.out.println(pruebaD.att3); //prueba exitosa, se puede acceder
		//System.out.println(pruebaD.att4); //prueba fallida, no se puede acceder
	}
}