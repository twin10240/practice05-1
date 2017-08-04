package prob6;

import java.util.ArrayList;
import java.util.List;

public class ShapeTest {
	public static void main(String[] args) {
		List<Shape> shapeList = new ArrayList<Shape>();
		
		shapeList.add(new Rectangle(5, 6));
		shapeList.add(new RectTriangle(6, 2));
		
		for (Shape s : shapeList) {
			System.out.println("area : " + s.getArea());
			System.out.println("perimeter : " + s.getPerimeter());
			
			if (s instanceof Resizable) {
				((Resizable) s).resize(0.5);
				
				System.out.println("area : " + s.getArea());
				System.out.println("perimeter : " + s.getPerimeter());
			}
		}
	}
}