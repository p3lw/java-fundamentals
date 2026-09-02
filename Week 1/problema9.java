/*
 * 4. Calculadora con switch

Pide dos números y una operación:

1. Sumar
2. Restar
3. Multiplicar
4. Dividir

Usa switch para realizar la operación seleccionada.
 */

import java.util.Scanner;

public class problema9 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double x;
		double y;
		
		System.out.println("============================");
		System.out.println("CALCULADORA:");
		System.out.println("Ingresa el primer numero: ");
		x = scanner.nextDouble();
		System.out.println("Ingresa el segundo numero: ");
		y = scanner.nextDouble();
		System.out.println("============================");
		System.out.println("Que es lo que quieres: ");
		System.out.println("1. Suma");
		System.out.println("2. Restar");
		System.out.println("3. Multiplicacion");
		System.out.println("4. Dividir");
		System.out.println("============================");
	

		
		int opciones = scanner.nextInt();

		switch(opciones){
		
		case 1: System.out.println("La suma es: "+(x+y)); break;
		case 2: System.out.println("La resta es: "+(x-y)); break;
		case 3: System.out.println("La multiplicacion es: "+(x*y)); break;
		case 4: 
			if(y != 0) {
				System.out.println("La divicion es: "+(x/y)); 
			}
			else {
				System.out.println("No se puede dividir entre 0");
			}
			break;
		default: System.out.println("Error"); break;
		}
		
		scanner.close();
	}
}
