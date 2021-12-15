package edunova;

import javax.swing.JOptionPane;

public class Z03 {
	
	//Susjed kopa septičku jamu. Traži tebe da mu osiguraš odvoz zemlje.
	//Napiši program koji za unesene podatke izračunava koliko
	//kubika zemlje treba odvesti.

	public static void main(String[] args) {
		double a = Double.parseDouble(
				JOptionPane.showInputDialog("Unesi širinu")
				);
		double b = Double.parseDouble(
				JOptionPane.showInputDialog("Unesi dužinu")
				);
		double c = Double.parseDouble(
				JOptionPane.showInputDialog("Unesi dubinu")
				);
	System.out.println("Imaš " + (a*b*c) + " kubika zemlje.");
	}
	
}
