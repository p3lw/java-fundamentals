import java.util.Scanner;

/*Desarrolle un programa donde el usuario ingresa cuatro valores. El programa muestra el 
  resultado de multiplicar el primero por el tercero y el resultado de sumar el segundo al cuarto. */

public class problema3 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		double a;
		double x;
		double b;
		double y;
		double multiplicacion;
		double suma;
		
		System.out.println("Ingrece el primer valor:");
		a = scan.nextDouble();
		System.out.println("Ingrece el segundo valor:");
		x = scan.nextDouble();
		System.out.println("Ingrece el tercer valor:");
		b = scan.nextDouble();
		System.out.println("Ingrece el cuarto valor:");
		y = scan.nextDouble();
		
		multiplicacion = (a * b);
		suma = (x + y);
		
		System.out.println("El programa muestra el resultado de multiplicar el primero por el tercero y el resultado de sumar el segundo al cuarto.");
		System.out.println("El resultado de la multiplicacion es: "+multiplicacion);
		System.out.println("El resultado de la suma es: "+suma);
	}
}
