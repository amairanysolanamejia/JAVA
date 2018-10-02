/**
* Antílope es una clase hija de Hervíboro, la cual sobrecarga los métodos de la interfaz Animal.
*
**/

public class Antilope extends Herviboro{

	String comidafav, nombre, animalcome;//variables utilizadas en el contructor
	Antilope(String nombre,String comidafav, String animalcome){
		this.nombre= nombre;
		this.comidafav = comidafav;
		this.animalcome = animalcome;
		System.out.println("Soy un antílope, mi nombre es: " +nombre +" y mi comida favorita es:" + comidafav);
	}
	public void categoria(){
		System.out.println("Soy hervíboro");
	}

	public void jugar(){
		System.out.println("Soy un antílope juquetón");
	}

	public void comera(){
			System.out.println(" En realidad no como animales, pero se me antoja un " + animalcome + "\n");
	}
}
