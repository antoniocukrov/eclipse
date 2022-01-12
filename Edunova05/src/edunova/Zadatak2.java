package edunova;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Zadatak2 {

	// Program prima jedan broj i ispisuje sve parne brojeve
	// od primljenog broja do broja 2 jedno pokraj drugog odvojeno zarezom.
	// Zadnji zarez se ne ispisuje
	
	public static void main(String[] args) {
		int a = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj"));
		int x = 0;
		if (a%2==1) {
			a--;
		}
		int duzinareda = a/2;
		int red[] = new int[duzinareda];
		
		for (;x<duzinareda;x++) {
		red[x]=a;
		a=a-2;
		}
		
		System.out.println(Arrays.toString(red));

		

	}
}
