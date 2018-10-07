import java.util.Scanner;

/**
*La clase Gato posee las variables y los métodos necesarios para jugar gato en la consola.
*/
public class Gato{
	private static String lineaUno = "   |   |   ";
	private static String lineaDiv = "-----------" ;//cambiar a final
	private static String lineaDos = "   |   |   ";
	private static String lineaTre = "   |   |   ";
	private static boolean salida = true;
	private static int turno;

/**
*El metodo imprimirGato simplemente imprime en pantalla el gato:
*  |  |
*--------
*  |  |
*--------
*  |  |
*/
	public static void imprimirGato(){
		System.out.println(lineaUno);
		System.out.println(lineaDiv);
		System.out.println(lineaDos);
		System.out.println(lineaDiv);
		System.out.println(lineaTre);
	}

/**
*El metodo escribirGato sirve para sobreescribir las cadenas que le dan forma al gato. Recibe como argumento un entero (posicion de la marca del jugador) y un caracer ('X' o 'O')
*/
	public static void escribirGato(int a, char x){
		switch (a) {
			case 1:
				if (lineaUno.charAt(1) == ' ') {
					lineaUno =lineaUno.substring(0,1)+x+lineaUno.substring(2);
				}
				else{System.out.println("Lo siento, tu tiro no puede realizarse en esa posición!\nPor descuidado se reiniciará el juego muajaja.\n");
				System.exit(0);}		
				break;
			case 2:
				if (lineaUno.charAt(5) == ' ') {
					lineaUno =lineaUno.substring(0,5)+x+lineaUno.substring(6);
				}
				else{System.out.println("Lo siento, tu tiro no puede realizarse en esa posición!\nPor descuidado se reiniciará el juego muajaja.\n");
				System.exit(0);}
				break;
			case 3:
				if (lineaUno.charAt(9) == ' ') {
					lineaUno = lineaUno.substring(0,9)+x+lineaUno.substring(10);
				}
				else{System.out.println("Lo siento, tu tiro no puede realizarse en esa posición!\nPor descuidado se reiniciará el juego muajaja.\n");
				System.exit(0);}
				break;
			case 4:
				if (lineaDos.charAt(1) == ' ') {
					lineaDos = lineaDos.substring(0,1)+x+lineaDos.substring(2);
				}				
				else{System.out.println("Lo siento, tu tiro no puede realizarse en esa posición!\nPor descuidado se reiniciará el juego muajaja.\n");
				System.exit(0);}
				break;
			case 5:
				if (lineaDos.charAt(5) == ' ') {
					lineaDos = lineaDos.substring(0,5)+x+lineaDos.substring(6);
				}				
				else{System.out.println("Lo siento, tu tiro no puede realizarse en esa posición!\nPor descuidado se reiniciará el juego muajaja.\n");
				System.exit(0);}
				break;
			case 6:
				if (lineaDos.charAt(9) == ' ') {
					lineaDos = lineaDos.substring(0,9)+x+lineaDos.substring(10);
				}				
				else{System.out.println("Lo siento, tu tiro no puede realizarse en esa posición!\nPor descuidado se reiniciará el juego muajaja.\n");
				System.exit(0);}
				break;
			case 7:
				if (lineaTre.charAt(1) == ' ') {
					lineaTre = lineaTre.substring(0,1)+x+lineaTre.substring(2);
				}				
				else{System.out.println("Lo siento, tu tiro no puede realizarse en esa posición!\nPor descuidado se reiniciará el juego muajaja.\n");
				System.exit(0);}
				break;
			case 8:
				if (lineaTre.charAt(5) == ' ') {
					lineaTre = lineaTre.substring(0,5)+x+lineaTre.substring(6);
				}				
				else{System.out.println("Lo siento, tu tiro no puede realizarse en esa posición!\nPor descuidado se reiniciará el juego muajaja.\n");
				System.exit(0);}
				break;
			case 9:
				if (lineaTre.charAt(9) == ' ') {
					lineaTre =lineaTre.substring(0,9)+x+lineaTre.substring(10);
				}				
				else{System.out.println("Lo siento, tu tiro no puede realizarse en esa posición!\nPor descuidado se reiniciará el juego muajaja.\n");
				System.exit(0);}
				break;
		}
	}

/**
*Metodo para verificar que se han juntado las 3 marcas necesarias para que haya un ganador en el juego.
*/
	public static void verificarGanador(char c){
		if (lineaUno.charAt(1) == c && lineaUno.charAt(5) ==c &&  lineaUno.charAt(9) == c) {
			System.out.println("¡Parece que hay un ganador!");
			salida = false;
			System.exit(0);
		}
		else if (lineaUno.charAt(1) == c && lineaDos.charAt(5) == c  && lineaTre.charAt(9) == c) {
			System.out.println("¡Parece que hay un ganador!");
			salida = false;
			System.exit(0);
		}
		else if (lineaUno.charAt(9) == c && lineaDos.charAt(5) == c && lineaTre.charAt(1) == c) {
			System.out.println("¡Parece que hay un ganador!");
			salida = false;
			System.exit(0);
		}
		else if (lineaDos.charAt(1) == c && lineaDos.charAt(5) == c  && lineaDos.charAt(9) == c) {
			System.out.println("¡Parece que hay un ganador!");
			salida = false;
			System.exit(0);
		}
		else if (lineaTre.charAt(1) == c && lineaTre.charAt(5) == c && lineaTre.charAt(9) == c) {
			System.out.println("¡Parece que hay un ganador!");
			salida = false;
			System.exit(0);
		}
		else if (lineaUno.charAt(1) == c && lineaDos.charAt(1) == c && lineaTre.charAt(1) == c) {
			System.out.println("¡Parece que hay un ganador!");
			salida = false;
			System.exit(0);
		}
		else if (lineaUno.charAt(5) == c && lineaDos.charAt(5) == c && lineaTre.charAt(5) == c) {
			System.out.println("¡Parece que hay un ganador!");
			salida = false;
			System.exit(0);
		}
		else if (lineaUno.charAt(9) == c && lineaDos.charAt(9) == c && lineaTre.charAt(9) == c) {
			System.out.println("¡Parece que hay un ganador!");
			salida = false;
			System.exit(0);
		}
	}

/**
*Basta con ejecutar este metodo estatico para poder jugar gato:
*	public static void main(String[] args) {
*		jugarGato();
*	}
*/
	public static void jugarGato(){
		System.out.println("¡Bienvenido al juego del gato!\n");
		System.out.println("Cada turno te pediré la posición de tu marca,\nusa como referencia un teclado de teléfono.\nEs decir:\n");
		System.out.println(" 1 | 2 | 3\n"+lineaDiv+"\n 4 | 5 | 6\n"+lineaDiv+"\n 7 | 8 | 9\n");

		Scanner sc = new Scanner(System.in);
		imprimirGato();

		while (salida) {
			//para el jugador 1			
			System.out.println("Jugador 1, ingrese posición de su marca: ");
			escribirGato(sc.nextInt(),'X');
			imprimirGato();
			verificarGanador('X');			
			//para el jugador 2			
			System.out.println("Jugador 2, ingrese posición de su marca: ");
			escribirGato(sc.nextInt(),'O');
			imprimirGato();
			verificarGanador('O');			
		}	
	}

/**
*Metodo de prueba para el gato. 
*/
	public static void main(String[] args) {
		jugarGato();
	}


}