package lecture3;
import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

import javax.swing.JComponent;

public class MyComponent extends JComponent {
	
	private static final long serialVersionUID = 1L;
	
	static int counter = 0;
	
	public void paintComponent (Graphics g) {
		
		MutableCar bottomRightCar = new MutableCar(getWidth()-60,getHeight()-30, Color.CYAN);
//		MutableCar bottomLeftCar = new MutableCar(0,getHeight()-30);
//		MutableCar topRightCar = new MutableCar(getWidth()-60,0);
//		MutableCar topLeftCar = new MutableCar(0,0);
		
		bottomRightCar.setColor(Color.GREEN);
		bottomRightCar.draw(g);
		bottomRightCar.setPosition(0,getHeight()-30);
		bottomRightCar.setColor(Color.BLUE);
		bottomRightCar.draw(g);
		bottomRightCar.setPosition(getWidth()-60,0);
		bottomRightCar.setColor(Color.RED);
		bottomRightCar.draw(g);
		bottomRightCar.setPosition(0,0);
		bottomRightCar.setColor(Color.ORANGE);
		bottomRightCar.draw(g);
		
		Random r = new Random();
		bottomRightCar.setPosition(r.nextInt(getWidth()), r.nextInt(getHeight()));
		bottomRightCar.setColor(Color.MAGENTA);
		bottomRightCar.draw(g);
		
		
		System.out.println(counter++);
	}
}
