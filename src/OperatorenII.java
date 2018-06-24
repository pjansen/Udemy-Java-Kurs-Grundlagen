
public class OperatorenII {

	public static void main(String[] args) {

		int lebenGegner = 0;
		boolean hit = false;
		
		int a = 3;
		int b = 3;
		boolean c;
		
		c = a < b;
		System.out.println(c);
		
		if (lebenGegner == 0 || hit == true) {
			System.out.println("Gegner zerstört");
		} else {
			System.out.println("Gegner hat noch " + lebenGegner + " Punkte!");
		}
		
	}

}
