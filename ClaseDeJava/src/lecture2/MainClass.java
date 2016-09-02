package lecture2;

import javax.swing.JFrame;

public class MainClass {
	
	public static void main(String[] args) throws InterruptedException{
		
		JFrame frame = new JFrame();
		
		MyComponent theComponent = new MyComponent();
		
		
		frame.add(theComponent);
		
		
		
		frame.setSize(300, 400);
		frame.setTitle("Java Gurus");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		while(true){
			frame.repaint();
			Thread.sleep(1000);
		}
		
		
	}//main
	
}//class
