import java.util.Scanner;
/*Introduzca un número en formato CDU e imprímalo invertido: UDC. (Ejemplo: 123, se 
generará 321). El número debe almacenarse en otra variable antes de imprimirse.
*/
public class ejemplos1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numero;
		int C;
		int D;
		int U;
		
		System.out.println("Ingresa un numero de 3 digitos:");
		numero = scanner.nextInt();
		U = (numero % 10);
		D = (numero / 10 ) % 10;
		C = (numero / 100);
		
		System.out.println("El valor al revez es (UDC): "+U+D+C);
		
		
	}
}
