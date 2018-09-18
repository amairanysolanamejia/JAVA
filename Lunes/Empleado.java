public class Empleado{
	private String puesto;
	private String nombre;
	private float sueldo;

	public Empleado(String puesto, String nombre, float sueldo){
		this.puesto = puesto;
		this.nombre = nombre;
		this.sueldo = sueldo;
	}

	public String getPuesto(){
		return puesto;
	}

	public String getNombre(){
		return nombre;
	}

	public float getSueldo(){
		return sueldo;
	}
}