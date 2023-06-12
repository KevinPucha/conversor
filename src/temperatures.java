import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class temperatures {

	static DecimalFormat df = new DecimalFormat("###.##");
	
	public void fromCelciusToFahrenheit (double input) {
		double equivalence = 32;
		JOptionPane.showMessageDialog(null, df.format(input) + " Celcius is equivalent to "+df.format(input+equivalence)+" Farenheit.");
	}
	
	public void fromCelciusToKelvin (double input) {
		double equivalence = 273.15;
		JOptionPane.showMessageDialog(null, df.format(input) + " Celcius is equivalent to "+df.format(input+equivalence)+" Kelvin.");
	}
	
	public void fromKelvinToCelcius (double input) {
		double equivalence = -273.15;
		JOptionPane.showMessageDialog(null, df.format(input) + " Kelvin is equivalent to "+df.format(input+equivalence)+" Celcius.");
	}
	
	public void fromKelvinToFahrenheit (double input) {
		double equivalence = -459.67;
		JOptionPane.showMessageDialog(null, df.format(input) + " Kelvin is equivalent to "+df.format(input+equivalence)+" Fahrenheit.");
	}
	
	public void fromFahrenheitToCelcius (double input) {
		double equivalence = -17.7778;
		JOptionPane.showMessageDialog(null, df.format(input) + " Fahrenheit is equivalent to "+df.format(input+equivalence)+" Celcius.");
	}
	
	public void fromFahrenheitToKelvin (double input) {
		double equivalence = 255.372;
		JOptionPane.showMessageDialog(null, df.format(input) + " Fahrenheit is equivalent to "+df.format(input+equivalence)+" Kelvin.");
	}

}
