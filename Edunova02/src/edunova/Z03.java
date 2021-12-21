package edunova;

import javax.swing.JOptionPane;

public class Z03 {

	// Program unosi dvije logičke vrijednosti
	// u slučaju da su obje istinite ispisuje DA

	public static void main(String[] args) {
		boolean x = Boolean.parseBoolean(JOptionPane.showInputDialog("TRUE OR FALSE #1"));
		boolean y = Boolean.parseBoolean(JOptionPane.showInputDialog("TRUE OR FALSE #2"));
		
		System.out.println(x==true && y==true ? "DA" : "Nisu obje istinite");
	}

}
