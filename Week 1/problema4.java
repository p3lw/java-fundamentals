package holapapusestoyusandoeclipseporquenomegustaapche;

import java.util.Scanner;

/*
 * Hacer un programa el cual a partir de sus ángulos determine el tipo de triángulo
• RECTÁNGULO: Tiene un ángulo recto (90º).
• OBTUSÁNGULO: Tiene un ángulo obtuso (>90º).
• ACUTÁNGULO: Tiene los tres ángulos agudos (<90º)
 */
public class problema4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double x;
		double y;
		double z;

		System.out.println(
				"Ingrese 3 angulos de un triagulo para saber si es un triagulo rectangulo, ocutangulo o obtusangulo.");
		System.out.println("Angulo 1: ");
		x = scanner.nextInt();
		System.out.println("Angulo 2: ");
		y = scanner.nextInt();
		System.out.println("Angulo 3: ");
		z = scanner.nextInt();

		if (!(x + y + z == 180)) {
			System.out.println("ERROR, todos tienen que sumar 180 asi que mal!");
		} else if (x < 1 && y < 1 && z < 1) {
			System.out.println("ERROR, las variables tienen que ser mayor a 1");
		} else {
			if (x < 90 && y < 90 && z < 90) {
				System.out.println("Es un triangulo ACUTÁNGULO.");
			} else if (x == 90 && y == 90 && z == 90) {
				System.out.println("Es un triangulo RECTANGULO ");
			} else {
				System.out.println("Es un triangulo OBTUSÁNGULO ");
			}
		}
		scanner.close();
	}
}
