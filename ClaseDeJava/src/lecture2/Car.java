package lecture2;


import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;

import javax.swing.JComponent;

public class Car extends JComponent {
	
	 
	private static final long serialVersionUID = -5919543273317942769L;
	
	
	@Override
	public void paintComponent(Graphics g){
		
		Ellipse2D.Double rearTire = new Ellipse2D.Double(10, 20, 10, 10);
		
		Ellipse2D.Double frontTire = new Ellipse2D.Double(40, 20, 10, 10);
		
		Rectangle rectangle = new Rectangle(10, 10, 60, 10);
		
		Graphics2D g2 = (Graphics2D) g;
		
		g2.draw(frontTire);
		g2.draw(rearTire);
		
		
	}
	
	
	
	
	

}
