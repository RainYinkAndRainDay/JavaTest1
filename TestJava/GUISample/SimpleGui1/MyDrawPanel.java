package SimpleGui1;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.*;

public class MyDrawPanel extends JPanel{
	JFrame frame;
	public void paintComponent(Graphics g) {
		g.setColor(Color.orange);
		g.fillRect(20, 50, 100, 100);
//		Graphics2D g2d = g;
//		GradientPaint gradient = new GradientPaint(70, 70, Color.BLUE, 150, 150, Color.orange);
//		g2d.setPaint(gradient);
//		g2d.fillOval(70, 70, 100, 100);
	}
	
	public static void main(String [] args) {
		
		MyDrawPanel gui = new MyDrawPanel();
		gui.go();
		
	}
	
	public void go() {

		frame = new JFrame();
		JButton button = new JButton("click button");
		button.addActionListener((ActionListener) this);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 300);
		frame.getContentPane().add(BorderLayout.CENTER,button);
		frame.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent event) {
		frame.repaint();
	}
}
