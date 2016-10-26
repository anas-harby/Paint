package paint.geom;


import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;

public class EllipsePaint extends ShapePaint {
	/**
	 * Javafx 2D graphics drawing ellipse
	 * class.
	 */
	private Ellipse ellipse;

	public EllipsePaint(Point center, double a, double b) {
		ellipse = new Ellipse(center.getX(), center.getY(), a, b);
		fill(Color.TRANSPARENT);
		setColor(Color.BLACK);
	}

	public void rotate(double angle) {
		ellipse.setRotate(angle);
	}

	@Override
	public void draw(Pane contentPane) {
		contentPane.getChildren().add(ellipse);
	}

	@Override
	public void fill(Color col) {
		ellipse.setFill(col);
	}

	@Override
	public void setColor(Color col) {
		ellipse.setStroke(col);
	}
}
