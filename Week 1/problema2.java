package holapapusestoyusandoeclipseporquenomegustaapche;

import java.util.Scanner;

/*
En un supermercado se hace una promoción, mediante la cual el cliente obtiene un 
descuento dependiendo de un número que se escoge al azar, siempre y cuando el monto 
de compra supere un monto establecido por gerencia todos los días. Si el número escogido 
es menor que 74 el descuento es del 15% sobre el monto de la compra, si es mayor o igual 
a 74 el descuento es del 20%. Obtener cuánto dinero se le descuenta
 */
public class problema2 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		double x;
		double dinero;
		double descuento;
		double f;
		x = 74;

		System.out.println("Ingresa lo que gastaste: ");
		dinero = scanner.nextInt();

		System.out.println("PROMOCIONES, HAZ SIDO SELECCIONADO PARA UN DESCUENTO UNICO!");
		System.out.println(
				"Si tu numero es entre el 1 al 71 tendras un descuetno del 15%, y si es de 72 al 100 tendras 20%.");

		if (x < 74) {
			System.out.println("Tienes un decuento del 15%");
			descuento = (dinero * 0.15);
		} else {
			System.out.println("Tienes un descuento del 20%");
			descuento = (dinero * 0.2);
		}

		f = dinero - descuento;

		System.out.println("Finalmente, pagas un monto de " + f + " soles.");
		scanner.close();
	}
}
