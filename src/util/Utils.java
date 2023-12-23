package util;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;

public class Utils {

	static NumberFormat numberformat = new DecimalFormat("RS #,##0.00", DecimalFormatSymbols(new Locale( "pt", "BR")));

	@SuppressWarnings("unused")
	public
	static String doubleToString(Double value) {
		return numberformat.format(value);
		
	}

	private static DecimalFormatSymbols DecimalFormatSymbols(Locale locale) {
		// TODO Auto-generated method stub
		return null;
	}
}
