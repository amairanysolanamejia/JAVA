/**
* Cebra es una clase hija de Hervíboro, la cual sobrecarga los métodos de la interfaz Animal.
*
**/

public class Cebra extends Carnivoro{

	String comidafav, nombre, animalcome;//variables utilizadas en el contructor
	Cebra(String nombre,String comidafav, String animalcome){
		this.nombre =nombre;
		this.comidafav = comidafav;
		this.animalcome = animalcome;
		System.out.println("Soy un Cebra, mi nombre es: " +nombre +" y mi comida favorita es:" + comidafav);
	}
	public void categoria(){
		System.out.println("Soy hervíboro");
	}

	 public void jugar(){
		System.out.println("Soy un Cebra juguetón");
	}

	public void comera(){
			System.out.println("Yo sí me como a otros animales pero se me antoja un " + animalcome + "\n");
	}

}
