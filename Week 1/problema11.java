/*
 * Tabla de multiplicar

Pide un número y muestra su tabla del 1 al 12.

5 x 1 = 5
5 x 2 = 10
...
5 x 12 = 60
 */

import java.util.Scanner;

public class problema11 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int numero;
		System.out.println("Tabla de multiplicar, ingresa tu unmero y te dire su tabla del 1 al 12.");
		numero = scanner.nextInt();
		
		System.out.println("La tabla del "+numero +" es:");
		for (int i=1; i<=12; i++) {
			System.out.println(numero+ " x "+ i +" = "+ (numero*i));		
		}
		scanner.close();
	}
}
