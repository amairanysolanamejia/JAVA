import java.util.Scanner;

/**
*Clase Principal 
*@author: Casillas 
*@author: Solana
*/

public class BloquesAgua{

	/**
	*Método principal de la clase, en la que se ingresan los datos de elevacion y longitud.
	*/
	public static void main(String[] args){
	/**Definimos los atributos que usaremos en el programa*/
	Scanner sc = new Scanner(System.in);
	int suma=0;
	System.out.println("Dados n números enteros positivos, los cuales representan el nivel de elevación de una pared de ancho 1 en un mapa. ");
	System.out.println("Este programa calculará cuántos bloques de 1x1 podrán almacenar agua después de una lluvia.\n");
	System.out.print("Introduce la elevacion o altura del diagrama: ");
	int elevacion= sc.nextInt();
	System.out.print("Introduce la longitud del diagrama: ");
	int longitud= sc.nextInt();

	//Definimos los arreglos tanto para datos como para la imagen
	String[][] arr = new String[elevacion][longitud]; 
	int[]datos= new int [longitud];

	//Petición de datos	
	for(int i=0; i<longitud; i++){
		int j=i+1;
		System.out.print("Introduce los bloques apilados en la posición "+j+" (horizontalmete) ");
		datos[i] = sc.nextInt();
		
	}

	//Se recorre el arreglo para guardar  e imprimir cuando sea necesario los caracteres
	//X es muro o bloque y a es agua
	for(int p=0;p<longitud;p++){
		for(int r=0;r<elevacion;r++){
			if(datos[p]<elevacion-r){
				arr[r][p]=" ";
			}
			
			else{
				arr[r][p]="X";
			}
		}
	}

	//Se recorre el arreglo para guardar  e imprimir cuando sea necesario los caracteres
	//X es muro o bloque y a es agua
	for(int a=1; a<longitud; a++){ 
		for(int x=0;x<elevacion;x++){ 

		if(a!=1){ 
			if(arr[x][a]=="X"){ 

				
				int b=0;
				for(int g=a-1;g>=0;g--){
				
				if(b==0){
				if(arr[x][g]=="X"){
					for(int f=g+1; f<a;f++){
						arr[x][f]="a";
						suma++;
					}
					b=b+1;
				}

				}

				}
			
			}
		}
	}
}
	//Impresión en pantalla de los bloques con agua o con muro
	for(int k=0;k<elevacion;k++){
		System.out.print("\n\t | ");
		for(int m=0;m<longitud;m++){
			if(m==0){
					System.out.print("\t"+arr[k][m]);
					System.out.print("  ");
			} else{
			System.out.print(arr[k][m]);
			System.out.print("  ");
		}
	}

	}
	System.out.println("\n\n\nX = Bloques");
	System.out.println("a = Bloques de agua");
	System.out.println("Cantidad de bloques con agua: "+suma+"\n");


	}
}

