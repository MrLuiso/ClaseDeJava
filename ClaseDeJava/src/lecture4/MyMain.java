package lecture4;
import javax.swing.JFrame;

public class MyMain
{
	public static void main(String[] args) throws InterruptedException
	{
		JFrame frame = new JFrame();
		
		MyComponent theComponent = new MyComponent();
		
		frame.add(theComponent);
		
		frame.setSize(300, 400);
		frame.setTitle("CIIC 4010 / ICOM 4015 Developers");	
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		while(true) {
			frame.repaint();
			Thread.sleep(1000);
		}
	}
}
