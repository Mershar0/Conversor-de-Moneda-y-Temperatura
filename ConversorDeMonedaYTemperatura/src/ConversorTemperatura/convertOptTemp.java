package ConversorTemperatura;

import javax.swing.JOptionPane;

import javax.swing.JFrame;

public class convertOptTemp {
	ConvertTemp temp = new ConvertTemp();
	


	public void ConvertTemp (double value) {

		String opt = (JOptionPane.showInputDialog(null,
				"Elija la temperatura que desea convertir ", "Temperaturas",
				JOptionPane.PLAIN_MESSAGE, null, new Object[]
						{"De Celsius a Fahrenheit", "De Celsius a Kelvin",
						"De Celsius a Rankine", "De Fahrenheit a Celsius", 
						"De Fahrenheit a Kelvin", "De Fahrenheit a Rankine",
						"De Kelvin a Celsius", "De Kelvin a Fahrenheit", 
						"De Kelvin a Fahrenheit", "De Kelvin a Rankine",
						"De Rankine a Celsius", "De Rankine a Fahrenheit", 
						"De Rankine a Kelvin"}, "Seleccion")).toString();
		
		switch (opt) {
		case "De Celsius a Fahrenheit":
			temp.ConvertCelsiusFahrenheit(value);
			break;
		
		case "De Celsius a Kelvin": 
			temp.ConvertCelisusKelvin(value);
			break;
			
		case "De Celsius a Rankine":
			temp.ConvertCelsiusRankine(value);
			break;
			
		case "De Fahrenheit a Celsius":
			temp.ConvertFahrenheitCelsius(value);
			break;
			
		case "De Fahrenheit a Kelvin":
			temp.ConvertFahrenheitKelvin(value);
			break;
		
		case "De Fahrenheit a Rankine":
			temp.ConvertFahrenheitRankine(value);
			break;
			
		case "De Kelvin a Celsius":
			temp.ConvertKelvinCelsius(value);
			break;
			
		case "De Kelvin a Fahrenheit":
			temp.ConvertKelvinFahrenheit(value);
			break;
		 
		case "De Kelvin a Rankine":
			temp.ConvertKelvinRankine(value);
			break;
			
		case "De Rankine a Celsius":
			temp.ConvertRankineCelsius(value);
			break;
			
		case "De Rankine a Fahrenheit":
			temp.ConvertRankineFahrenheit(value);
			break;
			
		case "De Rankine a Kelvin":
			temp.ConvertRankineKelvin(value);
			break;
		}
		
	}
	
}

	
	
	
	
