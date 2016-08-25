package lecture2;


import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

import javax.swing.JComponent;

public class CarDraw extends JComponent {
	
	 
	private static final long serialVersionUID = -5919543273317942769L;
	
	
	@Override
	public void paintComponent(Graphics g){
		
		Point2D.Double rearWindowStart = new Point2D.Double(20, 20);
		Point2D.Double rearWindowEnd = new Point2D.Double(30, 10);
		Line2D.Double rearWindow  = new Line2D.Double(rearWindowStart, rearWindowEnd);
		
		Point2D.Double frontWindowStart = new Point2D.Double(50, 10);
		Point2D.Double frontWindowEnd = new Point2D.Double(60, 20);
		Line2D.Double frontWindow  = new Line2D.Double(frontWindowStart, frontWindowEnd);
		
		Point2D.Double roofStart = new Point2D.Double(30, 10);
		Point2D.Double roofEnd = new Point2D.Double(50, 10);
		Line2D.Double roof  = new Line2D.Double(roofStart, roofEnd);
		
		
		
		
		Ellipse2D.Double rearTire = new Ellipse2D.Double(20, 30, 10, 10);
		
		Ellipse2D.Double frontTire = new Ellipse2D.Double(50, 30, 10, 10);
		
		Rectangle body = new Rectangle(10, 20, 60, 10);
		
		Graphics2D g2 = (Graphics2D) g;
		
		g2.draw(frontTire);
		g2.draw(rearTire);
		g2.draw(body);
		
		g2.draw(rearWindow);
		g2.draw(frontWindow);
		g2.draw(roof);
		
	}
	
	
	
	
	

}