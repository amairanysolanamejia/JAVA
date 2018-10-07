/**
*Clase inservible es privada y sus atributos estaticos, por lo tanto no es posible que esta clase pueda implemetarlos
*/
public class ClasePrueba extends ClaseInservible{
	public String prueba;
/**
*Método de ClaseInservible para ingresar diferentes parámetros.
*/
	public ClasePrueba (String uso, int tamano, String color, String prueba){ //Se ponen las variables arriba y abajo para que sepa de donde
		super(uso, tamano, color);
		this.prueba = prueba;
	}

	public String toString(){
		return "Uso" + this.uso + "\n tamaño" + this.tamano + "color"+this.color + "prueba" + this.prueba;
	}
}
