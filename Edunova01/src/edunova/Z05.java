package edunova;

import javax.swing.JOptionPane;

public class Z05 {
	
	//Program učitava od korisnika cijeli broj između 10 i 20.
	//Program ispisuje jedinični dio upisanog broja
	
	public static void main(String[] args) {
		
		int x = Integer.parseInt(
				JOptionPane.showInputDialog("Unesi broj od 10 do 20") //Učitavaš cijeli broj od korisnika ovdje (na ovaj način, jer nismo još radili if)
				);
		
		int y = x%10; //od x tražiš modul 10 jer želiš da maknit desetice iz broja i da ti ostanu samo jedinice
		
			System.out.println(y); //bit zadatka je da skužimo ovaj modul % jer ćemo ga koristit vjv pun k...
	}


}
