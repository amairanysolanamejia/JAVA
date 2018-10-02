
/**
* Clase prueba que permite crear animales carvívoros o hervíboros
* @author Casillas Muñoz, Diego Armando
* @author Solana Mejía, Haydee Amiarany
*
*/
public class Main{
	public static void main(String[] args) {

		Tigre t = new Tigre("t","salchicha","Antílope"); //llena el contructor con su nombre, comida favorita y animal que come
		t.categoria(); //se imprime a qué categoría pertenece
		t.jugar(); //imprime que juega
		t.comera(); //imprime a qué animal se quiere comer
		System.out.println("");

		Antilope a = new Antilope("a","tacos","Tigre");
		a.categoria();
		a.jugar();
		a.comera();
		System.out.println("");

		Leon l = new Leon("l","pizza","Leones");
		l.categoria();
		l.jugar();
		l.comera();
		System.out.println("");

		Puma p = new Puma("p","mixiotes","Cebras");
		p.categoria();
		p.jugar();
		p.comera();
		System.out.println("");

		Cebra c = new Cebra("c","cochinita","Venados");
		c.categoria();
		c.jugar();
		c.comera();
		System.out.println("");

		Venado v = new Venado("v","tamales","Pumas");
		c.categoria();
		v.jugar();
		v.comera();
		System.out.println("");
	}
} 
