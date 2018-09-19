import java.util.Scanner;

public class Complex
{
  private double real;
  private double imag;

  public Complex(){} //Declaración explicita del contructor Complex

  public Complex(double real, double imag){ //Declara método contructor
     this.real=real; //parte real del número complejo
     this.imag=imag;//parte imaginaria dle número complejo
  }

  public double modulo(){ //Método que permite obtener el módulo del número ingresado, este no recibe parámetros porque se utiliza para

   return Math.sqrt(real*real+imag*imag);
 }

  public static Complex suma(Complex a, Complex b){ //Método que permite realizar la suma de dos números complejos
    Complex suma = new Complex();
    suma.real = a.real + b.real;
    suma.imag = a.imag + b.imag;
    return suma;
  }
  public static Complex resta(Complex a, Complex b){ //Método que permite resta dos números complejos
    Complex resta = new Complex();
    resta.real = a.real - b.real;
    resta.imag = a.imag - b.imag;
    return resta;
  }
  public static Complex multiplicacion(Complex a, Complex b){ //Método que permite hacer la multiplicación
    Complex multiplicacion = new Complex();
    multiplicacion.real =a.real*b.real-a.imag*b.imag;
    multiplicacion.imag = a.real*b.imag+a.imag*b.real;
    return multiplicacion;
  }
  public static Complex dividir(Complex a, Complex b){ //Método que permite hacer la división entre dos números complejos
    Complex division = new Complex();
    double aux;
     if(b.modulo()==0.0)
     {
          System.out.println("La division entre cero no existe");
     }
     else
     {
          aux=b.real*b.real+b.imag*b.imag;
          division.real=(a.real*b.real+a.imag*b.imag)/aux;
          division.imag=(a.imag*b.real-a.real*b.imag)/aux;
     }
    return division;
  }
 
  public static double ang(Complex a) //Método que me muestra el ángulo de un número complejo, que para este programa se hará para ambos números proporcionados
  {
    double angulo = Math.atan2(a.imag,a.real);  
    if(angulo<0){   
      angulo=2*Math.PI+angulo;
      }
      angulo=angulo*180/Math.PI;

  return angulo;
  }
  
  public static double magnitud(Complex a) //Método que permite obtener el módulo del número ingresado
  {
    double mag=Math.sqrt(Math.pow(a.real,2)+Math.pow(a.imag,2));
    return mag;
  }

  

  public static void main(String[] args)  //Método main
  {
    double unor,dosr,unoi,dosi;
    Scanner entradaEscaner = new Scanner(System.in);
    System.out.println("******************************************************************************************************");
    System.out.println("Este programa realizado en Java te permite realizar diferentes operaciones con dos números complejos.");
    System.out.println("******************************************************************************************************");
    System.out.println("");
    System.out.println("Operaciones como: suma, resta, multiplicaciín, división, ángulo y magnitud. ");
    System.out.println("Dame la parte real del primer elemento"); //pide la parte real e imaginaria de ambos números de los cuales se realizarán las operaciones
    unor = entradaEscaner.nextDouble();
 
    System.out.println("Dame la parte imaginaria del primer elemento");
    dosr = entradaEscaner.nextDouble();

    System.out.println("Dame la parte real del segundo elemento");
    unoi = entradaEscaner.nextDouble();
 
    System.out.println("Dame la parte imaginaria del segundo elemento");
    dosi = entradaEscaner.nextDouble();

    Complex uno = new Complex(unor,dosr); //Asigna al objeto uno los valores real e imaginario
    Complex dos = new Complex(unoi,dosi);
    Complex ax = new Complex();
    
    System.out.println("Numero uno:" + unor + "+ i" + unoi); //En teoría debería imprimir los valores ingresados
    System.out.println("Numero dos:" + dosr+ "+ i" + dosi);
    ax=Complex.suma(uno,dos);
    System.out.println("La suma es " +ax.real + " + " + ax.imag+"i");
    ax = Complex.resta(uno,dos);
    System.out.println("La resta es " + ax.real  + ax.imag+"i");
    ax = Complex.multiplicacion(uno,dos);
    System.out.println("La multiplicacion es " + ax.real + " + " + ax.imag+"i");
    ax = Complex.dividir(uno,dos);
    System.out.println("La division es " + ax.real + " + " + ax.imag+"i");
    System.out.println("El angulo es: "+Complex.ang(uno)+"°");
    System.out.println("El angulo es: "+Complex.ang(dos)+"°");
    System.out.println("La magnitud del numero uno es: "+(int)Complex.magnitud(uno));
    System.out.println("La magnitud del numero dos es: "+(int)Complex.magnitud(dos));
    }
}
