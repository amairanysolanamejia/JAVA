public class Main{
	public static void main(String[] args) {
		
		//Para la Sucursal 1
		Tienda sucursal1 = new Tienda("San Bu",560000);
		//Para sus empleados
		Empleado empleado1 = new Empleado("Gerente","Dante",2000);
		Empleado empleado2 = new Empleado("Supervisor","Leo",1000);
		Empleado empleado3 = new Empleado("Cajero","Nata",56);
		Empleado empleado4 = new Empleado("Aguador","Dieo",2.5);
		//Para sus productos
		Producto producto1 = new Producto(10,"agua"); 
		Producto producto2 = new Producto(5,"papitas"); 
		Producto producto3 = new Producto(50,"chicles"); 
		Producto producto4 = new Producto(20,"jamón"); 
		//Presentación de datos
		System.out.print("La sucursal 1 se ubica en: ");
		System.out.println(sucursal1.getDireccion());
	}
}
