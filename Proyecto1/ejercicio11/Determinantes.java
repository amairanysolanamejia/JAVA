import java.util.Scanner;
public class Determinantes{
/**
* @author Casillas, Diego
* @author Solana, Amairany
*El programa permite obtener el determinante de una matriz.
*Pide al usuario los elementos de dicha matriz y dependiendo de la "n" elegida cambia la manera de calcularlo.
*/
	static void MatDet(int ene){
		Scanner sc = new Scanner(System.in);
		int determiante;
		int [][] matriz = new int[ene][ene];
		System.out.println("Ingresa elemento por elemento de tu matriz");
		for(int m = 0; m<ene; m++){
			for(int n = 0; n<ene; n++){
				int datos = sc.nextInt();
				matriz [m][n] = datos;

			}
		}

		System.out.println("Matriz ingresada:\n");
		for(int m = 0; m<ene; m++){
			for(int n = 0; n<ene; n++){
				System.out.print(matriz [m][n] + " "); 

			}
			System.out.println("");
		}

		if(ene == 2){
			determiante = matriz [0][0] * matriz[1][1] - matriz [0][1] * matriz [1][0];
			System.out.println("Determinante: " + determiante);
		}
		if(ene == 3){
			determiante = (matriz [0][0] * matriz[1][1] * matriz [2][2] + matriz [0][1] * matriz [1][2] * matriz[2][0] + 
						  matriz [0][2] * matriz[1][0] * matriz [2][1] - matriz[0][2] * matriz [1][1] * matriz [2][0] -
						  matriz [0][0] * matriz[1][2] * matriz [2][1] - matriz [0][1] * matriz [1][0] * matriz[2][2]) ;
			System.out.println("Determinante: " + determiante);
		}


	}

/**
*Clase que implementa el metodo MatDet dependiendo de la eleccion del usuario, dandole como parametro el "n" de la matriz.
*/
	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		System.out.println("Este progarma te permitirá determinar el determinante de una matriz nxn. Elige una opción");
		System.out.println("\n1.-1 x 1 \n2.-2 x 2 \n3.-3 x 3 \n4.-n x n");
		int opcion = sca.nextInt();
		switch(opcion){
			case 1 :

				System.out.println("Ingresa el dato: ");
				int a = sca.nextInt();
				System.out.println("Dato ingresado: " + a);
				int adet = Math.abs(a);
				System.out.println("Determinante: " + adet);
				break;
			case 2 :
				MatDet(opcion);
				
				break;
			case 3:
				MatDet(opcion);
				break;
			case 4 :
				int opciones = sca.nextInt();
				MatDet(opciones);
				break;

		}
		
	}
}