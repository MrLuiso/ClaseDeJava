package lecture2;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JComponent;

public class MyComponent extends JComponent {

	//Generated serial id
	private static final long serialVersionUID = 3568029827560390545L;

	@Override
	public void paintComponent(Graphics g){
		
		
		MutableCar firstCar = new MutableCar(getWidth()-60, getHeight() - 30, Color.BLUE);
//		Car bottomLeftCar = new Car(0, getHeight() - 30);
//		Car topLeftCar	= new Car(0, 0);
//		Car topRightCar = new Car(getWidth() - 60, 0);
		
		firstCar.draw(g);
		firstCar.setPosition(0, getHeight() - 30);
		firstCar.draw(g);
		firstCar.setPosition(getWidth()-60,0);
		firstCar.draw(g);
		firstCar.setPosition(0,0);
		firstCar.draw(g);
		
		
		
	}
}
