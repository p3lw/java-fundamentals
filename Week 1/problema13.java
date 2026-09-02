/*
 * Contador de números pares

Pide un número N y muestra todos los números pares desde 1 hasta N.

Ejemplo:

Ingresa un número: 20

2
4
6
8
10
12
14
16
18
20
 */
//

//OPCION 1

import java.util.Scanner;

public class problema13 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int numero;
		System.out.println("Contador de numeros pares!\nIngrese un numero y dare los pares hasta llegar a ese numero:");
		numero = scanner.nextInt();
		
			for (int i = 1; i<=numero; i++) {
				if(i%2==0) {
					System.out.println(i);
				}				
			}			
		scanner.close();
	}
}

 
/* OPCION 2

import java.util.Scanner;

public class problema13 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int numero;
		int pares;
		
		System.out.println("Contador de numeros pares!\nIngrese un numero y dare los pares hasta llegar a ese numero:");
		numero = scanner.nextInt();
		int mitad = numero/2;
		
			for (int i = 1; i<=mitad; i++) {
				pares = i+i;
				System.out.println(pares);
			}
		
		
		scanner.close();
	}
}


/*