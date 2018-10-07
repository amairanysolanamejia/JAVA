

import java.util.Scanner;
/**
* @author Casillas, Diego
* @author Solana, Amairany
*En la clase "Fracciones" se permite reducir una fracción a su mínima expesiń posible.
*/
public class Fracciones {

	public static void main(String[] args) {
		int numerador,denominador, divisor, x, y, residuo;


		Scanner scan = new Scanner(System.in);
		System.out.println("Este programa te permitirá reducir tus fracciones a su mínima expresión (si es posible).");
		System.out.println("Dame el numerador de tu fracción. (El de arriba)");
		int uno = scan.nextInt(); //uno es el numerador de la fracción ingresada por el usuario
		System.out.println("Dame el denominador de tu fracción. (El de abajo)");
		int dos = scan.nextInt();//dos es el denominador de la fracción ingresada por el usuario
		System.out.println("La fracción ingresada fue: " + uno + "/" + dos);

		/**
		*Se necesita optener el minimo comun multiplo del denominador con respecto al numerador, por lo tanto
		*se obtiene el valor absoluto de estos.
		*Posterior a esto se divide el denominador entre el numerador y se considera el residual hasta que este sea 0.
		*/

     	x=Math.abs(dos); //Se obtiene el valor absoluto porque no afecta el signo en el mínimo común múltiplo
     	y=Math.abs(uno);
     	if (y ==0){
     		divisor = y; //si el numerador es cero, el vidisor es cero
     		//divisor es el mínimo común múltiplo, es decir, es el valor en el cual el numerador y el denominador se pueden dividir y siguen siendo
     		//enteros
     	}
     	while(y!=0){
          residuo=x%y;
          x=y;
          y=residuo;
     	}
     	divisor = x;
  		
  		 
     	
     	numerador = uno/divisor; //El numerador de la nueva fracción reducida es el valor del original entre el divisor obtenido 
     	denominador =dos/divisor;//El denominador de la nueva fracción reducida es el valor del original entre el divisor obtenido 
     	
		
	
			System.out.println("Fracción reducida: " + numerador + "/" + denominador);
		

	}

}
