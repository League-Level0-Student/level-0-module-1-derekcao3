import javax.swing.JOptionPane;

public class GiftFinder {
public static void main(String[] args) {
	String kellersGift = "MacBook Air";
	String jacobsGift = "gamestop giftcard";
	String cooljacobsGift = "Jake Paul merch";
	String dereksGift = "featured in Logan Paul's vlog";
	String sanchithasGift = "macbook";
	
	String input = JOptionPane.showInputDialog("Enter a name");
	if(input.equals("cool jacob")) {
		JOptionPane.showMessageDialog(null, "You get " + cooljacobsGift);
	}
			if(input.equals("jacob")) {
		JOptionPane.showMessageDialog(null, "You get " + jacobsGift );
	}
	
			if(input.equals("derek")) {
			JOptionPane.showMessageDialog(null, "You get " + dereksGift);
	}
			if(input.equals("keller")) {
			JOptionPane.showMessageDialog(null, "You get " + kellersGift);
	}	
			if(input.equals("sanchitha")) {
				JOptionPane.showMessageDialog(null, "You get " + sanchithasGift);
		}	
}
}

