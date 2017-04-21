package br.sceweb.modelo;
import java.util.Locale;
import org.apache.log4j.Logger;
import org.joda.time.DateTime;

public class ManipulaDatas {
	public static void main(String[] args) {
		Logger logger = Logger.getLogger(ManipulaDatas.class);
		DateTime dateTime = new DateTime();
		// Imprimindo a data no formato YYYY-MM-dd
		System.out.println("dateTime.toString() = " + dateTime.toString("YYYY-MM-dd"));
		// Imprimindo a data no formato YYYY-MM-dd HH:mm:ss
		System.out.println("dateTime.toString() = " + dateTime.toString("YYYY-MM-dd HH:mm:ss"));
		// Imprimindo o mês
		System.out.println("dateTime.toString() = " + dateTime.monthOfYear().getAsText());
		// Imprimindo o mês
		System.out.println("dateTime.toString() = " + dateTime.monthOfYear().getAsShortText());
		// Imprimindo o mês em Inglês
		System.out.println("dateTime.toString() = " + dateTime.monthOfYear().getAsText(Locale.ENGLISH));
		logger.info("dateTime.toString() = " + dateTime.monthOfYear().getAsText(Locale.ENGLISH));
	}
}
