package homework8;

public class Retangular extends Shape{
	private double width;
	private double height;
	
	public Retangular() {
		super();
	}

	public Retangular(String name, double width, double height) {
		super(name);
		this.width = width;
		this.height = height;
	}
	
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
	@Override
	void calculationArea() {
		// TODO Auto-generated method stub
		
	}
	
	
}
