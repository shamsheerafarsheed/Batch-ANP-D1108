package Date_Number_CurrencyDemo;
//java working with Date,Number and Currency formatting -->by using  java classes like java.text and java.time
import java.text.NumberFormat;
import java.util.Locale;

public class CurrencyFormattingDemo {

	public static void main(String[] args) {
		double amount=2345.56;
		NumberFormat currencyFormatter=NumberFormat.getNumberInstance(Locale.US);
		String FormattedCurrencyr=currencyFormatter.format(amount);
		System.out.println("Formatted Currency is:"+FormattedCurrencyr);
		//for indian Number Format
		NumberFormat indianCurrencyformatter=NumberFormat.getCurrencyInstance(new Locale("en","IN"));
		System.out.println("Formatted Currency(india) is:"+indianCurrencyformatter.format(amount));
	}

}
