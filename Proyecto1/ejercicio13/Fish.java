/**
*Clase que implementa la interfaz "Animal" y sobreescribe el método de esta.
*/
public class Fish implements Animal {

	public void say(){ //nuevo método que implementa say para la clase Dog
		String nombreclase = this.getClass().getName();
		System.out.println(nombreclase + " go 'blub'.");
	}
}