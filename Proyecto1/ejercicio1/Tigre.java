/**
* Tigre es una clase hija de Carnívoro, la cual sobrecarga los métodos de la interfaz Animal.
*
**/

public class Tigre extends Carnivoro{

	String comidafav, nombre, animalcome; //variables utilizadas en el contructor
	Tigre(String nombre,String comidafav, String animalcome){ //constructor
		this.nombre =nombre;
		this.comidafav = comidafav;
		this.animalcome = animalcome;
		System.out.println("\nSoy un tigre, mi nombre es: " +nombre +" y mi comida favorita es:" + comidafav	);
	}

	public void categoria(){ 
		System.out.println("Soy carnívoro");
	}

	public void jugar(){
		System.out.println("Yo juego con mis amiguitos carnívoros del ecosistema donde vivo. ");
	}

	public void comera(){
			System.out.println("Se me antoja comerme un " + animalcome + "\n");
		}
	

}
