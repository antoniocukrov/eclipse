package edunova;

import javax.swing.JOptionPane;

public class Zadatak2 {
	
	// Za upisani cijeli broj ispisati samo prvu znamenku
	// 15262 -> 1
	// 874 -> 8
	
	public static void main(String[] args) {
		int a = Integer.parseInt(JOptionPane.showInputDialog("Unesi a"));
		int b = a;
		if (a>10) {
		do {
			a=a/10;
			}while (a>10);
		System.out.println(a);
		} else System.out.println(a);
	
		System.out.println(b%10);
	} 
	
	// podzadatak: Ispisati broj na mjestu jedinice (zadnji broj)
	// 15262 -> 2
	// 874 -> 4

}
