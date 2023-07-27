package ConversorMoneda;

import javax.swing.JOptionPane;

import javax.swing.JFrame;

public class ConvertMon {
	
	//CONVERSIÓN DE PESOS DOMINICANOS A MONEDAS EXTRANJERAS
	
	public void pesosDom_dolar(double value) {
		double monDolar = value / 55.96;
		monDolar = (double)Math.round(monDolar * 1000) / 100;
		JOptionPane.showMessageDialog(null, "La cantidad corresponde a "
				+ monDolar + " dólares.");
	}
	
	public void pesosDom_euro(double value) {
		double monEuro = value / 62.13;
		monEuro = (double)Math.round(monEuro * 1000) / 100;
		JOptionPane.showMessageDialog(null, "La cantidad corresponde a "
				+ monEuro + " euros.");
	}
	
	public void pesosDom_libra(double value) {
		double monLibra = value / 72.54;
		monLibra = (double)Math.round(monLibra * 1000) / 100;
		JOptionPane.showMessageDialog(null, "La cantidad corresponde a "
				+ monLibra + " libras esterlinas.");
	}
	
	public void pesosDom_yen(double value) {
		double monYen = value / 0.40;
		monYen = (double)Math.round(monYen * 1000) / 100;
		JOptionPane.showMessageDialog(null, "La cantidad corresponde a "
				+ monYen + " yen japonés.");
	}
	
	public void pesosDom_won(double value) {
		double monWon = value / 0.0438;
		monWon = (double)Math.round(monWon * 1000) / 100;
		JOptionPane.showMessageDialog(null, "La cantidad corresponde a "
				+ monWon + " won surcoreano.");
	}
	
	
	//CONVERSIÓN DE MONEDAS EXTRANJERAS A PESOS DOMINICANOS
	
	public void dolar_pesosDom(double value) {
		double monDolar = 55.96 * value;
		monDolar = (double)Math.round(monDolar * 100d) / 100;
		JOptionPane.showMessageDialog(null, "La cantidad corresponde a "
				+ monDolar + " pesos dominicanos.");
	}
	
	public void euro_pesosDom(double value) {
		double monEuro = 62.13 * value;
		monEuro = (double)Math.round(monEuro * 100d) / 100;
		JOptionPane.showMessageDialog(null, "La cantidad corresponde a "
				+ monEuro + " pesos dominicanos.");
	}
	
	public void libra_pesosDom(double value) {
		double monLibra = 72.54 * value;
		monLibra = (double)Math.round(monLibra * 100d) / 100;
		JOptionPane.showMessageDialog(null, "La cantidad corresponde a "
				+ monLibra + " pesos dominicanos.");
	}
	
	public void yen_pesosDom(double value) {
		double monYen = 0.40 * value;
		monYen = (double)Math.round(monYen * 100d) / 100;
		JOptionPane.showMessageDialog(null, "La cantidad corresponde a "
				+ monYen + " pesos dominicanos.");
	}
	
	public void won_pesosDom(double value) {
		double monWon = 0.0438 * value;
		monWon = (double)Math.round(monWon * 100d) / 100;
		JOptionPane.showMessageDialog(null, "La cantidad corresponde a "
				+ monWon + " pesos dominicanos.");
	}
	

}
