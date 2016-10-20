package lecture5;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MyMain {
	
	public static void main(String[] args) throws InterruptedException {
		
		JFrame frame = new JFrame();
		
		int windowWidth = 800;
		int windowHeight = 600;
		
		frame.setSize(windowWidth, windowHeight);
		
		Vehicle[] theVehicles = new Vehicle[10];
		
		for(int i = 0; i < theVehicles.length; i++){
			
			if(i == 0){
				theVehicles[i] = new PoliceCar(0, 0, Color.BLUE, 10, 1, i);
			} else if(i % 2 == 0){
				theVehicles[i] = new Truck(0, 0, Color.BLUE, 10, 1, i);
			} else {
				theVehicles[i] = new MutableCar(0, 0, Color.BLUE, 10, 1, i);
			}
			
		}
		
		CarStage theComponent = new CarStage(windowHeight, theVehicles);
		frame.add(theComponent);
		
		frame.setTitle("CIIC 4010 / ICOM 4015 Developers");	
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		while(!theComponent.someCarWon()) {
			frame.repaint();
			Thread.sleep(100);
		}
		
		JOptionPane.showMessageDialog(null, "END OF RACE");
		
		System.exit(0);
		
	}
}
