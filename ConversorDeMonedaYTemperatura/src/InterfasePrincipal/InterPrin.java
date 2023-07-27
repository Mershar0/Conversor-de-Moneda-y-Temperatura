package InterfasePrincipal;

import javax.swing.*;

import ConversorMoneda.convertOptMon;
import ConversorTemperatura.convertOptTemp;


public class InterPrin {
	
	public static void main(String[] args) {
		
		convertOptMon convertM = new convertOptMon();
		convertOptTemp convertT = new convertOptTemp();
		
		while(true) {
			String options = JOptionPane.showInputDialog(null, "Seleccione una opción de conversión", "Menú", JOptionPane.PLAIN_MESSAGE, 
					null, new Object[] {"Conversor de Monedas", "Conversor de Temperatura"}, "Elegir").toString();
			
			
			switch(options) {
			case "Conversor de Monedas":
				String input0 = JOptionPane.showInputDialog(null, "Ingrese el valor a convertir");
				double receiveMValue = Double.parseDouble(input0);
				convertM.ConvertMon(receiveMValue);
				
				int mAnswer = JOptionPane.showConfirmDialog(null, "¿Desea realizar otra conversión?");
				if(JOptionPane.OK_OPTION == mAnswer) {
					System.out.println("Entra");
				} else {
					JOptionPane.showMessageDialog(null, "Programa finalizado");
				}
				break;
			
			
			case "Conversor de Temperatura":
				String input1 = JOptionPane.showInputDialog(null, "Ingrese la temperatura a convertir");
				double receiveTValue = Double.parseDouble(input1);
				convertT.ConvertTemp(receiveTValue);
				
				int tAnswer = JOptionPane.showConfirmDialog(null, "¿Desea realizar otra conversión?");
				if(JOptionPane.OK_OPTION == tAnswer) {
					System.out.println("Entra");
				} else {
					JOptionPane.showMessageDialog(null, "Programa finalizado");
				}
				break;
		}
			
		}
		
		
	}
}
	
	
	



