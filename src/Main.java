import java.awt.FlowLayout;

import javax.swing.JFrame;

//Step 1: Display a blank window

public class Main {

Main(){
		
		JFrame frame = new JFrame("Box Test"); //Title in parenthesis
		frame.setLayout(new FlowLayout());
		frame.setSize(500,500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}	
}
