public class Main{
	public static void main(String[] args) {
		Prebe diego = new Prebe("Geofísica",4,"Diego",3);
		System.out.println(diego.toString());
		System.out.println("Soy el prebecario número "+diego.getNumPrebe());
		diego.hacerTarea();

		System.out.println("");

		Prebe any = new Prebe("Geofísica",2,"Amairany",14);
		System.out.println(any.toString());
		System.out.println("Soy el prebecario número "+any.getNumPrebe());
		any.hacerTarea();
	}
}