package prob6;

public class Rectangle extends Shape implements Resizable {

	public Rectangle(double width, double height) {
		super(width, height);
	}

	@Override
	double getArea() {
		return getWidth() * getHeight();
	}

	@Override
	double getPerimeter() {
		return (getWidth() + getHeight()) * 2;
	}

	@Override
	public void resize(double s) {
		setWidth(getWidth() * s);
		setHeight(getHeight() * s);
	}

}
