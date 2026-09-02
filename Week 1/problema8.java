/*
 * determinar si un número es par o impar
 */

import java.util.Scanner;

public class problema8 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numero;
		
		System.out.println("ingrese un numero y te dire si es par o impar");
		System.out.println("Ingrese el numero: ");
		numero = scanner.nextInt();
		
		if (numero%2==0) {
			System.out.println("Tu numero es par!");
		}
		else {
			System.out.println("Tu numero es impar!");
		}
		scanner.close();
	}
}
