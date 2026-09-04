package holapapusestoyusandoeclipseporquenomegustaapche;

import java.util.Scanner;

/*
 * Se pide crear un programa que a partir de dos números muestre un mensaje en pantalla 
para saber si son iguales o si el primero es menor que el segundo o si el segundo es menor 
que el primero
 */
public class problema1 {
	public static void main(String[] args) {
		int x;
		int y;

		Scanner scanner = new Scanner(System.in);
		System.out.println("Igrese 2 valores y dire cual es mayor o si son iguales.");
		System.out.println("Valor 1:");
		x = scanner.nextInt();
		System.out.println("Valor 2:");
		y = scanner.nextInt();

		if (x == y) {
			System.out.println("Los 2 valores son iguales");
		} else if (x > y) {
			System.out.println("El primer valor es mayor que el segundo valor.");
		} else {
			System.out.println("El segundo valor es mayor que el primer valor");
		}
		scanner.close();
	}

}
