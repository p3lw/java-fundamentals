import java.util.Scanner;

/* Desarrolle un programa donde se debe informar el precio por litro de combustible y la cantidad de dinero a abastecer.
   El programa muestra cuántos litros se comprarán. (Ejemplo: la gasolina cuesta S/. 2,70 y el conductor quiere abastecer 
   con S/. 50,00) */
public class problema4 {
	public static void main(String[] args) {
		
	Scanner scanner = new Scanner(System.in);

	double preciolitro;
	double dinero;
	double litroscomprados;
	
	preciolitro = 20.0;
	System.out.println("Gasohol Regular: S/.20 el litro");
	System.out.println("Ingrese cuantos soles quiere recargar: ");
	dinero = scanner.nextDouble();
	litroscomprados = dinero / preciolitro;
	System.out.println("Eso te alcanzara para "+ litroscomprados+ " litros de Gasohol Regular")	;
	
	
    }
}