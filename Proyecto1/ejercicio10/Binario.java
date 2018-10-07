import java.util.Scanner;
import java.util.ArrayList;

/**
*La clase Binario sirve para dar solucion al ejercicio 10 del proyecto 1 de Java. La clase posee tres ArrayList que contienen numeros, sus correspondientes expresiones binarias y el numero de unos que contienen dichas expresiones.
*Ademas, hay dos metodos utiles al momento de hacer la clase de prueba y cumplir el objetivo propuesto.
*/
public class Binario{
	ArrayList<Integer> numeros = new ArrayList<Integer>();
	ArrayList<String> binarios = new ArrayList<String>();
	ArrayList<Integer> contUnos = new ArrayList<Integer>();

/**
*El metodo ContadorDeUnos hace eso, contar la cantidad de caracteres "1" en una cadena.
*Recibe como argumento una cadena.
*@return Un entero (numero de veces que se repite un "1" en la cadena proporcionada como argumento)
*/
	public static Integer ContadorDeUnos(String palabra){
		int cont1 = 0;
		int cont = 0;
		String uno = "1";
		while (cont < palabra.length()) {
			if (palabra.charAt(cont) == uno.charAt(0)){
				cont1++;
			}
			cont++;
		}
		return cont1;
	}

/**
*EL metodo Maximo recibe como parametro una ArrayList de Integer.
*@return El valor de mayor denominacion en el ArrayList proporcionado.
*/
	public static Integer Maximo(ArrayList<Integer> arraylist){
		int max = 0;
        for (int i = 0; i < arraylist.size(); i++) {
            if (arraylist.get(i) > max) {
                max = arraylist.get(i);
            }
        }
        return max;
	}

/**
*Clase de prueba. Recibe una serie de numeros, posteriormente imprime en pantalla la lista de numeros ingresados, su correspondencia binaria y los numeros binarios organizados segun su cantidad de 1's.
*/
	public static void main(String[] args) {
		Binario pruebaBinario = new Binario();
		Boolean salida = true;
		System.out.println("¿Cuántos números vas a proporcionar en tu lista?");
		Scanner sc = new Scanner(System.in);
		int contador =1;
		int longitud = sc.nextInt();
		while (contador <= longitud) {
			System.out.println("Proporciona el elemento "+contador);
			pruebaBinario.numeros.add(sc.nextInt());
			contador++;
		}

		for (Integer i : pruebaBinario.numeros) {
			pruebaBinario.binarios.add(Integer.toBinaryString(i));
		}

		int x = 0;
		while(x < pruebaBinario.binarios.size()){
			pruebaBinario.contUnos.add(ContadorDeUnos(pruebaBinario.binarios.get(x)));
			x++;
		}
		
		x = Maximo(pruebaBinario.contUnos);
		System.out.println("\nLos números que proporcionaste son:");
		System.out.println(pruebaBinario.numeros);
		System.out.println("Sus expresiones binarias correspondientes son:");
		System.out.println(pruebaBinario.binarios);
		System.out.println("Binarios organizados según su cantidad de 1's:\n");

		int organizador = 1;

		while (organizador<=x) {
			System.out.println("Binarios con "+organizador+" 1's:");
			for (int i = 0; i<pruebaBinario.binarios.size();i++) {
				if (pruebaBinario.contUnos.get(i) == organizador) {
					System.out.print("-->");
					System.out.println(pruebaBinario.binarios.get(i));	
				}
			}
			System.out.println("\n");
			organizador++;
		}
	}
}