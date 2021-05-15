package _04_popcorn;

import javax.swing.JOptionPane;

public class PopcornRunner {
	public static void main(String[] args) {
		
		Microwave Microwave = new Microwave();
		String food = JOptionPane.showInputDialog("what flavor do you want the popcorn");
		Popcorn Popcorn = new Popcorn(food);
		String time = JOptionPane.showInputDialog("How long do you want to cook the " + food + " for?");
		int intTime = Integer.parseInt(time);
		Microwave.putInMicrowave(Popcorn);
		Microwave.setTime(intTime);
		Microwave.startMicrowave();
	}
} 
