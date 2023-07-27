package ConversorTemperatura;

import javax.swing.JOptionPane;

import javax.swing.JFrame;

public class ConvertTemp {
	
	//CELSIUS

	public void ConvertCelsiusFahrenheit(double value) {
		double CFahrenheit = (value * 1.8) + 32;
		CFahrenheit = (double)Math.round(CFahrenheit * 100d) /100 ;
		JOptionPane.showMessageDialog(null, "Son " + CFahrenheit + " Fahrenheit");
	}
	public void ConvertCelisusKelvin(double value) {
		double CKelvin = value + 273.15;
		CKelvin = (double)Math.round(CKelvin * 100d) /100 ;
		JOptionPane.showMessageDialog(null, "Son " + CKelvin + " Kelvin");
	}
	public void ConvertCelsiusRankine(double value) {
		double CRankine = (value * 1.8) + 491.67;
		CRankine = (double)Math.round(CRankine * 100d) /100 ;
		JOptionPane.showMessageDialog(null, "Son " + CRankine + " Rankine");
	}
	
	
	//Fahrenheit
	
	public void ConvertFahrenheitCelsius(double value) {
		double FCelsius = (value - 32) * ( 0.556 );
		FCelsius = (double)Math.round(FCelsius * 100d) /100 ;
		JOptionPane.showMessageDialog(null, "Son " + FCelsius + " Celsius");
	}
	public void ConvertFahrenheitKelvin(double value) {
		double FKelvin = (value + 459.67)*(0.556);
		FKelvin = (double)Math.round(FKelvin * 100d) /100 ;
		JOptionPane.showMessageDialog(null, "Son " + FKelvin + " Kelvin");
	}
	public void ConvertFahrenheitRankine(double value) {
		double FRankine = value + 459.67;
		FRankine = (double)Math.round(FRankine * 100d) /100 ;
		JOptionPane.showMessageDialog(null, "Son " + FRankine + " Rankine");
	}
	
	
	//KELVIN
	
	public void ConvertKelvinCelsius(double value) {
		double KCelsius = value - 273.15;
		KCelsius = (double)Math.round(KCelsius * 100d) /100 ;
		JOptionPane.showMessageDialog(null, "Son " + KCelsius + " Celsius");
	}
	public void ConvertKelvinFahrenheit(double value) {
		double KFahrenhit = ((value - 273.15) * (1.8)) + 32;
		KFahrenhit = (double)Math.round(KFahrenhit * 100d) /100 ;
		JOptionPane.showMessageDialog(null, "Son " + KFahrenhit + " Fahrenheit");
	}
	public void ConvertKelvinRankine(double value) {
		double KRankine = value * 1.8 ;
		KRankine = (double)Math.round(KRankine * 100d) /100 ;
		JOptionPane.showMessageDialog(null, "Son " + KRankine + " Rankine");
	}
	
	
	//Rankine
	
	public void ConvertRankineCelsius(double value) {
		double RCelsius = (value - 491.67) * (0.556);
		RCelsius = (double)Math.round(RCelsius * 100d) /100 ;
		JOptionPane.showMessageDialog(null, "Son " + RCelsius + " Celsius");
	}
	public void ConvertRankineFahrenheit(double value) {
		double RFahrenhit = value - 459.67;
		RFahrenhit = (double)Math.round(RFahrenhit * 100d) /100 ;
		JOptionPane.showMessageDialog(null, "Son " + RFahrenhit + " Fahrenheit");
	}
	public void ConvertRankineKelvin(double value) {
		double RKelvin = value * (0.556);
		RKelvin = (double)Math.round(RKelvin* 100d) /100 ;
		JOptionPane.showMessageDialog(null, "Son " + RKelvin + " Kelvin");
	}
	
}
