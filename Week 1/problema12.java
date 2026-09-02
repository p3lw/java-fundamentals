/*
 * Suma de números

Pide un número N y calcula:

1 + 2 + 3 + ... + N

Ejemplo:

Ingresa un número: 5
Resultado: 15
 */

import java.util.Scanner;

public class problema12 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int numero;
		int total = 0;
		
		System.out.println("Suma de numeros:\nSumare todos los numeros desde el 1 al numero que indicaste.");
		numero=scanner.nextInt();
		
		for (int i=1; i<=numero; i++) {
			total = total+i;
		}
		System.out.println("La suma de la cadena es: "+ total);

		scanner.close();
	}
}
