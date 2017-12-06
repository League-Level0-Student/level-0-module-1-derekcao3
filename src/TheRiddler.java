import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0



public class TheRiddler {

	public static void main(String[] args) {
		
	

		// 1. Make a variable to hold the score
		int score = 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
		String name= JOptionPane.showInputDialog("What word in the dictionary is spelled wrong");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
		if(name.equals("wrong")) {
			JOptionPane.showMessageDialog(null, "Correct");
			System.out.println("Correct");
			score =score+1; 
		}
		// 5. Otherwise, say "wrong" and tell them the answer
		else {
			JOptionPane.showMessageDialog(null, "Wrong");
			System.out.println("Wrong");
			}
		// 6. Add some more riddles
		
		// 2. Make a pop up to show the score.
		JOptionPane.showMessageDialog(null, "Score = " + score);
		System.out.println("Score" + score);
		
	}
}

