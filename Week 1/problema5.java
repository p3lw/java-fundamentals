import javax.swing.JOptionPane;
/*
Un paciente con diabetes tipo 1 necesita llevar un control diario de su alimentación, insulina 
y medicación. Debe administrar insulina antes de cada comida en función de la cantidad de 
carbohidratos que consumirá y del nivel de glucosa en sangre antes de comer. Además, 
tiene que tomar un medicamento específico tres veces al día. Se requiere un programa que 
calcule cuánta insulina debe inyectarse antes de cada comida, teniendo en cuenta los 
carbohidratos consumidos y su nivel de glucosa, además debe recordarle al paciente la 
dosis y hora de su medicación.
 */
public class problema6 {
	public static void main (String[] args) {
		
		int glucosaideal;
		double insulinaayer;
		double carbohidratos;
		double glucosa; 
		double insulina; 
		
		glucosaideal = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la cantidad de glucosa ideal en tu sangre: "));
		insulinaayer = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa las dosis de insulina que de inyectaste ayer: "));
		carbohidratos = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa la cantidad de carbohidratos en gramos consumidos: "));
		glucosa = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa la cantidad de glucosa en tu sangre: "));
		insulina = Math.floor((carbohidratos/15)+(glucosa-glucosaideal)/(1800/insulinaayer));
		
		JOptionPane.showMessageDialog(null, "Recuerda tomar tus pastillas cada 8 horas:\n-Antes del desayuno a las 7am\nAntes del almuerzo a las 3pm\nAntes de la cena a las 11pm.");
		JOptionPane.showMessageDialog(null, "La dosis de insulina que tienes que tomar es de "+ insulina+" dosis.");
		
		
	}
}
