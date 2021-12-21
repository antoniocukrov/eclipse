package edunova;

import javax.swing.JOptionPane;

public class Z04 {

	// Napišite program koji za danu širinu i dužinu igrališta ispisuje
	// koji se sportovi na tom igralištu mogu igrati
	// Sportovi se igraju na sljedećim površinama igrališta
	// Nogomet 6500 – 7000 m2
	// Rukomet 800 m2
	// Ragbi 7000 m2

	public static void main(String[] args) {
		double a = Double.parseDouble(JOptionPane.showInputDialog("Unesi širinu"));
		double b = Double.parseDouble(JOptionPane.showInputDialog("Unesi dužinu"));

		if ((a * b) >= 6500) {
			System.out.println("Nogomet");
		}
		if ((a * b) >= 800) {
			System.out.println("Rukomet");
		}
		if ((a * b) >= 7000) {
			System.out.println("Ragbi");
		}

	}
}
