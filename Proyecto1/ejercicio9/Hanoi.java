
import java.util.Scanner;
/**
*Juego Torres de Hanoi
*@author Casillas
*@author Solana
*/

/**
*Clase de prueba que pude al usuario un número, el cual representa la cantidad de discos a utilizar.
*/
public class Hanoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int discos;
        System.out.println("Juego de las Torres de Hanoi,\n 1 es la torre origen,\n 2 es la torre auxiliar o intermedio,\n 3 es la torre destino.\n");
        System.out.println("¿Que empiece el juego!\n");
        System.out.println("Numero de discos que deseas: ");
        discos = sc.nextInt();
        mover(discos,1,2,3);  //1:A  2:B 3:C
    }
/**
*Clase que permite hacer el método recursivo, con tal de que la cantidad de discos se reduzca a 1.
*Siendo igual a uno sólo se mueve el disco de A al disco de C, pero mientras no lo sea se repide.
*A es la torre de origen.
*B es la torre intemedia.
*C es la torre de destino.
*/ 
public static void mover(int discos, int A,  int B, int C){
  if(discos==1)
  System.out.println("mover disco de " + A + " a " + C);
  else{
     mover(discos-1, A, C, B);
     System.out.println("mover disco de "+ A + " a " + C);
     mover(discos-1, B, A, C);
   }
 }
}




