
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

/**
*La clase Dados contiene un main de prueba que simula el tiro de un par de dados el numero de veces que el usuario indica. Posteriormente, imprime en pantalla un histograma.
*Entre mayor sea el numero de lanzamiento de los dados, mas se asemejara el histograma a una grafica convencional de distribucion normal.
*/
public class Dados{	
	public static void main(String[] args){
		ArrayList<Integer> resultados = new ArrayList<Integer>();
		int tiros;
		int contador = 0;
		System.out.println("¿Cuántas veces quieres tirar el dado?");
		Scanner sc = new Scanner(System.in);
		tiros = sc.nextInt();
		while (tiros>contador) {
				//
				int dado1 =	((int)(Math.random()*6)+1);
				int dado2 = ((int)(Math.random()*6)+1);
				resultados.add(dado2+dado1);
				//resultados.add(((int)(Math.random()*11)+2));
				contador++;
		}
		//ciclo d eprueba para verificar la asignación de 'resultados'
//		for (int i : resultados ) {

			//System.out.println(i);
			
		//}

		System.out.println("\n");

		ArrayList<Integer> contadores = new ArrayList<Integer>();
		contadores.add(0); //elemento 0->contador para 2
		contadores.add(0); //elemento 1->contador para 3
		contadores.add(0); //elemento 2->contador para 4
		contadores.add(0); //elemento 3->contador para 5
		contadores.add(0); //elemento 4->contador para 6
		contadores.add(0); //elemento 5->contador para 7
		contadores.add(0); //elemento 6->contador para 8
		contadores.add(0); //elemento 7->contador para 9
		contadores.add(0); //elemento 8->contador para 10
		contadores.add(0); //elemento 9->contador para 11
		contadores.add(0); //elemento 10->contador para 12


		for (int i : resultados) {
			contadores.set((i-2),((contadores.get(i-2))+1));
		}

		//Ciclo de prueba para verificar la asignación de valores en 'contadores'
//		for (int i : contadores ) {

			//System.out.println(i);
			
		//}

		int resultado = 2;

		System.out.println("++++++++HISTOGRAMA BEBÉ++++++++");

		for (int i : contadores) {
			System.out.print("Frecuencia del número "+resultado+"-->");
			int z = 0;
			while (z<i) {
				System.out.print("*");
				z++;
			}
			System.out.println("");
			resultado++;
		}

	}

}