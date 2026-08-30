import java.util.Scanner;
/*
Antes de que se promulgara el racionamiento de energía, casi nadie hablaba en kilowatts; 
pero ahora todos han incorporado esa palabra a su vocabulario. Sabiendo que 100 kilowatts 
de energía cuestan una séptima parte del salario mínimo, cree un algoritmo que reciba el 
valor del salario mínimo y la cantidad de kilowatts gastados por una residencia y calcule:
• El valor en soles de cada kilowatt.
• El valor en soles a pagar.
• El nuevo valor que pagar por la residencia con un descuento del 10%.
*/
public class problema2 {
	public static void main (String[] args){
		
		Scanner scan = new Scanner(System.in);
		
		double kilowatt;
		double valorkilowatt;
		double sueldominimo;
		double descuento;
		double recibobruto;
		double recibo;
		
		sueldominimo = 1130.0;
		valorkilowatt = ((1.0/7.0) * sueldominimo)/100.0;
		
		
		System.out.println("El sueldo minimo en Perú: "+ sueldominimo);
		System.out.println("El valor por 1 KiloWatt es de "+valorkilowatt+ " soles.");
		System.out.println("Ingrese el consumo de kilowatts:");
		kilowatt = scan.nextDouble();
		recibobruto = (kilowatt * valorkilowatt);
		System.out.println("Tu consumo en soles es: "+ recibobruto);
		descuento = (recibobruto / 10.0);
		recibo = recibobruto - descuento;
		System.out.println("Tienes un descuento del 10% asi que el valor total de tu recibo es: "+ recibo);
	}
}
