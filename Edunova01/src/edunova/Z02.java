package edunova;

import javax.swing.JOptionPane;

public class Z02 {
	
	// Program učitava Dužinu i širinu prostoriju
	// Program ispisuje kvadraturu prostorije

	
	public static void main(String[] args) {
		double a = Double.parseDouble (
				JOptionPane.showInputDialog("Unesi širinu")
				);
		double b = Double.parseDouble(
				JOptionPane.showInputDialog("Unesi dužinu")
				);
		System.out.println("Kvadratura prostorije je " + (a*b));
		
	}
}
