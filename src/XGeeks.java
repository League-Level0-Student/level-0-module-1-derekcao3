//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0




import javax.swing.JOptionPane;

/*
* Everyone has a superpower. Mine is writing recipes. This program will store
* the superpowers of all the people in the classroom. E.g. When I type "June",
* your program should say "June's superpower is writing recipes".
*/
public class XGeeks {
public static void main(String[] args) {

String JacobpsPower = "making people salty";
String JacobjsPower = "teleportation";
String DereksPower = "god and anime";
String SanchithasPower = "mind-reader";
String KellersPower = "telekenesis";

String name = JOptionPane.showInputDialog("Enter a name");
if(name.equals("Jacobp")) {
	JOptionPane.showMessageDialog(null, "Your power is " +JacobpsPower);
	System.out.println("Your power is" +JacobpsPower);
}

if(name.equals("Jacobj")) {
	JOptionPane.showMessageDialog(null, "Your power is " +JacobjsPower);
	System.out.println("Your power is " +JacobjsPower);
}

if(name.equals("Keller")) {
	JOptionPane.showMessageDialog(null, "Your power is " +KellersPower);
	System.out.println("Your power is " +KellersPower);
}

if(name.equals("Sanchitha")) {
	JOptionPane.showMessageDialog(null, "Your power is " +SanchithasPower);
	System.out.println("Your power is " +SanchithasPower);
}

if(name.equals("Derek")) {
	JOptionPane.showMessageDialog(null, "Your power is " +DereksPower);
	System.out.println("Your power is " +DereksPower);
}
		// 1. Save the superpower for each person in a variable.

		// 2. Ask the user to enter a name. Store their answer in a variable.

		// 3. Show the superpower in a pop-up, depending on the name entered. 

}
}
