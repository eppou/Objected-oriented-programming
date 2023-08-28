
public class Rectangle {
	private double width=1;
	private double length=1;
	
	public double getWidth() {
		return this.width;
	}
	
	public void setWidth(double width) {
		if (width > 0 && width < 20) {
			this.width = width;
		}
		else {
			System.out.println("valor para set invalido");
		}
	}
	
	public double getLength() {
		return this.length;
	}
	
	public void setLength(double length) {
		if (length > 0 && length < 20) {
			this.length = length;
		}
		else {
			System.out.println("valor para set invalido");
		}
	}
	
	public double calculatePerimeter() {
		double total = 2*this.length + 2*this.width;
		return total;
	}
	
	public double calculateArea() {
		double total = this.length*this.width;
		return total;
	}
}
