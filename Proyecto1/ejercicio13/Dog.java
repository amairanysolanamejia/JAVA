//extiende de animal y sobreescribe el método de la interfaz
/**
*Clase que implementa la interfaz "Animal" y sobreescribe el método de esta.
*/
public class Dog implements Animal {

	public void say(){ //nuevo método que implementa say para la clase Dog
		String nombreclase = this.getClass().getName();
		System.out.println(nombreclase + " goes 'woof'.");
	}
}