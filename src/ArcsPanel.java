/* Derrick Fox
 * CS 213 31015
 * ArcsPanel.java 
 * April 19th, 2014
 * ArcsPanel Class
 */

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

// This class is a JPanel that generates a graphic of a pie chart
class ArcsPanel extends JPanel {
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		// Finds the center of the panel so that the center of the pie chart may be placed on top of it.
		int xCenter = getWidth() / 2;
		int yCenter = getHeight() / 2;
		int radius = (int)(Math.min(getWidth(), getHeight()) * 0.4);
		
		int x = xCenter - radius;
		int y = yCenter - radius;
		
		// Creates four labels 
		String projects = new String("Projects--20%");
		String quizzes = new String("Quizzes--10%");
		String midterm = new String("Midterm--30%");
		String finalexam = new String("Final--40%");
	
		// Creates section for "Projects".
		g.setColor(Color.RED);
		g.fillArc(x, y, 2 * radius, 2 * radius, 0, 72);
		g.setColor(Color.BLACK);
		g.drawString(projects, 233, 70);
		
		// Creates section for "Quizzes".
		g.setColor(Color.BLUE);
		g.fillArc(x, y, 2 * radius, 2 * radius, 72, 36);
		g.setColor(Color.BLACK);
		g.drawString(quizzes, 120, 18);
		
		// Creates section for "Midterms".
		g.setColor(Color.GREEN);
		g.fillArc(x, y, 2 * radius, 2 * radius, 108, 108);
		g.setColor(Color.BLACK);
		g.drawString(midterm, 7, 80);
		
		// Creates section for "Final".
		g.setColor(Color.ORANGE);
		g.fillArc(x, y, 2 * radius, 2 * radius, 216, 144);
		g.setColor(Color.BLACK);
		g.drawString(finalexam, 165, 230);
	}
}