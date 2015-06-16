/* Derrick Fox
 * CS 213 31015
 * PieChart1.java 
 * April 19th, 2014
 * PieChart1 Class
 */

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;

// Class that is a JFrame that adds a panel.
// This panel will allow for a graphic of a pie chart to be drawn and displayed. 
public class PieChart1 extends JFrame{
	public PieChart1() {
		setTitle("Pie Chart");
		add(new ArcsPanel());
	}
}