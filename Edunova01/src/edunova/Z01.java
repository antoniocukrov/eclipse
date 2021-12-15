package edunova;

import javax.swing.JOptionPane;

public class Z01 {
	
	// Program učitava dva cijela broja i ispisuje njihovu razliku

		public static void main(String[] args) {
			int a = Integer.parseInt(
					JOptionPane.showInputDialog("Unesi a")
					);
			int b = Integer.parseInt(
					JOptionPane.showInputDialog("Unesi b")
					);
			
			System.out.println("Njihova razlika je " + (a-b) + ".");
		}
}
