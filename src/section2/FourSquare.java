package section2;

import java.awt.Color;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class FourSquare {
	
	// 2. Create a new Robot
	Robot rob = new Robot();
	void go() {
		// 4. Make the robot move as fast as possible
		rob.setSpeed(30);
		// 5. Set the pen width to 5
		rob.setPenWidth(5);
		// 6. Use a for loop to repeat steps #7 to #8, four times...
		for(int lines =0; lines <4; lines ++) {
			// 7. Set the pen color to random
			rob.setRandomPenColor();
			// 1. Call the drawSquare() method
			drawSquare();
			// 8. Turn the robot 90 degrees to the right
			rob.turn(90);
			}
	}

	
	void drawSquare(){
		JOptionPane.showMessageDialog(null, "yay! you called the drawSquare() method!");
		/* 3. Fill in the code to draw a square inside the method below. */
		
		for(int lines =0; lines <4; lines ++) {
			
			
			
			rob.penDown();
			rob.move(150);
			rob.turn(90);
		}	
			
	}	
	

	public static void main(String[] args) {
		new FourSquare().go();
	}

}



