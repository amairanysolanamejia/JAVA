/**
* Leon es una clase hija de Carnívoro, la cual sobrecarga los métodos de la interfaz Animal.
*
**/

public class Leon extends Carnivoro{

	String comidafav, nombre, animalcome;//variables utilizadas en el contructor
	Leon(String nombre,String comidafav, String animalcome){
		this.nombre =nombre;
		this.comidafav = comidafav;
		this.animalcome = animalcome;
		System.out.println("Soy un León, mi nombre es: " +nombre +" y mi comida favorita es:" + comidafav);
	}
	public void categoria(){
		System.out.println("Soy carnívoro");
	}

	 public void jugar(){
		System.out.println("Soy un León juguetón");
	}

	public void comera(){
			System.out.println("Yo sí me como a otros animales pero se me antoja un " + animalcome + "\n");
	}

}
