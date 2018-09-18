public class Tienda{
	private String direccion;//dirección de la tienda
	private float dinero; //dinero con el que cuenta la sucursal
	static int contProductos=4; //productos
	static int contEmpleados=4; //empleados
	static int numeroTiendas=0; //tiendas
	static int totalDinero=0; //dinero total de todas las tiendas

	public Tienda(String direccion,float dinero){
		this.direccion = direccion;
		this.dinero = dinero;
		numeroTiendas++;
		totalDinero+=dinero;
	}


	public String getDireccion(){
		return direccion;
	}

	public void setDireccion(String direccion){
		this.direccion = direccion;
	}

	public void setDinero(float dinero){
		this.dinero = dinero;
	}

	public float getDinero(){
		return dinero;
	}

	public int getContProductos(){
		return contProductos;
	}

	public int getEmpleado(){
		return contEmpleados;
	}
}