package lecture2;

import java.awt.Graphics;


import javax.swing.JComponent;

public class MyComponent extends JComponent {

	//Generated serial id
	private static final long serialVersionUID = 3568029827560390545L;

	@Override
	public void paintComponent(Graphics g){
		
		
		Car firstCar = new Car(getWidth()-60, getHeight()-30);
		
		firstCar.draw(g);
		
		
	}
}
