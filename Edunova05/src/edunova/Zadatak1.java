package edunova;

import javax.swing.JOptionPane;

public class Zadatak1 {
	
	// Program prima dva broja i ispisuje sve brojeve jedno ispod drugog
	// između dva primljena broja od manjeg prema većem
	
	public static void main(String[] args) {
		int a = Integer.parseInt(JOptionPane.showInputDialog("Unesi A"));
		int b = Integer.parseInt(JOptionPane.showInputDialog("Unesi B"));
		
		int min,max;
		
		if (a>b) {
			max=a;
			min=b;
		} else {
			max=b;
			min=a;
		}
		for (;min<=max;min++) {
			System.out.println(min);
		}
			
	
	}
	

}
