public class Elephant implements Animal {

	public void say(){ //nuevo método que implementa say para la clase Dog
		String nombreclase = this.getClass().getName();
		System.out.println(nombreclase + " goes 'toot'.");
	}
}