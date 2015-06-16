/* Derrick Fox
 * CS 213 31015
 * TestPieChart1.java 
 * April 19th, 2014
 * TestPieChart1 Class -- Main Method Class
 */

import javax.swing.JFrame;

// This class tests the PieChart1 class
public class TestPieChart1 {
	public static void main(String[] args) {
		PieChart1 frame = new PieChart1();
		frame.setSize(330, 300);
		frame.setLocationRelativeTo(null); // Center the frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		}
}
