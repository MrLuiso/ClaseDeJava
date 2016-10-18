package lecture5;
import java.awt.Color;
import java.awt.Graphics;

public abstract class Vehicle {

	private double xPos = 0;
	private double yPos = 0;
	private Color color = Color.BLACK;
	private int number = 0;

	private int horizontalSpeed = 0;  // Car speed in pixels per second
	private int horizontalDirection;


	public Color getColor() {
		return this.color;
	}

	public double getXPos() {
		return this.xPos;
	}
	public double getYPos() {
		return this.yPos;
	}

	public int getHorizontalSpeed() {
		return horizontalSpeed;
	}

	public int getHorizontalDirection() {
		return horizontalDirection;
	}
	
	public int getNumber(){
		return this.number;
	}

	public void setPosition(double xPos, double yPos) {
		this.xPos = xPos;
		this.yPos = yPos;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public void setHorizontalSpeed(int horizontalSpeed) {
		this.horizontalSpeed = horizontalSpeed;
	}

	public void setHorizontalDirection(int horizontalDirection) {
		this.horizontalDirection = horizontalDirection;
	}
	
	public void setNumber(int number){
		this.number = number;
	}
	
	public void moveInX(double deltaX){
		this.xPos += deltaX;
	}
	
	public void moveInY(double deltaY){
		this.yPos += deltaY;
	}
	
	public abstract int getHeight();

	public abstract void draw(Graphics g);
	
}