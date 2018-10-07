package a;

/**
*Clase A, contiene cuatro atributos con los cuatro modificadores de acceso existentes
*/
public class A{
	private int att1 = 1;
	public int att2 = 2;
	protected int att3 = 3;
	int att4 = 4;

/**
*Para probar el acceso a los atributos, se intentó acceder uno por uno. EN el código fuente se encuentran los resultados, así como en la tabla en formato PDF hallada en la carpeta "ejercicio14"
*/
	public static void main(String[] args) {
		A pruebaA = new A();
		//System.out.println(pruebaA.att1); //Prueba exitosa, att1 visible.
		//System.out.println(pruebaA.att2); //Prueba exitosa, att2 visible.
		//System.out.println(pruebaA.att3); //Prueba exitosa, att3 visible.
		//System.out.println(pruebaA.att4); //Prueba exitosa, att4 visible.
	}
}