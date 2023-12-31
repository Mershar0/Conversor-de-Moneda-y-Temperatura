package InterfasePrincipal;

import javax.swing.*;

import ConversorMoneda.convertOptMon;
import ConversorTemperatura.convertOptTemp;


public class InterPrin {
	
	public static void main(String[] args) {
		
		convertOptMon convertM = new convertOptMon();
		convertOptTemp convertT = new convertOptTemp();
		
		while(true) {
			String options = JOptionPane.showInputDialog(null, "Seleccione una opción de conversión", "Menú principal", JOptionPane.PLAIN_MESSAGE, 
					null, new Object[] {"Conversor de Monedas", "Conversor de Temperatura"}, "Elegir").toString();
			
			
			switch(options) {
			case "Conversor de Monedas":
				String input0 = JOptionPane.showInputDialog(null, "Ingrese la cantidad de dinero a convertir");
				
				if(validNum(input0) == true) {
                    double receiveMValue = Double.parseDouble(input0);
					convertM.ConvertMon(receiveMValue);
					
					int mAnswer = JOptionPane.showConfirmDialog(null, "¿Desea realizar otra conversión?");
					if(JOptionPane.OK_OPTION == mAnswer) {
						System.out.println("Afirmación");
					} else {
						JOptionPane.showMessageDialog(null, "Programa finalizado");
					}	
					} else {
		                 JOptionPane.showMessageDialog(null, "Valor inválido");                
		             }
					break;
			
			
			case "Conversor de Temperatura":
				String input1 = JOptionPane.showInputDialog(null, "Ingrese la temperatura a convertir");
				
				 if(validNum(input1) == true) {
					 double receiveTValue = Double.parseDouble(input1);
					 convertT.ConvertTemp(receiveTValue); 
					
					 int tAnswer = JOptionPane.showConfirmDialog(null, "¿Desea realizar otra conversión?");
					 if((tAnswer == 0) && (validNum(input1) == true)){
						 
				 } else{
						JOptionPane.showMessageDialog(null, "Programa finalizado");
					} 
					 
				 } else {
		                 JOptionPane.showMessageDialog(null, "Valor inválido");                
		             }
					break;
					 
					 
			}
		}
		}
	
	
	 public static boolean validNum(String input) {
	        try {
	            double x = Double.parseDouble(input);
	            if(x >= 0 || x < 0);
	                return true;
	            } catch (NumberFormatException e) {
	                return false;
	            }
	    }
	
}
		
	

	
	
	



