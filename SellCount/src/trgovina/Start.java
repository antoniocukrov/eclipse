package trgovina;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTable;
import java.awt.BorderLayout;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import java.awt.CardLayout;

public class Start {

	private JFrame frmSellcount;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Start window = new Start();
					window.frmSellcount.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Start() {
		initialize();
	}

	
	private void initialize() {
		frmSellcount = new JFrame();
		frmSellcount.setTitle("SellCount");
		frmSellcount.setBounds(100, 100, 527, 608);
		frmSellcount.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSellcount.getContentPane().setLayout(new CardLayout(0, 0));
	}

}
