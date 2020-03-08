package creational_factory;

public class shape_factory {
	public static Shape getshape(String shape) {
		if(shape.equals("rectangle")) {
			return new Rectangle();
		}
		else if(shape.equals("circle")) {
			return new Circle();
		}
		return null;
	}

}
