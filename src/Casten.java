
public class Casten {

	public static void main(String[] args) {
		
		/*
		 * Was ist eine Typumwandlung / Casten ?
		 * 
		 * Das ist eine Umwandlung von einem Datentyp in einen anderen Datentypen
		 */

		
		/*
		 *   byte > short > int > long > float > double
		 *    1b     2b      4b    8b     4b      8b
		 */
		
		// explizites Casten
		int userAlter = (int)18.5;
		System.out.println(userAlter);

		/**
		 *  Implizites Casten (von klein nach groß)
		 *  	Keine Datenverluste
		 *   	Umwandlung findet bei Zuweisung statt
		 */
		int zahl1 = 30;
		double zahl2 = zahl1;
		System.out.println(zahl2);
		
		/**
		 *  Explizites Casten (von groß nach klein)
		 *  	Datenverluste
		 *  	Umwandlung findet mit Hilfe des cast (Datentyp)-Operators statt
		 */
		
		// 1. Auto = 3450,45 €   2. Auto = 2690,94 €
		int autoPreis1 = (int)3450.45;
		int autoPreis2 = (int)2690.94;
		
		int gesamtPreis = autoPreis1 + autoPreis2;
		
		System.out.println(autoPreis1);
		System.out.println(autoPreis2);
		System.out.println(gesamtPreis);
		
	}

}
