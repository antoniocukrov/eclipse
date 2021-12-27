package ciklicki;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Ciklicki {
	public static void main(String[] args) {
		int a = Integer.parseInt(JOptionPane.showInputDialog("Unesi A"));
		int b = Integer.parseInt(JOptionPane.showInputDialog("Unesi B"));
		int cik[][] = new int[a][b];
		int aa = a;
		int bb = b;
		int krug = 0;
		int brojac = 0;
		while (brojac<=(aa*bb)) {
		for (; b > krug; b--) {
			cik[a - 1][b - 1] = ++brojac;
			if (brojac==(aa*bb)) {
				break;
				}
		}
		
		for (b++,a--; a>krug;a--){
			cik[a - 1][b - 1] = ++brojac;
			if (brojac==(aa*bb)) {
				break;
				}
		}
		
		for (a++,b++; b<=(bb-krug);++b) {
			cik[a - 1][b - 1] = ++brojac;
			if (brojac==(aa*bb)) {
				break;
				}
		}
		
		for(b--,a++;a<(aa-krug);++a) {
			cik[a - 1][b - 1] = ++brojac;
			if (brojac==(aa*bb)) {
				break;
				}
		}
		krug++;
		a--;
		b--;
		if (brojac==(aa*bb)) {
		break;
		}
		}
		
		
		for (int i = 0; i < aa; i++) {
			System.out.println(Arrays.toString(cik[i]));
		}

	}
}
