package holapapusestoyusandoeclipseporquenomegustaapche;

import java.util.Scanner;

/*
 * Se pide crear un programa para determinar si un triángulo es isósceles, escaleno o 
equilátero.

USANDO ESTA IMAGEN SIN QUE LOS VALORES SEAN DESORDENADOS ES COMO EL CODIGO HECHO:
https://cdn.diferenciador.com/imagenes/tipos-de-triangulos-segun-lados-cke.jpg
 */
public class problema3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int a;
		int b;
		int c;

		System.out.println("Ingresa los 3 lados de un equilatero para saber si es isósceles, escaleno o equilátero");
		System.out.println("Valor 1: ");
		a = scanner.nextInt();
		System.out.println("Valor 2: ");
		b = scanner.nextInt();
		System.out.println("Valor 3: ");
		c = scanner.nextInt();

		if (a == b & a != c) {
			System.out.println("Es isoseles.");
		} else if (a == b & b == c) {
			System.out.println("El equilatero.");
		} else {
			System.out.println("Es escaleno.");
		}
		scanner.close();
	}
}
