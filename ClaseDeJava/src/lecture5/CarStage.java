package lecture5;
import java.awt.Graphics;
import java.util.Random;

import javax.swing.JComponent;

public class CarStage extends JComponent {

	private static final long serialVersionUID = 1L;

	static int counter = 0;
	
	Vehicle[] vehicles;

	boolean onAWall = false;

	boolean someCarWon = false;
	
	Random randomNumbers = new Random();
	
	int height = this.getHeight();
	
	public CarStage(int height, Vehicle[] vehicles) {
		
		this.vehicles = new Vehicle[vehicles.length];
		
		int nextYPos = 0;
		for(int i = 0; i < vehicles.length; i++){
			
			vehicles[i].setPosition(0, nextYPos);
			
			this.vehicles[i] = vehicles[i];
			
			nextYPos += vehicles[i].getHeight() + 20;
			
		}
	}//Constructor

	public boolean someCarWon() { return someCarWon; }

	public void paintComponent (Graphics g) {

		
		for(Vehicle vehicle : vehicles){
			vehicle.draw(g);
			
			int deltaX = randomNumbers.nextInt(vehicle.getHorizontalSpeed());
			vehicle.moveInX(deltaX);
			if(vehicle.getXPos() + 60 >= this.getWidth()){
				//car hits wall
				vehicle.setPosition(this.getWidth() - 60, vehicle.getYPos());
				someCarWon = true;
			}
		}
		
		System.out.println(counter++);
		
	}//paintComponent
	
}//Class
