import java.util.ArrayList;
import java.util.Scanner;

	/**
	*La clase AgendaPrrona sirve para inicializar los ArrayList necesarios para una agenda,
	*uno de ellos contiene los nombres, telefonos y otro los nombres de las mascotas. Todos estos parametros son
	*aniadidos por el usuario. Igualmente, contiene los metodos necesarios para poder agregar contactos, buscar 
	*contactos especificos, vaciar la agenda, ver los contactos y eliminar un contacto.
	*/
public class AgendaPrrona{
	private static ArrayList<String> nombres = new ArrayList<String>();
	private static ArrayList<String> telefonos = new ArrayList<String>();
	private static ArrayList<String> mascotas = new ArrayList<String>();

	/**
	*Sirve pedir los nombres del contacto y aniadirlo a la ArrayList correspondiente.
	*/
	public void pedirNombre(){
		System.out.print("Ingresa el nombre del contacto: ");
		Scanner sc = new Scanner(System.in);
		nombres.add(sc.nextLine());
		System.out.println("");
	}

	/**
	*Sirve pedir el telefono, pide el numero y lo aniade a la ArrayList correspondiente.
	*/
	public void pedirTelefono(){
		System.out.print("Ingresa el telefono de tu contacto: ");
		Scanner sc = new Scanner(System.in);
		telefonos.add(sc.nextLine());
		System.out.println("");
	}


/**
*Este  metodo sirve para pedir la mascota de un contacto.
*/
	public void pedirMascota(){
		System.out.print("Ingresa el nombre de la mascota de tu contacto: ");
		Scanner sc = new Scanner(System.in);
		mascotas.add(sc.nextLine());
		System.out.println("");
	}

	/**
	*Este metodo elimina el elemento indicado por el usuario de la agenda.
	*/
	public void eliminarElemento(AgendaPrrona pruebaAgendaPrrona){
		System.out.print("Proporciona el número de contacto que quieres eliminar: ");
		Scanner eliminarnumero = new Scanner(System.in);
		int indiceadios = eliminarnumero.nextInt();
		pruebaAgendaPrrona.telefonos.remove(indiceadios - 1);
		pruebaAgendaPrrona.mascotas.remove(indiceadios - 1);
		pruebaAgendaPrrona.nombres.remove(indiceadios - 1);
	}

/**
*Metodo usado para buscar un contacto especifico, segun su nombre, su numero telefonico o el nombre de su mascota.
*/
	public void buscarContacto(AgendaPrrona pruebaAgendaPrrona){
		System.out.println("¿Cómo quieres buscar tu contacto?");
		System.out.println("1. Por nombre.\n2. Por teĺéfono.\n3. Por el nombre de su mascota.");
		Scanner busqueda = new Scanner(System.in);
		int aBuscar = busqueda.nextInt();
		switch (aBuscar) {
			case 1:
				try{
					Scanner searchName = new Scanner(System.in); 
					System.out.print("Ingresa el nombre de tu contacto: ");
					int i = nombres.indexOf(searchName.nextLine()); //dice el índice del elemento según su coincidencia con la cadena ingresada
					System.out.println("");
					System.out.println((i+1)+".- Nombre: "+nombres.get(i)+" <-->"+" Teléfono: "+telefonos.get(i)+" <--> Mascota: "+mascotas.get(i)+"\n");
				}catch(Exception e){
					System.out.println("No hay coincidencias en tu búsqueda :/\n");
				}
				break;
			case 2:
				try{
					Scanner searchPhone = new Scanner(System.in); 
					System.out.print("Ingresa el teléfono de tu contacto: ");
					int i = telefonos.indexOf(searchPhone.nextLine()); //dice el índice del elemento según su coincidencia con la cadena ingresada
					System.out.println("");
					System.out.println((i+1)+".- Nombre: "+nombres.get(i)+" <-->"+" Teléfono: "+telefonos.get(i)+" <--> Mascota: "+mascotas.get(i)+"\n");
				}catch(Exception e){
					System.out.println("No hay coincidencias en tu búsqueda :/\n");
				}
				break;
			case 3:
				try{
					Scanner searchMascota = new Scanner(System.in); 
					System.out.print("Ingresa el nombre de tu mascota: ");
					int i = mascotas.indexOf(searchMascota.nextLine()); //dice el índice del elemento según su coincidencia con la cadena ingresada
					System.out.println("");
					System.out.println((i+1)+".- Nombre: "+nombres.get(i)+" <-->"+" Teléfono: "+telefonos.get(i)+" <--> Mascota: "+mascotas.get(i)+"\n");
				}catch(Exception e){
					System.out.println("No hay coincidencias en tu búsqueda :/\n");
				}
				break;
		}
	}

	/**
	*main de prueba para mostrar la funcionalidad de la clase AgendaPrrona, segun los lineamientos
	*indicados en el proyecto 1 de Java PROTECO.
	*/
	public static void main(String[] args) {
		AgendaPrrona pruebaAgendaPrrona = new AgendaPrrona();
		Boolean salida = true;
		while (salida) {
			System.out.println("Hola, usuario. ¿Qué acción deseas realizar en tu agenda?");
			System.out.println("1. Añadir contacto.\n2. Borrar un contacto.\n3. Buscar un contacto.\n4. Limpiar agenda (eliminar contactos).\n5. Ver contactos.\n6. Salir.");
			Scanner decision = new Scanner(System.in);
			int caso = decision.nextInt();
			switch (caso){
				case 1:
					pruebaAgendaPrrona.pedirNombre();
					pruebaAgendaPrrona.pedirTelefono();
					pruebaAgendaPrrona.pedirMascota();
					break;
				case 2:
					pruebaAgendaPrrona.eliminarElemento(pruebaAgendaPrrona);
					System.out.println("");
					break;
				case 3:
					pruebaAgendaPrrona.buscarContacto(pruebaAgendaPrrona);
					break;
				case 4:
					pruebaAgendaPrrona.nombres.clear();
					pruebaAgendaPrrona.mascotas.clear();
					pruebaAgendaPrrona.telefonos.clear();
					break;
				case 5:
					System.out.println("");
					for (int i = 0;i < nombres.size();i++ ) {
						System.out.print((i+1)+".- Nombre: "+nombres.get(i)+" <-->"+" Teléfono: "+telefonos.get(i)+" <--> Mascota: "+mascotas.get(i));
						System.out.println("");
					}
					System.out.println("");
					break;	
				case 6:
					System.out.println("¡¡¡Bye!!!");
					salida = false;
					break;
			}
		}
	}
}