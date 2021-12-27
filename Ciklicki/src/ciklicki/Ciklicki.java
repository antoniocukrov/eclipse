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
		while (brojac <= (aa * bb)) {
			for (; b > krug; b--) {
				if (brojac == (aa * bb)) {
					break;
				}
				cik[a - 1][b - 1] = ++brojac;
			}

			for (b++, a--; a > krug; a--) {
				if (brojac == (aa * bb)) {
					break;
				}
				cik[a - 1][b - 1] = ++brojac;

			}

			for (a++, b++; b <= (bb - krug); ++b) {
				if (brojac == (aa * bb)) {
					break;
				}
				cik[a - 1][b - 1] = ++brojac;

			}

			for (b--, a++; a < (aa - krug); ++a) {
				if (brojac == (aa * bb)) {
					break;
				}
				cik[a - 1][b - 1] = ++brojac;
			}
			krug++;
			a--;
			b--;
			if (brojac == (aa * bb)) {
				break;
			}
		}

		for (int i = 0; i < aa; i++) {
			System.out.println(Arrays.toString(cik[i]));
		}

	}
}
