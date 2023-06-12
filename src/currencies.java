import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class currencies {
	
	static DecimalFormat df = new DecimalFormat("###.##");
	public void fromDollarsToEuros(double input) {
		double equivalence = 0.92991;
		JOptionPane.showMessageDialog(null, df.format(input) + " Dollars is equivalent to "+df.format(input*equivalence)+" Euros.");
	}
	
	public void fromDollarsToVenezuelanBolivars(double input) {
		double equivalence = 2734066.59;
		JOptionPane.showMessageDialog(null, df.format(input) + " Dollars is equivalent to "+df.format(input*equivalence)+" Venezuelan Bolivars.");
	}
	
	public void fromDollarsToHongKongDollars(double input) {
		double equivalence = 7.83;
		JOptionPane.showMessageDialog(null, df.format(input) + " Dollars is equivalent to "+df.format(input*equivalence)+" Hong Kong Dollars.");
	}
	
	public void fromEurosToDollars(double input) {
		double equivalence = 1.08;
		JOptionPane.showMessageDialog(null, df.format(input) + " Euros is equivalent to "+df.format(input*equivalence)+" Dollars.");
	}
	
	public void fromVenezuelanBolivarsToDollars(double input) {
		double equivalence = 0.0000003647765;
		JOptionPane.showMessageDialog(null, df.format(input) + " Venezuelan Bolivars is equivalent to "+df.format(input*equivalence)+" Dollars.");
	}
	
	public void fromHongKongDollarsToDollars(double input) {
		double equivalence = 0.13;
		JOptionPane.showMessageDialog(null, df.format(input) + " Hong Kong Dollars is equivalent to "+df.format(input*equivalence)+" Dollars.");
	}
}
