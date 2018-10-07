/**
*Case Ave que hereda de Animal.
*/
public class Ave extends Animal {
	int numeroDeAlas; //atributo añadido
/**
*Metodo constructor de Ave
*/
	public Ave(int tamano,String color, String colorOjos,String nombre,int numeroDeAlas){
		super(new Plumas(), tamano, color,new Ojos(colorOjos,2),nombre);//el dos, es una contstante, número de ojos
		this.numeroDeAlas = numeroDeAlas;
	}
/**
*Metodo hecho en clase, describe como avanza una Ave
*/
	public void avanzar(){
		System.out.println("No estoy volando, estoy cayendo con estilo.");
	}

/**
*Metodo aniadido por mi para la familia de las aves. Es bien sabido por todos que es algo muy habitual entre las aves.
*/
	public void chocarConVentanasTransparentes(){
		System.out.println("Olovorgo, no vi la ventana y choqué UwU");
	}

	/**
*Sobreescritura del método toString para las aves.
*/
	public String toString(){
		return "Piel: "+this.piel+"\nTamaño: "+this.tamano+"\nColor: "+this.color+"\nOjos: "+this.ojos+"\nNombre: "+this.nombre+"\nNúmero de alas: "+this.numeroDeAlas;
	}


/**
*Metodo equals(Object o) para Ave
*/
	public boolean equals(Object o){
		if (!(o instanceof Ave)){
			return false;
		} 	
		Ave animalito = (Ave)o;
		return this.piel.equals(animalito.piel)&&this.tamano == animalito.tamano &&this.color.equals(animalito.color)&&this.ojos.equals(animalito.ojos)&&this.nombre.equals(animalito.nombre)&&this.numeroDeAlas==animalito.numeroDeAlas;
	}

}