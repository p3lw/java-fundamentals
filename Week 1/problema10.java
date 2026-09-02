/*
 * Aprobado o desaprobado

Pide una nota de 0 a 20.

11 o más → Aprobado
Menos de 11 → Desaprobado

También valida que la nota no sea menor que 0 ni mayor que 20.
 */

import java.util.Scanner;

public class problema10 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int nota;
		
		System.out.println("Ingresa tu nota para calcular si estas aprobado o desaprobado: ");
		nota = scanner.nextInt();
		
		if(nota>=11 && nota<=20) {
			System.out.println("Estas aprobado!");
		}
		else if (nota<11 && nota>=0) {
			System.out.println("Estas desaprobado!");
		}
		else {
			System.out.println("Tu nota no es validad, pon un valor entre 0 a 20.");
		}
		scanner.close();
	}
}
