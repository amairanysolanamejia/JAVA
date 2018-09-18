public class Tienda{ //Clase tipo tienda que contiene diversos atributos.
	private String direccion;//dirección de la tienda
	private float dinero; //dinero de la tienda
	static int contProductos=0; //productos, contador
	static int contEmpleados=0; //empleados
	static int numeroTiendas=0; //tiendas, contador
	static int totaldinero=0; //total de dinero

	public Tienda(String direccion,float dinero){
		this.direccion = direccion;
		this.dinero = dinero;
		numeroTiendas++;
	}

	public int numeroEmpleados(){
		
	}

	public String getDireccion(){
		return direccion;
	}

	public void setDireccion(String direccion){
		this.direccion = direccion;
	}

	public void setDinero(int dinero){
		this.dinero = dinero;
	}

	public int getDinero(){
		return dinero;
	}

	

	public int getcontProductos(){
		return producto;
	}

	

	public int getcontEmpleados(){
		return empleado;
	}
}
