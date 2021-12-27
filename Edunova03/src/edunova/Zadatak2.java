package edunova;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Zadatak2 {
	
	// Program od korisnika traži unos dva cijela broja
	// S vrijednostima unesenih brojeva deklarirajte matricu
	
	// primjer: Čovjek unese 5 i 6, vi napravite matricu 5x6 
	
	public static void main(String[] args) {
		int a = Integer.parseInt(JOptionPane.showInputDialog("Unesi a"));
		int b = Integer.parseInt(JOptionPane.showInputDialog("Unesi b"));
		
		int[][] matrice = new int[a][b];
		
		
		for (int i=1;i<b;i++) { 
			System.out.println(Arrays.toString(matrice[i-1]));
			if (i==a) {
				break;
			}
		}
		
	
	}
}
