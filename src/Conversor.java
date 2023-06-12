

import javax.swing.JOptionPane;
public class Conversor {

	public static void main(String[] args) {

		String[] options = {"Currency converter", "Temperature converter"};
		String converterRequiered = null;
		boolean keep_working = true;

		while (keep_working) {

			converterRequiered = (String)JOptionPane.showInputDialog(null, "Please, choose the type of converter you want to use.", 
					"Converter by Kevin Pucha", JOptionPane.PLAIN_MESSAGE, null /* this is the icon */, options /* the options that you want to display*/, options[/*option you want to display by default*/0]);
			Double given_quantity = ValidationInput.validation();	
			
			if(converterRequiered == "Currency converter") { // for the moment it doen't move				

				currencies currencies = new currencies();

				String[] currencyOptions = {"From Dollars to Euros","From Dollars to Venezuelan Bolivars","From Dollars to Hong Kong Dollars","From Euros to Dollars","From Venezuelan Bolivars to Dollars","From Hong Kong Dollars to Dollars"};
				//String[] currencyOptions = {"Dollars","Euros","Venezuelan Bolivars","Hong Kong Dollars"};
				String optionSelected1 = (String)JOptionPane.showInputDialog(null, "Please, choose the lead currency:", 
						"Converter by Kevin Pucha", JOptionPane.PLAIN_MESSAGE,null,currencyOptions, currencyOptions[0]);

				switch(optionSelected1) {
				case "From Dollars to Euros":
					currencies.fromDollarsToEuros(given_quantity);
					break;

				case "From Dollars to Venezuelan Bolivars":
					currencies.fromDollarsToVenezuelanBolivars(given_quantity);
					break;

				case "From Dollars to Hong Kong Dollars":
					currencies.fromDollarsToHongKongDollars(given_quantity);
					break;

				case "From Euros to Dollar":
					currencies.fromEurosToDollars(given_quantity);
					break;

				case "From Venezuelan Bolivars to Dollars":
					currencies.fromVenezuelanBolivarsToDollars(given_quantity);
					break;

				case "From Hong Kong Dollars to Dollars":
					currencies.fromHongKongDollarsToDollars(given_quantity);
					break;	

				}	




				//				if (optionSelected1 == "From Dollars to Euros") {
				//					//				boolean allowConversion = false;
				//					JOptionPane.showMessageDialog(null, given_quantity*0.95);

				//			}

				//			else if(optionSelected == "From Dollars to Venezuelan Bolivars") {
				//				boolean allowConversion = false;
				//
				//				Double given_quantity = null;
				//
				//				while (allowConversion == false) {
				//					try{
				//						String value = (String)JOptionPane.showInputDialog(null,"Please, insert the value:");
				//						given_quantity = Double.parseDouble(value);
				//						allowConversion = true;
				//						//System.out.println(given_quantity);
				//					}
				//					catch(NumberFormatException exception) {
				//						//exception.getStackTrace();
				//						JOptionPane.showMessageDialog(null, "Only numbers are allowed");
				//						System.out.println("Catched exception and treated");
				//					}
				//				}		
				//				JOptionPane.showMessageDialog(null, given_quantity*2394543.39);        
				//			}

				//}

			}
			else {
				String[] temperatureOptions = {"From Celcius to Fahrenheit","From Celcius to Kelvin","From Kelvin to Celcius","From Kelvin to Fahrenheit","From Fahrenheit to Celsius","From Fahrenheit to Kelvin"};
				String optionSelected = (String)JOptionPane.showInputDialog(null, "Please, choose one of the options.", 
						"Converter by Kevin Pucha", JOptionPane.PLAIN_MESSAGE,null,temperatureOptions, temperatureOptions[0]);
				temperatures temperatures = new temperatures();
				
				switch(optionSelected) {
				case "From Celcius to Fahrenheit":
					temperatures.fromCelciusToFahrenheit(given_quantity);
					break;
				case "From Celcius to Kelvin":
					temperatures.fromCelciusToKelvin(given_quantity);
					break;
				case "From Kelvin to Celcius":
					temperatures.fromKelvinToCelcius(given_quantity);
					break;
				case "From Kelvin to Fahrenheit":
					temperatures.fromKelvinToFahrenheit(given_quantity);
					break;
				case "From Fahrenheit to Celsius":
					temperatures.fromFahrenheitToCelcius(given_quantity);
					break;
				case "From Fahrenheit to Kelvin":
					temperatures.fromFahrenheitToKelvin(given_quantity);
					break;
				}
				
			}
			
			int aux = JOptionPane.showConfirmDialog(null, "Would you like to continue?");
			if(aux == 0) {
				keep_working = true;
			} else {
				keep_working = false;
			}
		}

		JOptionPane.showMessageDialog(null, "Thanks for using our conversor!");

	}


}