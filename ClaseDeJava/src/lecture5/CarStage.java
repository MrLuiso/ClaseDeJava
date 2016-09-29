package lecture5;
import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

import javax.swing.JComponent;

public class CarStage extends JComponent {

	private static final long serialVersionUID = 1L;

	static int counter = 0;
	
	MutableCar[] cars;

	boolean onAWall = false;

	boolean someCarWon = false;
	
	Random randomNumbers = new Random();
	
	int height = this.getHeight();
	
	public CarStage(int height) {
		int laneHeight = 50;
		int numberOfLanes = Math.round( height / laneHeight);
		
		cars = new MutableCar[numberOfLanes];
		int nextYPos = 0;
		for(int i = 0; i < numberOfLanes; i++){
			cars[i] = new MutableCar(0, nextYPos, Color.ORANGE, 10, 1, i);
			nextYPos += laneHeight;
			
		}
	}//Constructor

	public boolean someCarWon() { return someCarWon; }

	public void paintComponent (Graphics g) {

		
		for(MutableCar car : cars){
			car.draw(g);
			
			int deltaX = randomNumbers.nextInt(car.getHorizontalSpeed());
			car.moveInX(deltaX);
			if(car.getXPos() + 60 >= this.getWidth()){
				//car hits wall
				car.setPosition(this.getWidth() - 60, car.getYPos());
				someCarWon = true;
			}
		}
		
		System.out.println(counter++);
		
	}//paintComponent
	
}//Class
