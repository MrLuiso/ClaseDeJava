package lecture2;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

import javax.swing.JComponent;

public class MyComponent extends JComponent {

	//Generated serial id
	private static final long serialVersionUID = 3568029827560390545L;

	public void paintComponent(Graphics g){
		
		Rectangle firstRectangle = new Rectangle(10, 10, 50, 50);
		
		Graphics2D g2 = (Graphics2D) g;
		
		g2.draw(firstRectangle);
	}
}
