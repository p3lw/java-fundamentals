import java.util.Scanner;
/*
 * Pide tres números e indica cuál es el mayor.
 */
public class problema7 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double x;
		double y;
		double z;
		
		System.out.println("Te dire cual es el numero mayor en 3 numeros distintos...");
		System.out.println("Ingresa el primero numero: ");
		x = scanner.nextDouble();
		System.out.println("Ingresa el segundo numero: ");
		y = scanner.nextDouble();
		System.out.println("Ingresa el tercero numero: ");
		z = scanner.nextDouble();
		
		if (x>y && x>z) {
			System.out.println("El numero mayor es: "+x);
		}
		else if (y>x && y>z) {
			System.out.println("El numero mayor es: "+y);

		}
		else {
			System.out.println("El numero mayor es: "+z);

		}
	}
}
