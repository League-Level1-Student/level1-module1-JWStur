package _04_popcorn;

import javax.swing.JOptionPane;

public class PopcornRunner {
	public static void main(String[] args) {
		Microwave Microwave = new Microwave();
		String thingToBeCooked = JOptionPane.showInputDialog("what do you want to cook?");
		Microwave.putInMicrowave(Popcorn, thingToBeCooked);
		
	}
}
