package edunova;

import javax.swing.JOptionPane;

public class Z01 {
	
	// Program unosi dva cijela broja
	// Ako je njihov zbroj paran broj ispisuje Osijek
	// inače ispisuje Zagreb

	
	public static void main(String[] args) {
		int a = Integer.parseInt(
				JOptionPane.showInputDialog("Unesi a")
				);
		int b = Integer.parseInt(
				JOptionPane.showInputDialog("Unesi b")
				);
		
		System.out.println(((a+b)%2)==0 ? "Osijek" : "Zagreb");
	}
}
