package edunova;

import javax.swing.JOptionPane;

public class Z02 {

	// Program unosi 3 cijela broja i ispisuje najmanji
	public static void main(String[] args) {
		
	
	int a = Integer.parseInt(
			JOptionPane.showInputDialog("Unesi a")
			);
	int b = Integer.parseInt(
			JOptionPane.showInputDialog("Unesi b")
			);
	int c = Integer.parseInt(
			JOptionPane.showInputDialog("Unesi c")
			);
	
	System.out.println(a<=b && a <= c ? a : (b<=a && b<=c ? b:c) );

	}	
}
