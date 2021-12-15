package edunova;

import javax.swing.JOptionPane;

public class Z04 {
	
	//Program učitava od korisnika cijeli broj. 
	//Program ispisuje true ako je učitani broj paran 
	//ili false ako je učitani broj neparan.

	public static void main(String[] args) {
		int a = Integer.parseInt(
				JOptionPane.showInputDialog("Unesi cijeli broj")
				);
		int b = a%2;
		boolean c = b==0;
		System.out.println(c);
		
	}
	
	
}
