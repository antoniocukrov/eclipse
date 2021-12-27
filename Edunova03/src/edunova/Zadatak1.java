package edunova;

import javax.swing.JOptionPane;

public class Zadatak1 {

	// Program učitava 3 broja u niz
	// Ispisuje najveći
	// Ne smijete koristiti niti jednu drugu varijablu osim deklariranog niza

	public static void main(String[] args) {
		int[] brojevi = new int[3];
		brojevi[0] = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj"));
		brojevi[1] = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj"));
		brojevi[2] = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj"));

		System.out.println(brojevi[0] <= brojevi[1] && brojevi[0] <= brojevi[2] ? brojevi[0]
				: (brojevi[1] <= brojevi[0] && brojevi[1] <= brojevi[2] ? brojevi[1] : brojevi[2]));
	}
}
