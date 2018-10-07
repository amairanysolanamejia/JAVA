import java.util.ArrayList;
import java.util.Scanner;

	/**
	*La clase Prebemart sirve para inicializar los ArrayList necesarios para ir de compras,
	*uno de ellos contiene los productos y otro los precios. Tanto precios como productos son
	*aniadidos por el usuario. Igualmente, contiene los metodos necesarios para poder "ir de 
	*compras".
	*/
public class Prebemart{
	private static ArrayList<String> productos = new ArrayList<String>();
	private static ArrayList<Double> precios = new ArrayList<Double>();

	/**
	*Sirve pedir los productos, pide el producto y lo añade a la ArrayList correspondiente.
	*/
	public void pedirProducto(){
		System.out.print("Ingresa el nombre de tu producto: ");
		Scanner sc = new Scanner(System.in);
		productos.add(sc.nextLine());
		System.out.println("");
	}

	/**
	*Sirve pedir los precios, pide el precio y lo aniade a la ArrayList correspondiente.
	*/
	public void pedirPrecio(){
		System.out.print("Ingresa el precio de tu producto: ");
		Scanner sc = new Scanner(System.in);
		precios.add(sc.nextDouble());
		System.out.println("");
	}

	/**
	*Este metodo suma los valores del ArrayList que contiene los precios de los productos a comprar.
	*@return La suma de los elementos del ArrayList que contiene los precios.
	*/
	public Double suma(){
		double n = 0;
 		for (int i = 0; i < precios.size(); i++) {
 			n += Double.parseDouble(precios.get(i).toString());
 		}
 		Double suma = n;
 		return suma;
	}

	/**
	*Este metodo elimina el elemento indicado por el usuario de la lista de compras.
	*/
	public void eliminarElemento(Prebemart pruebaPrebemart){
		System.out.print("Proporciona el número de elemento que quieres eliminar: ");
		Scanner eliminarnumero = new Scanner(System.in);
		int indiceadios = eliminarnumero.nextInt();
		pruebaPrebemart.productos.remove(indiceadios - 1);
		pruebaPrebemart.precios.remove(indiceadios - 1);
	}

	/**
	*main de prueba para mostrar la funcionalidad de la clase Prebemart, segun los lineamientos
	*indicados en el proyecto 1 de Java PROTECO.
	*/
	public static void main(String[] args) {
		Prebemart pruebaPrebemart = new Prebemart();
		Boolean salida = true;
		while (salida) {
			System.out.println("Hola, usuario. ¿Qué acción deseas realizar?");
			System.out.println("1. Añadir producto y precio.\n2. Ver tu lista de productos.\n3. Pagar la cuenta.\n4. Descartar producto.\n5. Salir.\n");
			Scanner decision = new Scanner(System.in);
			int caso = decision.nextInt();
			switch (caso){
				case 1:
					pruebaPrebemart.pedirProducto();
					pruebaPrebemart.pedirPrecio();
					break;
				case 2:
					for (int i = 0;i < productos.size();i++ ) {
						System.out.print((i+1)+".- Producto: "+productos.get(i)+" <-->"+" Precio: "+precios.get(i));
						System.out.println("\n");
					}
					break;
				case 3:
					if (pruebaPrebemart.suma() <= 500) {
						System.out.println("Gracias por tu compra!!!");
						System.out.println("Compra total: $"+pruebaPrebemart.suma());
						salida = false;
					} else {
						System.out.println("No te alcanza el dinero, deberías descartar algo de tu lista de compras!\n");
						for (int i = 0;i < productos.size();i++ ) {
							System.out.print((i+1)+".- Producto: "+productos.get(i)+" <-->"+" Precio: "+precios.get(i));
							System.out.println("\n");
						}
						pruebaPrebemart.eliminarElemento(pruebaPrebemart);
						System.out.println("");
					}
					break;
				case 4:
					pruebaPrebemart.eliminarElemento(pruebaPrebemart);
					System.out.println("");
					break;
				case 5:
					salida = false;
			}
		}
	}
}