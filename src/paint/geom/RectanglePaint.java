package paint.geom;


import javafx.scene.paint.Color;

public class RectanglePaint extends PolygonPaint {
	
	public RectanglePaint(Point upperLeft,
		double width, double height) {
			super(upperLeft,
				new Point(upperLeft.getX() + width
				, upperLeft.getY()),
				new Point(upperLeft.getX()
						, upperLeft.getY() - height),
				new Point(upperLeft.getX() + width,
								upperLeft.getY() - height));
		super.fill(Color.WHITE);
		super.setColor(Color.BLACK);
	}
	
	public RectanglePaint(Point upperLeft,
			Point lowerLeft, Point lowerRight, Point upperRight) {
		super(upperLeft, lowerLeft, lowerRight, upperRight);
	}
	
}
