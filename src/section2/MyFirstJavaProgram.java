package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		
		// START HERE
	Robot Leo = new Robot();
	Leo.setSpeed(30);
	Leo.penDown();
	Leo.setPenColor(Color.BLUE);
	Leo.setPenWidth(40);
	for(int lines =0; lines < 4; lines +=1 ) {
	
		Leo.move(150);
		Leo.turn(90);
	
	}
	Leo.move(100);
	Leo.turn(-90);
	//My Robot
	}
}
