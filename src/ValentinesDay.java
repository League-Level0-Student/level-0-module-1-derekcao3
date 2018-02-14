import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class ValentinesDay {
public static void main(String[] args) {
	Robot Jacob = new Robot();
	Jacob.setWindowImage("xd.jpg");
	Jacob.miniaturize();
	Jacob.setSpeed(100);
	Jacob.setPenColor(Color.red);
	Jacob.setPenWidth(20);
	Jacob.penDown();
	/*Jacob.turn(45);
	Jacob.move(100);
	Jacob.setAngle(300);
	Jacob.move(30);
	Jacob.setAngle(250);
	Jacob.move(50);
	Jacob.setAngle(300);
	Jacob.move(43);
	Jacob.setAngle(235);
	Jacob.move(30);
	Jacob.setAngle(140);
	Jacob.move(100);
	Jacob.penUp();
	Jacob.move(100);
	Jacob.clear();*/
	for (int i = 0; i < 180; i++) {
		Jacob.move(1);
		Jacob.turn(360/360);
	}
	Jacob.setAngle(0);
	for (int i = 0; i < 180; i++) {
		Jacob.move(1);
		Jacob.turn(360/360);
	}
	Jacob.setAngle(225);
	Jacob.move(160);
	Jacob.setAngle(315);
	Jacob.move(160);
	Jacob.penUp();
	Jacob.move(200);
	
}
}
