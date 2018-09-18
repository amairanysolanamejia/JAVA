public class Producto{
	private String nombre;
	private float precio;

	public Producto(float precio,String nombre){
		this.precio = precio;
		this.nombre = nombre;
	}

	public void setNombre(String nombre){
		this.nombre = nombre;
	}

	public String getNombre(){
		return nombre;
	}

	public void setPrecio(float precio){
		this.precio = precio;
	}

	public float getPrecio(){
		return precio;
	}

}