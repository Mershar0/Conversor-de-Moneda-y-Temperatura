package ConversorMoneda;

import javax.swing.JOptionPane;

import javax.swing.JFrame;

public class convertOptMon {

ConvertMon monedas = new ConvertMon();
	
	public void ConvertMon(double value) {
	
	String opt = (JOptionPane.showInputDialog(null,
			"Elija la moneda que desea convertir",  "Monedas",
			JOptionPane.PLAIN_MESSAGE, null, new Object[]
					{"De Pesos Dominicanos a Dólar", "De Pesos Dominicanos a Euro", 
					"De Pesos Dominicanos a Libras Esterlinas", 
					"De Pesos Dominicanos a Yen Japonés", 
					"De Pesos a Won surcoreano", "De Dólar a Pesos Dominicanos", 
					"De Euro a Pesos Dominicanos", "De Libras Esterlinas a Pesos Dominicanos", 
					"De Yen Japonés a Pesos Dominicanos", "De Won surcoreano a Pesos Dominicanos"}, 
					"Seleccion")).toString();
	
	switch (opt) {
	case "De Pesos Dominicanos a Dólar": 
		monedas.pesosDom_dolar(value);
		break;
	
	case "De Pesos Dominicanos a Euro": 
		monedas.pesosDom_euro(value);
		break;
		
	case "De Pesos Dominicanos a Libras Esterlinas":
		monedas.pesosDom_libra(value);
		break;
		
	case "De Pesos Dominicanos a Yen Japonés":
		monedas.pesosDom_yen(value);
		break;
		
	case "De Pesos Dominicanos a Won surcoreano":
		monedas.pesosDom_won(value);
		break;
	
	case "De Dólar a Pesos Dominicanos":
		monedas.dolar_pesosDom(value);
		break;
		
	case "De Euro a Pesos Dominicanos":
		monedas.euro_pesosDom(value);
		break;
		
	case "De Libras Esterlinas a Pesos Dominicanos":
		monedas.libra_pesosDom(value);
		break;
	 
	case "De Yen Japonés a Pesos Dominicanos":
		monedas.yen_pesosDom(value);
		break;
		
	case "De Won sub-coreano a Pesos Dominicanos":
		monedas.won_pesosDom(value);
		break;
	}
	}

}
