package edunova;

import javax.swing.JOptionPane;

public class Zadatak5 {

	// Program učitava 5 cjelih brojeva
	// foreach petljom ispisuje sve učitane brojeve
	// ispisuje prosjek učitanih brojeva

	public static void main(String[] args) {
		int suma = 0;
		for (int n = 1; n < 6; n++) {
			int a = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj"));
			System.out.println("Broj " + n + ":  " +a);
			suma+=a;
		}
		System.out.println("Prosjek učitanih brojeva je: " + (float)suma/5);
	}

}
