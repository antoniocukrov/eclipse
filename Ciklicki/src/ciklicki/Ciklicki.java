package ciklicki;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Ciklicki {
	public static void main(String[] args) {
		int a = Integer.parseInt(JOptionPane.showInputDialog("Unesi A"));
		int b = Integer.parseInt(JOptionPane.showInputDialog("Unesi B"));
		int cik[][] = new int[a][b];
		
		//cik[a-1][b-1] = 1;
		
		
	
		for (int i=0;i<a;i++) {
		System.out.println(Arrays.toString(cik[i]));
		}
		
		
		
		
		
	}
}
