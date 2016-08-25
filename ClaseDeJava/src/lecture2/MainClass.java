package lecture2;

import javax.swing.JFrame;

public class MainClass {
	
	public static void main(String[] args){
		
		JFrame frame = new JFrame();
		
		MyComponent theComponent = new MyComponent();
		
		Car myCar = new Car();
		
		frame.add(theComponent);
		frame.add(myCar);
		
		frame.setSize(300, 400);
		frame.setTitle("Java Gurus");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		
		
	}

}
