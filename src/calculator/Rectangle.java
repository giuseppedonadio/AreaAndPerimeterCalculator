package calculator;

import java.text.NumberFormat;

public class Rectangle {
	private double width;
	private double length;
	
	//constructor
	public Rectangle(double width, double length) {
		this.width = width;
		this.length = length;
	}
	
	//methods
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	
	public double getPerimeter() {
		return 2 * width + 2 * length;
	}
	
	public double getArea() {
		return width * length;
	}
	
	public String perimeterFormatted() {
		NumberFormat numberPerimeter = NumberFormat.getNumberInstance();
		numberPerimeter.setMinimumFractionDigits(3);
		
		String resultPerimeter = numberPerimeter.format(getPerimeter());
		return resultPerimeter;
	}
	
	public String areaFormatted() {
		NumberFormat numberArea = NumberFormat.getNumberInstance();
		numberArea.setMinimumFractionDigits(3);
		
		String resultArea = numberArea.format(getArea());
		return resultArea;
	}
	
	
	

}
