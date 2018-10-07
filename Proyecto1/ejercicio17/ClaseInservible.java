/**
*Clase inservible es privada y sus atributos estaticos, por lo tanto no es posible que en la clase de prueba se pueda heredar 
*/

private class ClaseInservible { //ClaseInservible, heredada de Object, ya que mientras no sea especificado, se hereda de este.
	private final static String uso; //final static significa que esta variable es una constante y solo se asocia con la clase misma.
	private final static int tamano; 
	private final static String color;
/**
*Método que recibe distintos parametros.
*/

	private ClaseInservible (String uso, int tamano, String color){ //constructor de la ClaseInservible
		this.uso = uso;//ell constructor no lleva void porque es especial.
		this.tamano = tamano;
		this.color = color;
	}
/**
*Método que imprime los parametros ingresados en el anterior método .
*/
	public String toString(){
		return "Uso" + this.uso + "\n tamaño" + this.tamano + "color"+this.color;
	}

	
}
