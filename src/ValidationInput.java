import javax.swing.JOptionPane;

public class ValidationInput {

	public static Double validation() {
		boolean allowConversion = false;
		Double given_quantity = 0.0;

		while (allowConversion == false) {
			try{
				String value = (String)JOptionPane.showInputDialog(null,"Please, insert the value:");
				given_quantity = Double.parseDouble(value);
				allowConversion = true;
			}
			catch(NumberFormatException exception) {
				JOptionPane.showMessageDialog(null, "Only numbers are allowed");
				System.out.println("Exception catched and treated");
			}
		}
		return given_quantity;
	}	
	
}
