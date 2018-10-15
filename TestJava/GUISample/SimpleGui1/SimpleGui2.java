package SimpleGui1;
import javax.swing.*;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics2D;

public class SimpleGui2{
	public static void main(String [] args) {
		
		JFrame frame = new JFrame();
		JButton button = new JButton("click me");
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(button);
		frame.setSize(300, 300);
		frame.setVisible(true);
		
	}
	
	public void paintComponent(Graphics2D g) {
		
		Graphics2D g2d = g;
		GradientPaint gradient = new GradientPaint(70, 70, Color.BLUE, 150, 150, Color.orange);
		g2d.setPaint(gradient);
		g2d.fillOval(70, 70, 100, 100);
	}
}
