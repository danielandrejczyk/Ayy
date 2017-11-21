import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JFrame;

//Step 1: Display a blank window

public class Main extends Canvas {

	Dimension screenSize = new Dimension(500, 500);

	Main(){

		JFrame frame = new JFrame("Box Test"); //Title in parenthesis
		frame.setLayout(new FlowLayout());
		frame.setSize(screenSize);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}	
}
